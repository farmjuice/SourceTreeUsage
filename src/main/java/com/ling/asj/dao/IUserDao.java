package com.ling.asj.dao;

import com.ling.asj.entity.user.User;

public interface IUserDao {
	
    public Long addUser(User user);
	
	public void delUser(Long id);
	
	public void updateUser(User user);
	
	public User getUserById(Long id);

}
