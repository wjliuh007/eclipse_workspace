package shedule;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

public class test {
	ApplicationContext context;
	SchedulerFactoryBean shedule;

	@Before
	public void doBefore() {
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
	}

	@Test
	public void testSchedule() {
		context.getBean("schedulerFactory");
	}

}
