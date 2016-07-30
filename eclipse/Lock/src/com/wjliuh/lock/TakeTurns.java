package com.wjliuh.lock;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 用常规方式实现轮流依次输出ABC
 * 
 * @author liuwjg
 * 
 */
public class TakeTurns {

	public static Lock lock = new ReentrantLock();
	public static int state = 0;
	public static int frequence = 100000;

	private static FileOutputStream fos;
	static File output = new File("G:\\output.log");
	
	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		final TakeTurns taketurns = new TakeTurns();
		
		initFile();
		
		Thread t1 = new MyThread(taketurns, 0, "output-A", "A");
		Thread t2 = new MyThread(taketurns, 1, "output-B", "B");
		Thread t3 = new MyThread(taketurns, 2, "output-C", "C");
		Thread t4 = new MyThread(taketurns, 3, "output-D", "D");

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t4.join();
		System.out.println(state);


	}

	private static void initFile() {
		try {
			if(!output.exists()){
				output.createNewFile();
			}
			fos = new FileOutputStream(output,false);	
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public synchronized void output(String str) {
		try {
			lock.lock();
			System.out.println(str);
			state++;
//			outputToFile(str);
		} catch (Exception ex) {

		} finally {
			lock.unlock();
		}
	}

	public void outputToFile(String str){

		try {
			fos.write(str.getBytes());
			fos.write("\n".getBytes());
			fos.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

}

class MyThread extends Thread {
	final TakeTurns taketurns;
	final int reminder;
	final String output;

	public MyThread(TakeTurns taketurns, int reminder, String name, String output) {
		super(name);
		this.taketurns = taketurns;
		this.reminder = reminder;
		this.output = output;
	}

	@Override
	public void run() {
		try {
			while (TakeTurns.state <= TakeTurns.frequence) {
				if (TakeTurns.state % 4 == reminder) {
					taketurns.output(output);
//					TakeTurns.state++;
				}
			}
		} catch (Exception ex) {

		} finally {
		}
	}
}