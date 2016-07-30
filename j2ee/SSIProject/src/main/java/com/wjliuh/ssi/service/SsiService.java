package com.wjliuh.ssi.service;

import java.util.List;

import com.wjliuh.ssi.intf.UserDao;
import com.wjliuh.ssi.model.User;
import com.wjliuh.ssi.service.intf.BaseServiceItf;

public class SsiService implements BaseServiceItf<User>{

	private UserDao userDao;
	
	@Override
	public int insert(User t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int batchInsert(List<User> list) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(User t) {
		// TODO Auto-generated method stub
		return 0;
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
		// TODO Auto-generated method stub
		return null;
	}
	
	public User query(String userCode){
		return userDao.getUserByName(userCode);
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

}
