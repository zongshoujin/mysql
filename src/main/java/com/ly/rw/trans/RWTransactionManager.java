/**
 * Creation Date:2014年12月30日-下午6:47:51
 * 
 * Copyright 2008-2014 © 同程网 Inc. All Rights Reserved
 */
package com.ly.rw.trans;

import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionException;
import org.springframework.transaction.support.AbstractPlatformTransactionManager;
import org.springframework.transaction.support.DefaultTransactionStatus;

/**
 * Description Of The Class<br/>
 * QQ:1211956756 
 *
 * @author 	(宗寿金 07814)
 * @version 1.0.0, 2014年12月30日-下午6:47:51
 * @since 2014年12月30日-下午6:47:51
 */
public class RWTransactionManager extends AbstractPlatformTransactionManager {

	@Override
	protected Object doGetTransaction() throws TransactionException {
		return null;
	}

	@Override
	protected void doBegin(Object transaction, TransactionDefinition definition)
			throws TransactionException {

	}

	@Override
	protected void doCommit(DefaultTransactionStatus status)
			throws TransactionException {

	}

	@Override
	protected void doRollback(DefaultTransactionStatus status)
			throws TransactionException {

	}

}

