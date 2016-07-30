package wj;

import java.util.ArrayList;

public class Node {

	
	public static int langth;
	public static String[] arry = new String[10];
	private Node up;
	private Node down;
	
	private Data data;

	public Node getUp() {
		return up;
	}

	public void setUp(Node up) {
		this.up = up;
	}

	public Node getDown() {
		return down;
	}

	public void setDown(Node down) {
		this.down = down;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}
	
	
}
