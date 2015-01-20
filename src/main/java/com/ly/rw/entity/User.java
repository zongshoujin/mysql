/**
 * Creation Date:2015年1月5日-下午3:23:48
 * 
 * Copyright 2008-2015 © 同程网 Inc. All Rights Reserved
 */
package com.ly.rw.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Description Of The Class<br/>
 * QQ:1211956756 
 *
 * @author 	(宗寿金 07814)
 * @version 1.0.0, 2015年1月5日-下午3:23:48
 * @since 2015年1月5日-下午3:23:48
 */

@Entity
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int id;
	
	private String name;
	
	private String password;

	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password
				+ "]";
	}
}

