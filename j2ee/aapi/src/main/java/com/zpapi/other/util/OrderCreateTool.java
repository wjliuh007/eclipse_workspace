package com.zpapi.other.util;

import java.util.Calendar;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;




import org.apache.log4j.Logger;

import com.zhen.commons.util.UniqueStringGenerator;
import com.zpapi.other.service.GtPaymentLogManager;


public class OrderCreateTool{
	
	private static Logger logger = Logger.getLogger(OrderCreateTool.class);
	
	private static GtPaymentLogManager gtPaymentLogManager = SpringContextUtil.getBean("gtPaymentLogManager");
	
	private static final String paySnKeyPre = "paySnKeyPre_";
	
	private static AtomicLong maxPaySeq = new AtomicLong(0);
	private static AtomicLong nowPaySeq = new AtomicLong(0);
	
	public static Long createOrderSn(){
		StringBuffer ordersn = new StringBuffer();
		Calendar ca = Calendar.getInstance();
		int year = ca.get(Calendar.YEAR);
		int month = ca.get(Calendar.MONTH)+1;
		int day = ca.get(Calendar.DATE);
		int hour = ca.get(Calendar.HOUR);
		String str = String.valueOf(year);
		str = str.substring(2);
		String months = String.valueOf(month);
		if(months.length()==1){
			months="0"+months;
		}
		
		String days = String.valueOf(day);
		if(days.length()==1){
			days="0"+days;
		}
		
		String hours = String.valueOf(hour);
		if(hours.length()==1){
			hours="0"+hours;
		}
		ordersn.append(str);
		ordersn.append(months);
		ordersn.append(days);
		ordersn.append(hours);
		String rand = UniqueStringGenerator.getUniqueString().substring(8,13);
		ordersn.append(rand);
		return Long.valueOf(ordersn.toString().substring(0,13));
	}
	
	public static Long createPaySn(){
		StringBuffer ordersn = new StringBuffer();
		Calendar ca = Calendar.getInstance();
		int year = ca.get(Calendar.YEAR);
		int month = ca.get(Calendar.MONTH)+1;
		int day = ca.get(Calendar.DATE);
		int hour = ca.get(Calendar.HOUR_OF_DAY);
		String years = String.valueOf(year);
		years = years.substring(2);
		String months = String.valueOf(month);
		if(months.length()==1){
			months="0"+months;
		}
		
		String days = String.valueOf(day);
		if(days.length()==1){
			days="0"+days;
		}
		
		String hours = String.valueOf(hour);
		if(hours.length()==1){
			hours="0"+hours;
		}
		
		ordersn.append(years+months+days+hours);
		String rand = UniqueStringGenerator.getUniqueString().substring(11,13);
		ordersn.append(rand);
		return Long.valueOf(ordersn.toString());
	}

	public static Long createPaySn(int length) {
		if (length < 9) {
			throw new RuntimeException("支付订单号必须大于等于 9 位！！！");
		}
		long paySn = 0;
		do {
			Calendar ca = Calendar.getInstance();
			String year = String.format("%04d", ca.get(Calendar.YEAR)).substring(2);
			String month = String.format("%02d", ca.get(Calendar.MONTH) + 1);
			String day = String.format("%02d", ca.get(Calendar.DATE));
			long sn = 0;
			try {
				if (maxPaySeq.get() < (sn = nowPaySeq.incrementAndGet())) {
					synchronized (nowPaySeq) {
						if (maxPaySeq.get() < nowPaySeq.get()) {
							maxPaySeq = new AtomicLong(MemcacheUtil.getMemCachedClient().addOrIncr(paySnKeyPre + year + month + day, 10));
							nowPaySeq = new AtomicLong(maxPaySeq.get() - 10);
						}
						sn = nowPaySeq.incrementAndGet();
					}
				}
			} catch (Exception e) {
				//TODO 短信告警
				logger.error(e.getMessage(), e);
			}
			if (sn <= 0L) {
				paySn = createPaySn();
			} else {
				paySn = Long.parseLong(year + month + day + String.format("%0" + (length - 6) + "d", sn));
			}
		} while (gtPaymentLogManager.getPaymentLogByPay(String.valueOf(paySn)).length > 0);
		return paySn;
	}
	
	public static String createCardsn(int numlength,String charlength){
		 StringBuilder sb=new StringBuilder();
	        Random randdata=new Random();
	        int data=0;
	        if(charlength!=null){
	                sb.append(charlength);
	        }
	        
	        for(int i=0;i<numlength;i++)
	        {

	                 data=randdata.nextInt(10);//仅仅会生成0~9
	                 sb.append(data);

	        }
	        
	        String result=sb.toString();
	        return result;
	}
	
}