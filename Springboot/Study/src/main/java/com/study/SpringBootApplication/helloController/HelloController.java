package com.study.SpringBootApplication.helloController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {
//print hello world
	@RequestMapping("/hello")
	public String index() {
		return "hello Spring boot";
	}
//get element for application.yml


}
