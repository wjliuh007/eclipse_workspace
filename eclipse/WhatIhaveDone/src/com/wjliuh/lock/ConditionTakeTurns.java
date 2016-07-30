package com.wjliuh.lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConditionTakeTurns {
	public static Lock lock = new ReentrantLock();
	final Condition conA = lock.newCondition();
	final Condition conB = lock.newCondition();
	final Condition conC = lock.newCondition();
	static char cache = 'A';
	final static int frequence = 10;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final ConditionTakeTurns taketurns = new ConditionTakeTurns();
		Thread t1 = new Thread(new Runnable(){

			@Override
			public void run() {
				try{
					for(int i=0;i<frequence;i++){
						taketurns.outputA();
					}
				}catch(Exception ex){
					
				}finally{
				}
				
			}
			
		},"output-A"); 
		Thread t2 = new Thread(new Runnable(){

			@Override
			public void run() {
				try{
					for(int i=0;i<frequence;i++){
						taketurns.outputB();
					}
				}catch(Exception ex){
					
				}finally{
				}
				
			}
			
		},"output-B"); 
		Thread t3 = new Thread(new Runnable(){

			@Override
			public void run() {
				try{
					for(int i=0;i<frequence;i++){
						taketurns.outputC();
					}

				}catch(Exception ex){
					
				}finally{
				}
				
			}
			
		},"output-C"); 
		
		t3.start();
		t2.start();
		t1.start();


	}
	
	public void outputA(){
		try{
			lock.lock();
			while(cache != 'A'){
				conA.await();
			}
			System.out.println("A");
			cache = 'B';
			conB.signal();
			
		}catch(Exception ex){
			
		}finally{
			lock.unlock();
		}
	}
	
	public void outputB(){
		try{
			lock.lock();
			while(cache != 'B'){
				conB.await();
			}
			System.out.println("B");
			cache = 'C';
			conC.signal();
		}catch(Exception ex){
			
		}finally{
			lock.unlock();
		}
	}
	
	public void outputC(){
		try{
			lock.lock();
			while(cache != 'C'){
				conC.await();
			}
			System.out.println("C");
			cache = 'A';
			conA.signal();
		}catch(Exception ex){
			
		}finally{
			lock.unlock();
		}
	}

}
