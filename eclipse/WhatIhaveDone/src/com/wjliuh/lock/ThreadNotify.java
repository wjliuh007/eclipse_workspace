package com.wjliuh.lock;

public class ThreadNotify {

	static int index = 0;
	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		Thread th1 = new Thread(runa);
		Thread th2 = new Thread(runb);
		Thread th3 = new Thread(runc);
		th1.start();
		th2.start();
		th3.start();
		th1.suspend();
		th2.suspend();
		th3.suspend();
		for(int i=0;i<10;i++){
			th1.resume();
			th1.suspend();
			
			th2.resume();
			th2.suspend();
			
			th3.resume();
			th3.suspend();
		}
	}

	static Runnable runa = new Runnable() {
		
		@Override
		public void run() {
				System.out.println("A");
			
		}
	};
	
	static Runnable runb = new Runnable() {
		
		@Override
		public void run() {
				System.out.println("B");
			
			
		}
	};
	
	static Runnable runc = new Runnable() {
		
		@Override
		public void run() {
				System.out.println("C");
			
			
		}
	};
}
