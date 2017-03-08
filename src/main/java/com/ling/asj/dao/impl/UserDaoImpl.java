package com.ling.asj.dao.impl;


import com.ling.asj.dao.IUserDao;
import com.ling.asj.dao.common.BaseDao;
import com.ling.asj.entity.user.User;

public class UserDaoImpl extends BaseDao implements IUserDao{
	
	public Long addUser(User user) {
		return (long) this.getSqlSession().insert("User.insertUser", user);
	}

	public void delUser(Long id) {
		// TODO Auto-generated method stub

	}

	public void updateUser(User user) {
		// TODO Auto-generated method stub

	}

	public User getUserById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
