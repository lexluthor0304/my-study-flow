package com.study.SpringBootApplication.lexController;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class LexController {
	
	@Value("${my.name}")
	private String name;
	
	@Value("${my.age}")
	private String age;
	
	@RequestMapping("/lex")
	public String lex() {
		return name + ":" + age;
	}
}
