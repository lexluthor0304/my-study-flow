package com.study.SpringBootApplication.defaultcontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController

public class Controller {

	@RequestMapping(value = "/index_html")
	public ModelAndView index(ModelAndView mav4) {
		mav4.setViewName("index_html");
		mav4.addObject("html_msg", "message 1<hr/>message 2<br/>message 3");
		return mav4;
	}
}
