package com.wjliuh.quartz;

import java.io.IOException;

import org.apache.log4j.Logger;

import com.wjliuh.sms.SendMessage;

public class QuartzJob {

	Logger logger = Logger.getLogger(QuartzJob.class);

	public void execute() {

		logger.info("5秒执行一次的Quartz 的任务调度！！！ ");
	}

	public void execute10() {
		try {
			SendMessage.sendSMSCRM("17701088792", "测试");
		} catch (IOException e) {
			e.printStackTrace();
		}
		logger.info("10秒执行一次的Quartz 的任务调度！！！ ");
	}
}
