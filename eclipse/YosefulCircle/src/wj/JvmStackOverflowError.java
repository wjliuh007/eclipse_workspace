package wj;

public class JvmStackOverflowError {

	private int stackLength=1;
	
	public void stackLeak(){
		stackLength++;
		stackLeak();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JvmStackOverflowError jsv = new JvmStackOverflowError();
		try{
			jsv.stackLeak();
		}catch(Throwable ex){
			System.out.println("stack length:"+jsv.stackLength);
			throw ex;
		}

	}

}
