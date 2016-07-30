package com.wjliuh.lock;

public class Test extends Thread {

	String[] con;
	Thread th;
	public Test(Thread th,String[] con){
		super(th);
		this.th = th;
		this.con = con;
	}
	public void run() {
		if(null != this.con){
			try {
				if(th != null){
					th.join();
				}
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			for(String s:con){
				System.out.print(s);
			}
		}

	}

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		Thread t1 = new Thread(new Test(null,new String[]{"A"}));
		Thread t2 = new Thread(new Test(t1,new String[]{"B"}));
		Thread t3 = new Thread(new Test(t2,new String[]{"C"}));
		t1.start();
		t2.start();
		t3.start();


	}

}
