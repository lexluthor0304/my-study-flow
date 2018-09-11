package com.study.SpringBootApplication.forward;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Forward {

	 @RequestMapping(value="/")
	 public ModelAndView index(ModelAndView mav) {
		 mav.setViewName("index");
		 return mav;
	 }
	 
	 @RequestMapping(value="/other")
	 public ModelAndView other(ModelAndView mav1) {
		 mav1.setViewName("redirect:/");
		 return mav1;
	 }
	 
	 @RequestMapping(value="/home")
	 public ModelAndView home(ModelAndView mav2) {
		 mav2.setViewName("forward:/");
		 return mav2;
	 }
	 
	 @RequestMapping(value="/home1")
	 public ModelAndView index1(ModelAndView mav) {
		 mav.setViewName("index1");
		 return mav;
	 }
}
