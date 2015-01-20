/**
 * Creation Date:2015年1月5日-上午10:33:59
 * 
 * Copyright 2008-2015 © 同程网 Inc. All Rights Reserved
 */
package com.ly.rw.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Description Of The Class<br/>
 * QQ:1211956756 
 *
 * @author 	(宗寿金 07814)
 * @version 1.0.0, 2015年1月5日-上午10:33:59
 * @since 2015年1月5日-上午10:33:59
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface DataSource {

	String value();
}

