package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.DataEntity;
import com.example.demo.repository.DataRepository;

public class DataService {
	
	@Autowired
	private DataRepository dataRepository;
	
	public List<DataEntity> fetchRecords() {
		return dataRepository.findAll();
	}
	
	

}
