package com.ling.asj.manager.user;

import com.ling.asj.entity.user.User;

public interface IUserManager {
	
	public Long addUser(User user);
	
	public void delUser(Long id);
	
	public void updateUser(User user);
	
	public User getUserById(Long id);

}
