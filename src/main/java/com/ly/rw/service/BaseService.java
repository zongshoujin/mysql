/**
 * Creation Date:2015年1月5日-下午4:02:17
 * 
 * Copyright 2008-2015 © 同程网 Inc. All Rights Reserved
 */
package com.ly.rw.service;

import java.io.Serializable;
import java.util.List;

/**
 * Description Of The Class<br/>
 * QQ:1211956756 
 *
 * @author 	(宗寿金 07814)
 * @version 1.0.0, 2015年1月5日-下午4:02:17
 * @since 2015年1月5日-下午4:02:17
 */
public interface BaseService<T extends Serializable> {

	public void save(T entity);
	
	public T getById(Serializable id);
	
	public List<T> getAll();
}

