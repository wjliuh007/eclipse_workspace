package com.wjliuh.copy;

import java.io.File;

public class CopyManager {

	// 分块数
	private static int blockCount;

	public static void netManger(String sourceUrl, String target) {

	}

	public static void manager(String source, String target) {
		// 得到来源文件
		File file = new File(source);
		// 得到来源文件的大小
		long size = file.length() / 1024 / 1024;

		if (size <= 128) {
			blockCount = 4;
		} else if (size > 128) {
			blockCount = 16;
		}

		// 记录开始时间
		long beginTime = System.currentTimeMillis();
		// 依次分块进行文件COPY
		for (int i = 0; i < blockCount; i++) {
			// 实例化文件复制对象
			CopyCore copyFile = new CopyCore(source, target, blockCount, i);
			// 实例化线程
			Thread thread = new Thread(copyFile);
			// 开始线程
			thread.start();
			try {
				// 加入线程
				thread.join();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// 计算耗时
		long endTime = System.currentTimeMillis();
		// 输出耗时
		System.out.println("共用时:" + (endTime - beginTime) / 1000 + "秒");

	}

}
