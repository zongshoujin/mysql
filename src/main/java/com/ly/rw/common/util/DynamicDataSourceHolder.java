/**
 * Creation Date:2015年1月5日-上午10:39:55
 * 
 * Copyright 2008-2015 © 同程网 Inc. All Rights Reserved
 */
package com.ly.rw.common.util;

/**
 * Description Of The Class<br/>
 * QQ:1211956756 
 *
 * @author 	(宗寿金 07814)
 * @version 1.0.0, 2015年1月5日-上午10:39:55
 * @since 2015年1月5日-上午10:39:55
 */
public class DynamicDataSourceHolder {

	public static final ThreadLocal<String> holder = new ThreadLocal<String>();
	
	public static void putDataSource(String dataSource){
		holder.set(dataSource);
	}
	
	public static String getDataSource(){
		return holder.get();
	}
}

