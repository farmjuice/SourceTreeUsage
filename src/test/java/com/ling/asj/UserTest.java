package com.ling.asj;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ling.asj.entity.user.User;
import com.ling.asj.manager.user.impl.UserManager;

public class UserTest {
	
	@Test
	public void testUser(){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("service-beans.xml");
		
		UserManager userManager = context.getBean("userManager", UserManager.class);
		
		User user = new User();
		user.setUsername("ling");
		user.setPassword("123456");
		userManager.addUser(user);
		
	}

}
