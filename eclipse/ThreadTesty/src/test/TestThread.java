package test;

public class TestThread {

	public static void main(String[] args) {
		BLOCKED();
	}

	private static void BLOCKED() {

		final Object lock = new Object();

		Runnable run = new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < Integer.MAX_VALUE; i++) {

					synchronized (lock) {
						System.out.println(Thread.currentThread().getName()+":"+i);
					}

				}
			}
		};

		for(int i=1;i<100;i++){
			Thread t = new Thread(run);
			t.setName(String.valueOf(i));
			t.start();
		}


		// System.out.println(t1.getState());
		// System.out.println(t2.getState());

	}

	private static void WAITING() {

		final Object lock = new Object();
		Thread t1 = new Thread() {
			@Override
			public void run() {

				int i = 0;

				while (true) {
					synchronized (lock) {
						try {
							lock.wait();
						} catch (InterruptedException e) {
						}
						System.out.println(i++);
					}
				}
			}
		};

		Thread t2 = new Thread() {
			@Override
			public void run() {

				while (true) {
					synchronized (lock) {
						for (int i = 0; i < 10000000; i++) {
							System.out.println(i);
						}
						lock.notifyAll();
					}

				}
			}
		};

		t1.setName("^^t1^^");
		t2.setName("^^t2^^");

		t1.start();
		t2.start();
	}
}
