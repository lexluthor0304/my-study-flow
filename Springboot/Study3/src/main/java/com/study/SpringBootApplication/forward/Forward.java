package com.study.SpringBootApplication.forward;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


public class Forward {

	@RequestMapping(value = "/")
	public ModelAndView index(ModelAndView mav) {
		mav.setViewName("index");
		return mav;
	}

	@RequestMapping(value = "/other")
	public ModelAndView other(ModelAndView mav1) {
		mav1.setViewName("redirect:/");
		return mav1;
	}

	@RequestMapping(value = "/home")
	public ModelAndView home(ModelAndView mav2) {
		mav2.setViewName("forward:/");
		return mav2;
	}

}
