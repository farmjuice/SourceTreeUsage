package com.ling.asj.manager.user.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.ling.asj.dao.IUserDao;
import com.ling.asj.entity.user.User;
import com.ling.asj.manager.user.IUserManager;

public class UserManager implements IUserManager {
	
	@Autowired
	private IUserDao userDao;

	public Long addUser(User user) {
		return userDao.addUser(user);
	}

	public void delUser(Long id) {
		System.out.println("user=========del");
	}

	public void updateUser(User user) {
		System.out.println("user=========update");

	}

	public User getUserById(Long id) {
		System.out.println("user========get");
		return null;
	}

}
