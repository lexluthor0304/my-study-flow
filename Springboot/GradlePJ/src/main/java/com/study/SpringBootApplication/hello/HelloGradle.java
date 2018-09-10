package com.study.SpringBootApplication.hello;

import org.assertj.core.data.Index;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloGradle {
	@RequestMapping("/")
	public String index() {
		 
		return "hello Gradle";
	}

}
