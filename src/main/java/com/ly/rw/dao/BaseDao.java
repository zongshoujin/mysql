/**
 * Creation Date:2015年1月5日-下午3:24:44
 * 
 * Copyright 2008-2015 © 同程网 Inc. All Rights Reserved
 */
package com.ly.rw.dao;

import java.io.Serializable;
import java.util.List;

import com.ly.rw.annotation.DataSource;

/**
 * Description Of The Class<br/>
 * QQ:1211956756 
 *
 * @author 	(宗寿金 07814)
 * @version 1.0.0, 2015年1月5日-下午3:24:44
 * @since 2015年1月5日-下午3:24:44
 */
public interface BaseDao<T extends Serializable> {

	@DataSource("write")
	public void save(T entity);
	
	@DataSource("read")
	public T getById(Serializable id);
	
	@DataSource("read")
	public List<T> getAll();
}

