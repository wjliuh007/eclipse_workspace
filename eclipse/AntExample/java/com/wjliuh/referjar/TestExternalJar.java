package com.wjliuh.referjar;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
/**
 * 这个类主要测试ant编译和打包时如何引用外部jar包
 * @author JIE
 *
 */
public class TestExternalJar {

	private static Log log = LogFactory.getLog("");
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {


		FileOutputStream out = null;

		int count = 1000;// 写文件行数

		try {

			out = new FileOutputStream(new File("G:/add.txt"));

			long begin = System.currentTimeMillis();

			for (int i = 0; i < count; i++) {

				out.write("测试java 文件操作\r\n".getBytes());

			}
			out.flush();

			long end = System.currentTimeMillis();

			System.out.println("FileOutputStream执行耗时:" + (end - begin) + " 豪秒");
			log.debug("FileOutputStream执行耗时:" + (end - begin) + " 豪秒");


		} catch (Exception e) {

			e.printStackTrace();

		}finally {

			try {

				out.close();

			} catch (Exception e) {

				e.printStackTrace();

			}

		}

	

	}

}
