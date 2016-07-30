package com.wjliuh.ssi.dao;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.wjliuh.ssi.intf.UserDao;
import com.wjliuh.ssi.model.User;

@Repository
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao{

	@Override
	public User getUserByName(String name) {
		User user = new User();  
        user = getSqlSession().selectOne("UserMapper.getUserByName", name);
  
		return user;
	}

	@Override
	public int insertUser(User user) {
		int result = getSqlSession().insert("UserMapper.insertUser",user);
		return result;
	}

}
