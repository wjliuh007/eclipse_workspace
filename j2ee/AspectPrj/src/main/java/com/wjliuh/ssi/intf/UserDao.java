package com.wjliuh.ssi.intf;

import com.wjliuh.ssi.model.User;

public interface UserDao {
	public User getUserByName(String name);
	public int insertUser(User user);
}
