package com.wjliuh.copy;

public class Test {

	/**
	 * @param args
	 */
	// 来源文件
	private static String sourceFile;
	// 目标文件
	private static String targetFile;
	// 分块数
	private static int blockCount;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		sourceFile = args[0];
		targetFile = args[1];
		blockCount = Integer.parseInt(args[2]);
		// 记录开始时间
		long beginTime = System.currentTimeMillis();
		// 依次分块进行文件COPY
		for (int i = 0; i < blockCount; i++) {
			// 实例化文件复制对象
			CopyCore copyFile = new CopyCore(sourceFile, targetFile, blockCount, i);
			// 实例化线程
			Thread thread = new Thread(copyFile);
			// 开始线程
			thread.start();
			try {
				// 加入线程
				thread.join();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		// 计算耗时
		long endTime = System.currentTimeMillis();
		// 输出耗时
		System.out.println("共用时:" + (endTime - beginTime) / 1000 + "秒");

	}
}