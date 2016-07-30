package com.wjliuh.utls;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.google.common.base.CharMatcher;
import com.google.common.base.Strings;
import com.wjliuh.utils.annotations.NotNull;
import com.wjliuh.utils.annotations.Nullable;

public class Util {

	/** Whether the platform is Windows. */
	public static final boolean IS_WINDOWS;

	/** Whether the platform is Linux. */
	public static final boolean IS_LINUX;

	/** Whether the platform is Linux KDE. */
	public static final boolean IS_LINUX_KDE;

	/** Whether the operating system is Ubuntu and has the Unity desktop. */
	public static final boolean IS_UBUNTU_UNITY;

	/** Whether the platform is Mac OS X. */
	public static final boolean IS_MAC_OS_X;

	public static final boolean IS_64_BIT_JVM;

	/** The system's temporary directory. Does not contain backward slashes. */
	public static final File TEMP_DIR = new File(
			System.getProperty("java.io.tmpdir"));

	/** The current directory. Does not contain backward slashes. */
	public static final String USER_DIR_PATH = toForwardSlashes(System
			.getProperty("user.dir"));

	/** The current directory. */
	public static final File USER_DIR = new File(USER_DIR_PATH);

	/** The user's home directory. Does not contain backward slashes. */
	public static final String USER_HOME_PATH = System.getProperty("user.home");

	public static final CharMatcher fileSepMatcher = CharMatcher.anyOf("/\\")
			.precomputed();
	private static Pattern drivePattern = Pattern.compile("([a-zA-Z]):.*");
	private static Pattern driveOnlyPattern = Pattern
			.compile("(?:[a-zA-Z]):(?:\\\\|/)*");

	public static final String FS = System.getProperty("file.separator");
	public static final String LS = System.getProperty("line.separator");

	static {
		String osName = System.getProperty("os.name").toLowerCase();
		IS_WINDOWS = osName.contains("windows");
		IS_LINUX = osName.contains("linux");
		IS_UBUNTU_UNITY = isUbuntuUnity(IS_LINUX);
		IS_LINUX_KDE = IS_LINUX && System.getenv("KDE_FULL_SESSION") != null;
		IS_MAC_OS_X = osName.equals("mac os x");

		String arch = System.getProperty("sun.arch.data.model");
		if (arch == null)
			arch = System.getProperty("os.arch").toLowerCase();
		IS_64_BIT_JVM = arch.contains("64");
	}

	@NotNull
	public static <T> List<T> createList(	int extraCapacity,
											@NotNull T... elements) {
		Util.checkNotNull(elements);
		List<T> newList = new ArrayList<T>(elements.length + extraCapacity);
		for (T element : elements)
			newList.add(element);
		return newList;
	}
	
	@NotNull
	public static File getCanonicalFile(@NotNull String path) {
		return getCanonicalFile(new File(path));
	}

	@NotNull
	public static File getCanonicalFile(@NotNull File file) {
		return new File(getCanonicalPath(file));
	}

	@NotNull
	public static String getCanonicalPath(@NotNull File file) {
		if (IS_WINDOWS && isWindowsDevice(file.getPath())) {
			String driveLetter = getDriveLetter(file.getPath());
			assert driveLetter != null;
			return driveLetter + ":\\"; // the trailing slash is important here
		}

		// Calling getCanonicalPath leads to performance problems for files
		// located on a network, so it has been disabled. See:
		// https://sourceforge.net/p/docfetcher/discussion/702424/thread/4ed68957/

		// try {
		// return file.getCanonicalPath();
		// }
		// catch (IOException e) {
		// return file.getAbsolutePath();
		// }
		return file.getAbsolutePath();
	}

	public static boolean isWindowsDevice(@NotNull String path) {
		return driveOnlyPattern.matcher(path).matches();
	}

	@Nullable
	public static String getDriveLetter(@NotNull String path) {
		Util.checkNotNull(path);
		Matcher m = Util.drivePattern.matcher(path);
		if (m.matches())
			return m.group(1).toUpperCase();
		return null;
	}

