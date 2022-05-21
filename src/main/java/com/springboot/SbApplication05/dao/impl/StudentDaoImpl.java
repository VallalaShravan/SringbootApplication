package com.springboot.SbApplication05.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;

import com.springboot.SbApplication05.dao.StudentDao;
import com.springboot.SbApplication05.dao.jdbc.JdbcConnection;
@Repository
@Scope(value =ConfigurableBeanFactory.SCOPE_SINGLETON, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class StudentDaoImpl implements StudentDao {

	@Autowired
	public JdbcConnection jdbcConnection;
	
	public StudentDaoImpl() {
		System.out.println("DAO -IMPL constructor");
	}
	public void info() {
		System.out.println("jdbcObject : "+jdbcConnection);
	}
}


