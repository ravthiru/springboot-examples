package com.example.exampleservice.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.exampleservice.model.Employee;
import com.example.exampleservice.service.EmployeeService;

@RestController
@RequestMapping("/example")
public class ExampleControlller {

	static final Logger log = LoggerFactory.getLogger(ExampleControlller.class);
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping
	@ResponseBody
	public Employee getEmployee(HttpServletRequest httpServletRequest) {
		
		log.info("Get Employee Called");
		return employeeService.getEmployee();
	}

}
