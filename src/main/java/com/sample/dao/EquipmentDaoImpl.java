package com.sample.dao;

import org.springframework.stereotype.Component;

@Component
public class EquipmentDaoImpl implements CroDao {

	public void readData() {
		System.out.println("Reading Data EquipmentDaoImpl");
		System.out.println("hello");

	}

	public void insertData() {
		System.out.println("Inserting Data EquipmentDaoImpl");

	}

}
