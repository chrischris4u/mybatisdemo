package com.ssharing.mybatisdemo.sys.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ssharing.mybatisdemo.sys.user.entity.User;
import com.ssharing.mybatisdemo.sys.user.service.UserService;

@RequestMapping("/")
@Controller
public class UserController {

	@Autowired
	private UserService service;
	
	@RequestMapping( method=RequestMethod.GET)
	public String showList(Model model){
		List<User> userList = service.findAll();
		model.addAttribute("userlist" , userList);
		return "user/list";
	}
	
	@RequestMapping(value="/user/{userName}", method=RequestMethod.GET)
	public String showUser(@PathVariable("userName") String name, Model model){
		model.addAttribute( "userinfo", service.findByName(name));
		return "user/user";
	}
	
	@RequestMapping(value="/addOne", method=RequestMethod.GET)
	public String addOne(Model model){
		int count = service.countAll();
		User nUser = new User(); 
		nUser.setName("new" + count);
		service.insert(nUser);
		return "redirect:/";
	}
	
}
