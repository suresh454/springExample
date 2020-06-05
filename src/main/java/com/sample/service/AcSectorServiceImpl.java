package com.sample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.sample.dao.CroDao;

@Component
public class AcSectorServiceImpl implements CroService {

	@Autowired
	@Qualifier(value = "acsectorDaoImpl")
	CroDao croDao;
	public void execute() {

		System.out.println("Executing AcSectorServiceImpl");
		croDao.readData();
		croDao.insertData();
	}

}
