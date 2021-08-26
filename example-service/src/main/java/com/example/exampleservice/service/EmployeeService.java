package com.example.exampleservice.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.stereotype.Service;

import com.example.exampleservice.model.Employee;

@Service
public class EmployeeService {

	static final Logger log = LoggerFactory.getLogger(EmployeeService.class);

	public Employee getEmployee() {
		
		log.debug("Get Employee in side EmployeeService");
		Employee employee = new Employee("John", 30);
		log.debug("Retriving Employee");
		return employee;
	}

}