	@NotNull
	public static String getAbsPath(@NotNull File file) {
		String absPath = file.getAbsolutePath();
		if (absPath.startsWith("\\\\")) // UNC path?
			return absPath;
		/*
		 * We'll replace "//" with "/" here due to a bug in the
		 * File.getAbsolutePath method: On Windows, if the given file has the
		 * path "SOME_PATH" and the current working directory is the root of a
		 * device, e.g. "C:\", then getAbsolutePath will return "C:\\SOME_PATH"
		 * rather than the more sensible value "C:\SOME_PATH".
		 */
		return absPath.replace('\\', '/').replace("//", "/");
	}

	public static boolean isUncPath(@NotNull File file) {
		return file.getPath().startsWith("\\\\");
	}

	@NotNull
	public static List<String> splitPath(@NotNull String path) {
		List<String> parts = new ArrayList<String>();
		int lastStart = 0;
		for (int i = 0; i < path.length(); i++) {
			char c = path.charAt(i);
			if (c == '/' || c == '\\') {
				parts.add(path.substring(lastStart, i));
				lastStart = i + 1;
			}
		}
		if (lastStart < path.length())
			parts.add(path.substring(lastStart));
		return parts;
	}

	@NotNull
	public static String joinPath(@NotNull Iterable<?> parts) {
		Iterator<?> it = parts.iterator();
		if (!it.hasNext())
			return "";
		StringBuilder sb = new StringBuilder();
		sb.append(fileSepMatcher.trimTrailingFrom(it.next().toString()));
		while (it.hasNext()) {
			sb.append('/');
			sb.append(fileSepMatcher.trimFrom(it.next().toString()));
		}
		return toForwardSlashes(sb.toString());
	}

	@NotNull
	public static File createDerivedTempFile(@NotNull String filename,
			@NotNull File tempDir) throws IOException {
		String[] nameParts = Util.splitFilename(filename);
		if (!nameParts[1].equals(""))
			nameParts[1] = "." + nameParts[1];
		return Util.createTempFile(nameParts[0], nameParts[1], tempDir);
	}

	public static File createTempFile(@NotNull String prefix,
			@Nullable String suffix, @Nullable File directory)
			throws IOException {
		int prefixLength = prefix.length();
		if (prefixLength < 3)
			prefix += Strings.repeat("_", 3 - prefixLength);
		File file = File.createTempFile(prefix, suffix, directory);

		/*
		 * On Mac OS X, File.createTempFile() will give us a symlink to a file,
		 * which is not what we want, because our file walker will silently
		 * ignore symlinks. The workaround is to return a canonical file on Mac
		 * OS X.
		 */
		if (Util.IS_MAC_OS_X)
			file = file.getCanonicalFile();

		file.deleteOnExit();
		return file;
	}

	@NotNull
	public static String[] splitFilename(@NotNull String filename) {
		int index = filename.lastIndexOf('.');
		if (index == -1)
			return new String[] { filename, "" };
		String ext = filename.substring(index + 1).toLowerCase();
		if (ext.equals("gz")) {
			int index2 = filename.lastIndexOf('.', index - 1);
			if (index2 != -1) {
				return new String[] { filename.substring(0, index2),
						filename.substring(index2 + 1).toLowerCase() };
			}
		}
		return new String[] { filename.substring(0, index), ext };
	}

	@NotNull
	public static String getSystemAbsPath(@NotNull File file) {
		return file.getAbsolutePath();
	}
	
