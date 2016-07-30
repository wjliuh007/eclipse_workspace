package test;

import java.util.HashMap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import com.wjliuh.ssi.model.User;
import com.wjliuh.ssi.util.SerializeUtil;

public class Test {
	ApplicationContext ac;
	RedisTemplate jedisTemplate;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	@org.junit.Test
	public void testRedis(){
		//
		ac = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml","spring-redis.xml","spring-mybatis.xml"});
		
		User u = new User();
		u.setAge(36);
		u.setId("wj");
		u.setName("Band");
		u.setPwd("asdfg007");
		u.setSex("1");
		
		jedisTemplate = (RedisTemplate) ac.getBean("jedisTemplate");
		
//		jedisTemplate.opsForHash().put(User.getUserKey(), u.getId(), u);
		
		User uq = (User) jedisTemplate.opsForHash().get(User.getUserKey(), "wj");
		System.out.println(uq);

	}

}
