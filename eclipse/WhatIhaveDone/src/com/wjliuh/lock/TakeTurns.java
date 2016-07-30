package com.wjliuh.lock;

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
	public static int frequence = 100;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final TakeTurns taketurns = new TakeTurns();

		Thread t1 = new MyThread(taketurns, 0, "output-A", "A");
		Thread t2 = new MyThread(taketurns, 1, "output-B", "B");
		Thread t3 = new MyThread(taketurns, 2, "output-C", "C");

		t1.start();
		t2.start();
		t3.start();

	}

	public void output(String str) {
		try {
			lock.lock();
			System.out.print(str);
		} catch (Exception ex) {

		} finally {
			lock.unlock();
		}
	}

}

class MyThread extends Thread {
	final TakeTurns taketurns;
	final int reminder;
	final String output;

	public MyThread(TakeTurns taketurns, int reminder, String name,
			String output) {
		super(name);
		this.taketurns = taketurns;
		this.reminder = reminder;
		this.output = output;
	}

	@Override
	public void run() {
		try {
			while (taketurns.state <= taketurns.frequence) {
				if (taketurns.state % 3 == reminder) {
					taketurns.output(output);
					taketurns.state++;
				}
			}

		} catch (Exception ex) {

		} finally {
		}
	}
}