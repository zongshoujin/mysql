/**
 * Creation Date:2015年1月5日-下午5:29:21
 * 
 * Copyright 2008-2015 © 同程网 Inc. All Rights Reserved
 */
package com.ly.rw.aop;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ly.rw.annotation.DataSource;
import com.ly.rw.common.util.DynamicDataSourceHolder;

/**
 * Description Of The Class<br/>
 * QQ:1211956756 
 *
 * @author 	(宗寿金 07814)
 * @version 1.0.0, 2015年1月5日-下午5:29:21
 * @since 2015年1月5日-下午5:29:21
 */

@Aspect
@Component
public class DataSourceAspectAnnotation {

	private static final Logger logger = LoggerFactory.getLogger(DataSourceAspectAnnotation.class);
	
	@Pointcut("execution(* com.ly.rw.dao.*.*(..))")
	private void execute(){}
	
	@Before("execute()")
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
				logger.info("DataSource Name: "+data.value());
				System.out.println("DataSource Name: "+data.value());
			}
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
	}
}

