package wj;

import java.util.ArrayList;
import java.util.List;

public class StackOverflowError {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		StackOverflowError soe = new StackOverflowError();
//		System.out.println(soe.cal());

		List<OOMObject> list = new ArrayList<OOMObject>();
		while(true){
			list.add(new OOMObject());
		}
	}
	static class OOMObject{
		
	}
	
	public int cal(){
		int res = 0;
		
		for(int i=1;i<2<<29;i++){
			res += 10*i;
		}
		return res;
	}

}
