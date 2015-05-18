/**
 * Creation Date:2015年1月6日-下午2:23:49
 * 
 * Copyright 2008-2015 © 同程网 Inc. All Rights Reserved
 */
package com.ly.rw.cache;

import org.junit.Test;

import com.opensymphony.oscache.base.algorithm.FIFOCache;
import com.opensymphony.oscache.base.algorithm.LRUCache;

/**
 * Description Of The Class<br/>
 * QQ:1211956756 
 *
 * @author 	(宗寿金 07814)
 * @version 1.0.0, 2015年1月6日-下午2:23:49
 * @since 2015年1月6日-下午2:23:49
 */
public class FIFOCacheTest {

	@Test
	public void testFIFOCache(){
		FIFOCache cache = new FIFOCache();
		cache.put("hello", "world");
	}
	
	@Test
	public void testLRUCache(){
		LRUCache cache = new LRUCache();
		cache.put("hello", "world");
	}
	
	@Test
	public void test01(){
		System.out.println("aaaaaa");
	}
}

