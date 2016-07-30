package com.wjliuh.linklist;

import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class testLinklist {
	static final int MAXIMUM_CAPACITY = 1 << 30;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number =0;
		int rounded = number >= MAXIMUM_CAPACITY? MAXIMUM_CAPACITY : (rounded = Integer.highestOneBit(number)) != 0 ? (Integer.bitCount(number) > 1) ? rounded << 1 : rounded: 1;
		HashMap<String,Object> hm = new HashMap<String,Object>();
		hm.put("a", "b");
		ExecutorService exe = Executors.newCachedThreadPool();
		exe.execute(new Runnable(){
				public void run() {
				      
				    }

		});
		
		/** 创建一个"可根据需要来创建新线程"的线程池，但是,当之前构造的线程可用时将重用它们*/
		exe = Executors.newCachedThreadPool(); 
		
		/** 创建一个可重用固定线程数的线程池，以共享的无界队列方式来运行这些线程*/
		exe = Executors.newFixedThreadPool(10);
		
		/** 创建一个线程池，它可安排在给定延迟后运行命令或者定期地执行*/
		exe = Executors.newScheduledThreadPool(10);
		
		/** 创建一个使用单个 worker 线程的 Executor，以无界队列方式来运行该线程*/
		exe = Executors.newSingleThreadExecutor();
		
		/** 创建一个单线程执行程序，它可安排在给定延迟后运行命令或者定期地执行*/
		exe = Executors.newSingleThreadScheduledExecutor();
		
		/** 返回用于创建新线程的线程工厂，这些新线程与当前线程具有相同的权限*/
		Executors.privilegedThreadFactory();

	}

	
}
