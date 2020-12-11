package com.ssit.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssit.app.config.ConfigDemo;
import com.ssit.app.dto.User;
@RestController
@SpringBootApplication
public class PropertiesDemoApplication {

	@Autowired
	private User user;
	
	@Autowired
	private ConfigDemo configDemo;
	
	public static void main(String[] args) {
		SpringApplication.run(PropertiesDemoApplication.class, args);
	}

	
	@RequestMapping("/user")
	public String getUser() {
		return user.toString()+" :: "+user.getListOfitems()+user.getMapvalue();
	}
	
	@RequestMapping("/config")
	public String configDemo() {
		return configDemo.toString();
	}
	
	
}
