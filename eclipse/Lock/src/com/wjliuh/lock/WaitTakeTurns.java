package com.wjliuh.lock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class WaitTakeTurns {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		WaitTakeTurns w = new WaitTakeTurns();
		ExecutorService ex = Executors.newCachedThreadPool();
		ex.execute(new A(w));
		ex.execute(new B(w));
		ex.execute(new C(w));
		TimeUnit.SECONDS.sleep(2);
		ex.shutdownNow();

	}
	
	
	private char cache = 'B';
	
	public synchronized void sysoA(){
		cache = 'B';
		notifyAll();
	}
	
	public synchronized void sysoB(){
		cache = 'C';
		notifyAll();
	}
	
	public synchronized void sysoC(){
		cache = 'A';
		notifyAll();
	}
	
	public synchronized void waitForA() throws InterruptedException{
		while(cache !='C'){
			wait();
		}
	}
	
	public synchronized void waitForB() throws InterruptedException{
		while(cache !='A'){
			wait();
		}
	}
	
	public synchronized void waitForC() throws InterruptedException{
		while(cache !='B'){
			wait();
		}
	}
	

}

class A implements Runnable{

	private WaitTakeTurns wtt;
	
	public A(WaitTakeTurns wtt){
		this.wtt = wtt;
	}
	@Override
	public void run() {
		while(!Thread.interrupted()){
			System.out.print('A');
			wtt.sysoA();
			try {
				wtt.waitForB();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

class B implements Runnable{

	private WaitTakeTurns wtt;
	
	public B(WaitTakeTurns wtt){
		this.wtt = wtt;
	}
	@Override
	public void run() {
		while(!Thread.interrupted()){
			System.out.print('B');
			wtt.sysoB();
			try {
				wtt.waitForC();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

class C implements Runnable{

	private WaitTakeTurns wtt;
	
	public C(WaitTakeTurns wtt){
		this.wtt = wtt;
	}
	@Override
	public void run() {
		while(!Thread.interrupted()){
			System.out.print('C');
			wtt.sysoC();
			try {
				wtt.waitForA();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}



