package com.example.demo.controller;
import com.example.demo.entity.DataEntity;
import com.example.demo.service.DataService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class DataControl {
	
	@Autowired
	private DataService d1; 
	
	@RequestMapping(method=RequestMethod.POST,value="/cheapest")
	public void fastest(@RequestBody DataEntity d) {
		
		
		
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/cheapest")
	public void cheapest(@RequestBody DataEntity d) {
		
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/showall")
	public ResponseEntity<List<DataEntity>> showAll(@RequestBody DataEntity d) {
		List<DataEntity> data = d1.fetchRecords();
		return new ResponseEntity<>(data,HttpStatus.OK);
	}

}
