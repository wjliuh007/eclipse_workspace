
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final Object A = new Object();
		final Object B = new Object();
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				synchronized(A){
					System.out.println("我在等待B");
					synchronized(B){
						System.out.println("我在执行B");
					}
				}
				
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				synchronized(B){
					System.out.println("我在等待A");
					synchronized(A){
						System.out.println("我在执行A");
					}
				}
				
			}
		});
		t1.start();
		t2.start();

	}

}
