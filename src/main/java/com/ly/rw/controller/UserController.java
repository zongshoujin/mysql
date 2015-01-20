/**
 * Creation Date:2015年1月5日-下午3:21:34
 * 
 * Copyright 2008-2015 © 同程网 Inc. All Rights Reserved
 */
package com.ly.rw.controller;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ly.rw.entity.User;
import com.ly.rw.service.UserService;

/**
 * Description Of The Class<br/>
 * QQ:1211956756 
 *
 * @author 	(宗寿金 07814)
 * @version 1.0.0, 2015年1月5日-下午3:21:34
 * @since 2015年1月5日-下午3:21:34
 */
@Controller
public class UserController {

	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Resource
	private UserService userService;
	
	
	@RequestMapping("/login")
	public String login(){
		
		User saveUser = new User();
//		saveUser.setId(100);
		saveUser.setName("master_user1");
		saveUser.setPassword("master_user1");
		userService.save(saveUser);
		logger.info("User "+saveUser+" Save Success!");
		
		List<User> userList = userService.getAll();
		if(!CollectionUtils.isEmpty(userList)){
			System.out.println("Get All User: ");
			for(User user : userList){
				System.out.println(user);
			}
		}
		
		User user = userService.getById(1);
		if(user != null){
			System.out.println("Get User By User ID: ");
			System.out.println(user);
		}
		return "/user/login";
	}
}

