/**
 * Creation Date:2015年1月5日-下午3:27:30
 * 
 * Copyright 2008-2015 © 同程网 Inc. All Rights Reserved
 */
package com.ly.rw.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.ly.rw.dao.BaseDao;

/**
 * Description Of The Class<br/>
 * QQ:1211956756 
 *
 * @author 	(宗寿金 07814)
 * @version 1.0.0, 2015年1月5日-下午3:27:30
 * @since 2015年1月5日-下午3:27:30
 */
public class BaseDaoImpl<T extends Serializable> implements BaseDao<T> {

	private Class<T> entityClass;
	
	private HibernateTemplate hibernateTemplate;
	
	@SuppressWarnings("unchecked")
	public BaseDaoImpl() {
		Type type = this.getClass().getGenericSuperclass();
		if(type instanceof ParameterizedType){
			this.entityClass = (Class<T>)((ParameterizedType)type).getActualTypeArguments()[0];
		}
	}

	@Override
	public void save(T entity) {
		this.hibernateTemplate.save(entity);
	}


	@Override
	public T getById(Serializable id) {
		return this.hibernateTemplate.get(entityClass, id);
	}


	@Override
	public List<T> getAll() {
		return this.hibernateTemplate.loadAll(entityClass);
	}


	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	@Resource
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

}

