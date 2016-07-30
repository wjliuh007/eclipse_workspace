package com.wjliuh.grab;

import com.wjliuh.grab.task.GrabTask;

public class Graber {

	public static void main(String[] args) throws Exception {
		GrabManager manager = GrabManager.getInstance();
		manager.addLink(args[0]);
		String keyWord = args[1];
		Thread t1 = new Thread(new GrabTask(manager,keyWord,"任务1"),"任务1");
		t1.start();
		Thread.currentThread().sleep(3000);
		Thread t2 = new Thread(new GrabTask(manager,keyWord,"任务2"),"任务2");
		t2.start();
		Thread.currentThread().sleep(3000);
		Thread t3 = new Thread(new GrabTask(manager,keyWord,"任务3"),"任务3");
		t3.start();
		Thread.currentThread().sleep(3000);
		Thread t4 = new Thread(new GrabTask(manager,keyWord,"任务4"),"任务4");
		t4.start();
		Thread.currentThread().sleep(3000);
		Thread t5 = new Thread(new GrabTask(manager,keyWord,"任务5"),"任务5");
		t5.start();
		Thread.currentThread().sleep(3000);
		Thread t6 = new Thread(new GrabTask(manager,keyWord,"任务6"),"任务6");
		t6.start();
		Thread.currentThread().sleep(3000);
		Thread t7 = new Thread(new GrabTask(manager,keyWord,"任务7"),"任务7");
		t7.start();
	}
}
