/**
 * Creation Date:2015年1月5日-上午10:42:52
 * 
 * Copyright 2008-2015 © 同程网 Inc. All Rights Reserved
 */
package com.ly.rw.aop;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.reflect.MethodSignature;

import com.ly.rw.annotation.DataSource;
import com.ly.rw.common.util.DynamicDataSourceHolder;

/**
 * Description Of The Class<br/>
 * QQ:1211956756 
 *
 * @author 	(宗寿金 07814)
 * @version 1.0.0, 2015年1月5日-上午10:42:52
 * @since 2015年1月5日-上午10:42:52
 */
public class DataSourceAspect {

	public void before(JoinPoint point){
		Object target = point.getTarget();
		String method = point.getSignature().getName();
		
		Class<?>[] clazz = target.getClass().getInterfaces();
		Class<?>[] parameterTypes = ((MethodSignature)point.getSignature()).getMethod().getParameterTypes();
		
		try {
			Method m = clazz[0].getMethod(method, parameterTypes);
			if(m != null && m.isAnnotationPresent(DataSource.class)){
				DataSource data = m.getAnnotation(DataSource.class);
				DynamicDataSourceHolder.putDataSource(data.value());
				System.out.println("DataSource Name: "+data.value());
			}
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
	}
}

