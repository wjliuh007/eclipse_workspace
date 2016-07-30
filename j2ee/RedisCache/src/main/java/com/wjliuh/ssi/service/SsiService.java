package com.wjliuh.ssi.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import com.wjliuh.ssi.dao.UserDaoImpl;
import com.wjliuh.ssi.intf.UserDao;
import com.wjliuh.ssi.model.User;
import com.wjliuh.ssi.service.intf.BaseServiceItf;

@Service("ssiService")
public class SsiService implements BaseServiceItf<User> {

	@Resource
	private UserDaoImpl userDao;

	@Resource
	private RedisTemplate<String, User> jedisTemplate;

	@Override
	public int insert(User t) {
		jedisTemplate.opsForHash().put(User.getUserKey(), t.getId(), t);
		return 1;
	}

	@Override
	public int batchInsert(List<User> list) {
		return 0;
	}

	@Override
	public int delete(User t) {
		jedisTemplate.opsForHash().delete(User.getUserKey(), t.getId());
		return 1;
	}

	@Override
	public int batchDelete(List<User> list) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(User t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int batchUpdate(List<User> list) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User query(User t) {
		return query(t.getId());
	}

	public User query(String userCode) {

		return (User) jedisTemplate.opsForHash().get(User.getUserKey(),
				userCode);

	}

	public User queryReg(String userCode) {

		return (User) jedisTemplate.opsForHash().get(User.getUserKey(),
				userCode);

	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = (UserDaoImpl) userDao;
	}

	public RedisTemplate<String, User> getJedisTemplate() {
		return jedisTemplate;
	}

	public void setJedisTemplate(RedisTemplate<String, User> jedisTemplate) {
		this.jedisTemplate = jedisTemplate;
	}

}
