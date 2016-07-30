package com.wjliuh.task;

import java.util.Timer;
import java.util.TimerTask;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class MyTask extends TimerTask{

	@Override
	public void run() {
		System.out.println("test");
		
	}
	
	public static void main(String[] args){
		MyTask m = new MyTask();
		Timer t = new Timer();
		t.schedule(m, 1000, 10000);
	}

}
