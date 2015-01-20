/**
 * Creation Date:2015年1月5日-下午4:03:03
 * 
 * Copyright 2008-2015 © 同程网 Inc. All Rights Reserved
 */
package com.ly.rw.service.impl;

import java.io.Serializable;
import java.util.List;

import com.ly.rw.dao.BaseDao;
import com.ly.rw.service.BaseService;

/**
 * Description Of The Class<br/>
 * QQ:1211956756 
 *
 * @author 	(宗寿金 07814)
 * @version 1.0.0, 2015年1月5日-下午4:03:03
 * @since 2015年1月5日-下午4:03:03
 */
public class BaseServiceImpl<T extends Serializable> implements BaseService<T> {

	private BaseDao<T> baseDao;
	
	@Override
	public void save(T entity) {
		this.baseDao.save(entity);
	}

	@Override
	public T getById(Serializable id) {
		return this.baseDao.getById(id);
	}

	@Override
	public List<T> getAll() {
		return this.baseDao.getAll();
	}

	public BaseDao<T> getBaseDao() {
		return baseDao;
	}

	public void setBaseDao(BaseDao<T> baseDao) {
		this.baseDao = baseDao;
	}

}

