/**
 * Creation Date:2015年1月5日-上午10:39:12
 * 
 * Copyright 2008-2015 © 同程网 Inc. All Rights Reserved
 */
package com.ly.rw.datasource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

import com.ly.rw.common.util.DynamicDataSourceHolder;

/**
 * Description Of The Class<br/>
 * QQ:1211956756 
 *
 * @author 	(宗寿金 07814)
 * @version 1.0.0, 2015年1月5日-上午10:39:12
 * @since 2015年1月5日-上午10:39:12
 */
public class DynamicDataSource extends AbstractRoutingDataSource {

	@Override
	protected Object determineCurrentLookupKey() {
		return DynamicDataSourceHolder.getDataSource();
	}

}