	@NotNull
	public static List<String> decodeStrings(char sep, @NotNull String str) {
		Util.checkNotNull(str);
		if (str.trim().isEmpty())
			return new ArrayList<String>(0);
		boolean precedingBackslash = false;
		List<String> parts = new ArrayList<String>();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == sep && ! precedingBackslash) {
				parts.add(sb.toString());
				sb.delete(0, sb.length());
			}
			else if (c != '\\' || precedingBackslash)
				sb.append(c);
			if (c == '\\')
				precedingBackslash = ! precedingBackslash;
			else
				precedingBackslash = false;
		}
		parts.add(sb.toString());
		return parts;
	}
	
	public static <T> T checkNotNull(T a) {

		if (a instanceof Boolean)
			throw new UnsupportedOperationException();
		if (a == null)
			throw new IllegalArgumentException();
		return a;
	}

	/**
	 * Throws an <code>IllegalArgumentException</code> if any of the provided
	 * arguments is null.
	 */
	public static void checkNotNull(Object a, Object b) {
		if (a == null || b == null)
			throw new IllegalArgumentException();
	}

	/**
	 * Throws an <code>IllegalArgumentException</code> if any of the provided
	 * arguments is null.
	 */
	public static void checkNotNull(Object a, Object b, Object c) {
		if (a == null || b == null || c == null)
			throw new IllegalArgumentException();
	}

	/**
	 * Throws an <code>IllegalArgumentException</code> if any of the provided
	 * arguments is null.
	 */
	public static void checkNotNull(Object a, Object b, Object c, Object d) {
		if (a == null || b == null || c == null || d == null)
			throw new IllegalArgumentException();
	}

	/**
	 * Throws an <code>IllegalArgumentException</code> if any of the provided
	 * arguments is null.
	 */
	public static void checkNotNull(Object a, Object b, Object c, Object d,
			Object e) {
		if (a == null || b == null || c == null || d == null || e == null)
			throw new IllegalArgumentException();
	}

	/**
	 * Returns the given string if it is not null, otherwise returns an empty
	 * string.
	 */
	@NotNull
	public static String notNull(@Nullable String string) {
		return string == null ? "" : string;
	}

	public static void checkThat(boolean condition) {
		if (!condition)
			throw new IllegalArgumentException();
	}

	@NotNull
	public static String joinPath(@NotNull String first,
			@NotNull String second, @NotNull String... more) {
		if (more.length == 0) {
			if (first.isEmpty())
				return second;
			if (second.isEmpty())
				return first;
		}
		StringBuilder sb = new StringBuilder();
		sb.append(fileSepMatcher.trimTrailingFrom(first));
		sb.append('/');
		sb.append(fileSepMatcher.trimFrom(second));
		for (int i = 0; i < more.length; i++) {
			sb.append('/');
			sb.append(fileSepMatcher.trimFrom(more[i]));
		}
		return toForwardSlashes(sb.toString());
	}

	@NotNull
	public static String toForwardSlashes(@NotNull String path) {
		if (path.startsWith("\\\\")) // UNC path?
			return path;
		return path.replace('\\', '/');
	}

	private static boolean isUbuntuUnity(boolean isLinux) {
		if (!isLinux)
			return false;
		try {
			String output = getProcessOutput("lsb_release -irs").trim();
			String[] lines = output.split("\n");
			if (lines.length != 2)
				return false;
			if (!lines[0].trim().toLowerCase().equals("ubuntu"))
				return false;

			// See:
			// http://askubuntu.com/questions/70296/is-there-an-environment-variable-that-is-set-for-unity
			if (lines[1].trim().equals("11.04"))
				return "gnome".equals(System.getenv("DESKTOP_SESSION"))
						&& "gnome".equals(System.getenv("GDMSESSION"));
			return "Unity".equals(System.getenv("XDG_CURRENT_DESKTOP"));
		} catch (IOException e) {
			return false;
		}
	}

	@NotNull
	public static String join(@NotNull String separator, @NotNull Object... parts) {
		Util.checkNotNull(separator);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < parts.length; i++) {
			if (i == 0) {
				sb.append(parts[i]);
			} else {
				sb.append(separator);
				sb.append(parts[i]);
			}
		}
		return sb.toString();
	}
	
	@NotNull
	private static String getProcessOutput(@NotNull String command)
			throws IOException {
		Process p = Runtime.getRuntime().exec(command);
		BufferedReader in = new BufferedReader(new InputStreamReader(
				p.getInputStream()));
		StringBuilder sb = new StringBuilder();
		boolean firstLine = true;
		while (true) {
			String line = in.readLine();
			if (line == null)
				break;
			if (firstLine)
				firstLine = false;
			else
				sb.append(Util.LS);
			sb.append(line);
		}
		return sb.toString();
	}

	@NotNull
	public static String join(@NotNull String separator, @NotNull Iterable<?> parts) {
		Util.checkNotNull(separator);
		Iterator<?> it = parts.iterator();
		if (! it.hasNext())
			return "";
		StringBuilder sb = new StringBuilder();
		sb.append(it.next().toString());
		while (it.hasNext()) {
			sb.append(separator);
			sb.append(it.next().toString());
		}
		return sb.toString();
	}
	@NotNull
	public static String getExtension(@NotNull String filename) {
		return splitFilename(filename)[1];
	}

	@NotNull
	public static String getExtension(@NotNull File file) {
		return splitFilename(file.getName())[1];
	}
}
