package com.ling.asj.web.action.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ling.asj.entity.user.User;
import com.ling.asj.manager.user.IUserManager;
import com.ling.asj.web.action.common.BaseAction;

@Controller
public class UserAction extends BaseAction{
	
	@Autowired
	private IUserManager userManager;
	
	@RequestMapping("/user/list.htm")
	public String list(Model model,HttpServletRequest request,HttpServletResponse response){
		return "user/list";
	}
	
	@RequestMapping("/user/init-{status}.htm")
	public String init(@PathVariable("status") String status,User user,Model model,HttpServletRequest request,HttpServletResponse response){
		if(status!=null && status.trim().equals("edit")){
			String userId = request.getParameter("id");
			user=userManager.getUserById(Long.parseLong(userId));
			model.addAttribute("user", user);
		}
		return "user/init";
	}
	
	@RequestMapping("/user/add.htm")
	public String add(User user,Model model,HttpServletRequest request,HttpServletResponse response){
		userManager.addUser(user);
		return "redirect:list.htm";
	}
	
	

}
