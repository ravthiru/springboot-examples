package com.example.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestSpringBootController {

	@Value("${sleepTimeMilliSeconds}")
    private String sleepTimeMilliSeconds;
	
    @GetMapping("test")
    public String testDemo(){
        return "Spring Boot Application started with "+ sleepTimeMilliSeconds;
    }
}
