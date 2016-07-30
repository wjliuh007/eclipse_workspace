package wjliuh.singleTon;

public class SingleTon {

	static{
		System.out.println("1");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SingleTon instance = SingleTon.getInstance();
		System.out.println(SingleTon.getInstance());
		System.out.println(SingleTon.getInstance());
		System.out.println(SingleTon.getInstance());
		System.out.println(SingleTon.getInstance());
	}

	private SingleTon(){}
	private static class InnerClassSingleTonFactory{
		private static SingleTon instance = new SingleTon();
		static {
			System.out.println("2");
			System.out.println("初始化内部类！");
		}
	}
	
    /* 获取实例 */  
    public static SingleTon getInstance() {  
    	System.out.println("3");
        return InnerClassSingleTonFactory.instance;  
    }  
    
}
