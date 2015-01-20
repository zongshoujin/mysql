/**
 * Creation Date:2015年1月5日-下午4:05:56
 * 
 * Copyright 2008-2015 © 同程网 Inc. All Rights Reserved
 */
package com.ly.rw.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ly.rw.dao.UserDao;
import com.ly.rw.entity.User;
import com.ly.rw.service.UserService;

/**
 * Description Of The Class<br/>
 * QQ:1211956756 
 *
 * @author 	(宗寿金 07814)
 * @version 1.0.0, 2015年1月5日-下午4:05:56
 * @since 2015年1月5日-下午4:05:56
 */

@Service
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {

	@Resource
	private UserDao userDao;

	@Resource
	public void setBaseDao(UserDao userDao) {
		super.setBaseDao(userDao);
	}
	
}

