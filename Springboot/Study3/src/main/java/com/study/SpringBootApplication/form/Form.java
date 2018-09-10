package com.study.SpringBootApplication.form;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class Form {

	@RequestMapping(value = "/form", method = RequestMethod.GET)
	public ModelAndView index(ModelAndView mav) {
		mav.setViewName("form");
		mav.addObject("msg", "お名前を書いて送信して下さい");
		
		return mav;
	}
	
	@RequestMapping(value = "/form", method = RequestMethod.POST)
	public ModelAndView send(@RequestParam("text1")String str, 
			ModelAndView mav) {
		mav.addObject("msg", "こんにちは、" + str + "さん！");
		mav.addObject("value", str);
		mav.setViewName("form");
		return mav;
	}
}
