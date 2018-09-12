package com.study.SpringBootApplication.checkbox;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class Chkbox {

	@RequestMapping(value = "/Chkbox", method = RequestMethod.GET)
	public ModelAndView checkbox(ModelAndView mav) {
		mav.setViewName("Chkbox");
		mav.addObject("msg_chk", "フォームを送信ください。");
		return mav;
	}

	@RequestMapping(value = "/Chkbox", method = RequestMethod.POST)
	private ModelAndView send(@RequestParam(value = "check1", required = false) boolean check1,
			@RequestParam(value = "radio1", required = false) String radio1,
			@RequestParam(value = "select1", required = false) String select1,
			@RequestParam(value = "select2", required = false) String select2, ModelAndView mav) {

		String res = "";
		try {
			res = "check:" + check1 + " radio:" + radio1 + " select:" + select1 + "\nselect2:" + select2;
		} catch (NullPointerException e) {
			// TODO: handle exception
		}
		/*
		 * try { res += select2[0]; for (int i = 1; i < select2.length; i++) { res +=
		 * ", " + select2[i]; } } catch (NullPointerException e) { // TODO: handle
		 * exception res += "null"; }
		 */
		mav.addObject("msg_chk", res);
		mav.setViewName("Chkbox");
		return mav;
	}
}
