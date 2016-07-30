package wj;

import java.util.Arrays;
/**
 * 约瑟夫环
 * @author JIE
 *
 */
public class Test {

	/**
	 * @param args
	 */
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Node head = new Node();
		head.setData(new Data(1));
		head.arry[1-1]="1";
		head.setDown(null);
		head.langth++;
		
		
		Node next = new Node();
		head.setUp(next);
		Node tail = head;
		int i=2;
		while(head.getUp()!=null){
			head.getUp().setDown(head);
			head = head.getUp();
			head.setData(new Data(i));
			head.arry[i-1]=""+i;
			next = new Node();
			head.setUp(next);
			head.langth++;
			i++;
			if(i>10)
				break;
		}
		head.setUp(tail);
		tail.setDown(head);
		int cal =1;
		while(tail.langth>1){
			if(cal ==3){
				int c = tail.getData().getIntValue();
				System.out.println("被踢除："+c);
				tail.getUp().setDown(tail.getDown());
				tail.getDown().setUp(tail.getUp());
				tail.arry[c-1]="-";
				tail.langth--;
				cal=0;
			}
			cal++;
			tail = tail.getUp();
		}

		System.out.println(Arrays.asList(head.arry));
		


	}

}
