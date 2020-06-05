package com.sample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.sample.dao.CroDao;

@Component
public class EquipmentServiceImpl implements CroService {
	
	@Autowired
	@Qualifier(value = "equipmentDaoImpl")
	CroDao dao;

	public void execute() {

		System.out.println("Executing EquipmentServiceImpl");
		dao.readData();
		dao.insertData();
	}

}
