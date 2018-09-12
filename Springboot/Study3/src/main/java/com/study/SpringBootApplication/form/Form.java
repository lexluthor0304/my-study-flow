package com.study.SpringBootApplication.form;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class Form {

	@RequestMapping(value = "/form", method = RequestMethod.GET)
	public ModelAndView index(ModelAndView mav_form) {
		mav_form.setViewName("form");
		mav_form.addObject("msg_form", "お名前を書いて送信して下さい");
		
		return mav_form;
	}
	
	@RequestMapping(value = "/form", method = RequestMethod.POST)
	public ModelAndView send(@RequestParam("text1")String str, 
			ModelAndView mav_form) {
		mav_form.addObject("msg_form", "こんにちは、" + str + "さん！");
		mav_form.addObject("value", str);
		mav_form.setViewName("form");
		return mav_form;
	}
}
