package nc.newinstall.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;

public class ZipFileTool {
	private ZipFile zipFile = null;

	private ArrayList list = null;

	public ZipFileTool(File file) throws ZipException, IOException {
		this.zipFile = new ZipFile(file);
	}

	public void close() throws IOException {
		if (this.zipFile != null)
			this.zipFile.close();
	}

	public ZipEntry[] getEntrys() {
		ArrayList al = new ArrayList();
		Enumeration enum1 = this.zipFile.entries();
		while (enum1.hasMoreElements()) {
			ZipEntry entry = (ZipEntry) enum1.nextElement();
			al.add(entry);
		}
		return (ZipEntry[]) al.toArray(new ZipEntry[0]);
	}

	public void copyZipEntyToDest(ZipEntry entry, String destDir) throws IOException {
		destDir = destDir.replace('\\', '/');
		if (!destDir.endsWith("/"))
			destDir = destDir + "/";
		String name = entry.getName().replace('\\', '/');
		long modiTime = entry.getTime();
		String destFilePath = destDir + name;
		File destFile = new File(destFilePath);
		System.out.println(name);
		if (entry.isDirectory()) {
			destFile.setLastModified(modiTime);
			boolean succ = FileUtil.createDirFile(destFile);
			if (!succ) {
				System.out.println("create directory failed:" + destFilePath);
			}
			return;
		}
		if (SpecialControl.shouldNotCopy(name))
			return;
		if (destFile.exists()) {
			if (!SpecialControl.canOverlay(name)) {
				return;
			}

			destFile.delete();
		}

		FileUtil.createParenFileAsNeeded(destFile);
		boolean needConvert = needConvert(name);
		FileOutputStream fos = null;
		byte[] buff = new byte[2048];
		int len = -1;
		InputStream in = null;
		try {
			in = this.zipFile.getInputStream(entry);
			fos = new FileOutputStream(destFilePath);
			byte b1 = -1;
			byte b2 = -1;
			while ((len = in.read(buff)) != -1) {
				if (needConvert) {
					byte[] newBytes = new byte[len];
					int p = 0;
					for (int i = 0; i < len - 1; i++) {
						b1 = buff[i];
						b2 = buff[(i + 1)];
						if ((b1 == 13) && (b2 == 10)) {
							newBytes[(p++)] = b2;
							i++;
						} else {
							newBytes[(p++)] = b1;
						}
					}
					fos.write(newBytes, 0, p);
					if ((b1 != 13) || (b2 != 10))
						if (b2 != 13)
							fos.write(b2);
						else
							while (b2 == 13) {
								byte[] b = new byte[1];
								if (in.read(b) != -1) {
									if (b[0] == 10) {
										fos.write(b[0]);
										b2 = -1;
									} else if (b[0] == 13) {
										fos.write(b2);
										b2 = b[0];
									} else {
										fos.write(b2);
										fos.write(b[0]);
										b2 = -1;
									}
								} else {
									fos.write(b2);
									b2 = -1;
								}
							}
				} else {
					fos.write(buff, 0, len);
				}
				if (in == null)
					break;
			} 
		} finally {
			try {
				if (in != null)
					in.close();
			} catch (IOException localIOException) {
			}
			try {
				if (fos != null)
					fos.close();
			} catch (IOException localIOException1) {
			}
		}
		long lastModiTime = entry.getTime();
		if (lastModiTime > 0L)
			destFile.setLastModified(lastModiTime);
	}

	public long calcZipFilSizeInFact() {
		long size = 0L;
		Enumeration enum1 = this.zipFile.entries();
		while (enum1.hasMoreElements()) {
			ZipEntry entry = (ZipEntry) enum1.nextElement();
			long entrySize = entry.getSize();
			if (entrySize != -1L)
				size += entrySize;
		}
		return size;
	}

	private ArrayList getNeedConvertFileList() {
		if (this.list == null) {
			this.list = new ArrayList();
			this.list.add(".txt");

			this.list.add(".bat");
			this.list.add(".sh");
		}
		return this.list;
	}

	private boolean needConvert(String fileName) {
		boolean needConvert = false;
		if ((fileName != null) && (!OSUtil.isWindows())) {
			int index = fileName.lastIndexOf('.');
			if (index != -1) {
				String suffix = fileName.substring(index);
				if (getNeedConvertFileList().contains(suffix.trim().toLowerCase())) {
					needConvert = true;
				}
			}
		}
		return needConvert;
	}
}
