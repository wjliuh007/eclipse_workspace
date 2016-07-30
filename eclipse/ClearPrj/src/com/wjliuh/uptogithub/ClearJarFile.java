package com.wjliuh.uptogithub;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ClearJarFile {

	private final static String ROOT_PATH = "D:/Administrator/eclipse";
	private final static String TO_REF_JAR = "toRefJar.txt";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File root = new File(ROOT_PATH);
		File[] files = root.listFiles();
		List<File> jars = null;
		for (File f : files) {// f都是目录
			if (".metadata".equals(f.getName())) {
				continue;
			}
			jars = new ArrayList<File>();
			loopFindJar(f, jars);
			recordFile(f.getAbsolutePath(), jars);
			jars = null;
		}

	}

	private static void recordFile(String absolutePath, List<File> jars) {
		if (jars != null && jars.size() > 0) {
			try {
				File jarfile = new File(absolutePath + File.separator + TO_REF_JAR);
				if (jarfile.exists()) {
					jarfile.delete();
				}
				jarfile.createNewFile();
				FileOutputStream fos = new FileOutputStream(jarfile);
				for (File jar : jars) {
					fos.write(jar.getName().getBytes());
					fos.write("\n".getBytes());
				}
				fos.flush();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

	private static void loopFindJar(File file, List<File> jars) {
		File[] fs = file.listFiles();
		for (File f : fs) {
			if (f.isDirectory()) {
				loopFindJar(f, jars);
			} else {
				String type = f.getName().substring(f.getName().lastIndexOf(".") + 1);
				if ("jar".equalsIgnoreCase(type)) {
					jars.add(f);
				}
				if (f.length() > 100 * 1024 * 1024) {
					System.out.println(f.getAbsolutePath());
				}
			}
		}

	}
}
