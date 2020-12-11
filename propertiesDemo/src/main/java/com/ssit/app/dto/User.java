package com.ssit.app.dto;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import lombok.Data;
@Data
@Configuration
public class User {

	 @Value("${user.fb.userName}")
	private String fbUser;
	 @Value("${user.fb.password}")
	private String fBPass;
	 @Value("${user.fb.gmailuserNAme}")
	private String gmailuserNAme;
	 @Value("${user.fb.gmailPassword}")
	private String gmailPassword;
	 @Value("${list}")
	 private List<String> arrayvalue;
	 @Value("#{'$list'.split(',')}")   
	 private List<String> listOfitems;
	 @Value("#{${values.map}}")
	 private Map<String, Integer> mapvalue;
	 
	 
}
