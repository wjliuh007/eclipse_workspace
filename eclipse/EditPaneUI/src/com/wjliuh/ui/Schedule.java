package com.wjliuh.ui;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Schedule{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Schedule.timer4();
		

	}

	
    // 第四种方法：安排指定的任务task在指定的时间firstTime开始进行重复的固定速率period执行．  
    // Timer.scheduleAtFixedRate(TimerTask task,Date firstTime,long period)  
    public static void timer4() {  
        Calendar calendar = Calendar.getInstance();  
        calendar.set(Calendar.HOUR_OF_DAY, 12); // 控制时  
        calendar.set(Calendar.MINUTE, 0);       // 控制分  
        calendar.set(Calendar.SECOND, 0);       // 控制秒  
  
        Date time = calendar.getTime();         // 得出执行任务的时间,此处为今天的12：00：00  
  
        Timer timer = new Timer();  
        timer.scheduleAtFixedRate(new TimerTask() {  
            public void run() {  
                System.out.println("-------设定要指定任务--------");  
            }  
        },1000, 3000);// 这里设定将延时每天固定执行  
    } 

}
