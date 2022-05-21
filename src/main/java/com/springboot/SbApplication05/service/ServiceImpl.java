package com.springboot.SbApplication05.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.springboot.SbApplication05.dao.impl.StudentDaoImpl;

@Service
@Scope(value= ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ServiceImpl {
	@Autowired
	public StudentDaoImpl studentDao;
	public ServiceImpl() {
		System.out.println("service-impl constructor");
	}
	public void info() {
		System.out.println("Dao Object : "+studentDao);
		studentDao.info();
	}
}
