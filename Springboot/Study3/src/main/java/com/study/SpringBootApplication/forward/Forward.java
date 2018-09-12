package com.study.SpringBootApplication.forward;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController

public class Forward {

	@RequestMapping(value = "/")
	public ModelAndView index(ModelAndView mav_root) {
		mav_root.setViewName("index");
		return mav_root;
	}

	@RequestMapping(value = "/other")
	public ModelAndView other(ModelAndView mav_other) {
		mav_other.setViewName("redirect:/");
		return mav_other;
	}

	@RequestMapping(value = "/home")
	public ModelAndView home(ModelAndView mav_home) {
		mav_home.setViewName("forward:/");
		return mav_home;
	}

}
