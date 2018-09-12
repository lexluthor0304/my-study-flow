package com.study.SpringBootApplication.DataObject;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController

public class HelloController {

	String[] names = { "tuyano", "hanako", "taro", "sachiko", "ichiro" };

	String[] mails = { "syoda@tuuyano.com", "hanako@flower", "taro@yamada", "sachiko@happy", "ichiro@baseball"

	};
	/*
	 * バージョン1 return id
	 */
	/*
	 * @RequestMapping("/{id}") public DataObject index(@PathVariable int id) {
	 * return new DataObject(id, names[id], mails[id]); }
	 */

	/*
	 * バージョン2 偶数奇数チェック
	 */

	/*
	 * @RequestMapping("/{id}") public ModelAndView index(@PathVariable int id,
	 * ModelAndView mav_var) {
	 * 
	 * mav_var.setViewName("index_html"); mav_var.addObject("id", id);
	 * mav_var.addObject("check", id%2 == 0); mav_var.addObject("trueVal",
	 * "Even number!"); mav_var.addObject("falseVal", "Odd number..."); return
	 * mav_var; }
	 */

	/*
	 * バージョン3 0以上
	 */
	/*
	 * @RequestMapping("/{id}") public ModelAndView index(@PathVariable int id,
	 * ModelAndView mav_var) {
	 * 
	 * mav_var.setViewName("true_false"); mav_var.addObject("id", id);
	 * mav_var.addObject("check", id > 0); mav_var.addObject("trueVal", "POSTIVE!");
	 * mav_var.addObject("falseVal", "negative..."); return mav_var; }
	 */

	/*
	 * バージョン4 季節判断
	 */
/*	@RequestMapping("/{mouth}")
	public ModelAndView index(@PathVariable int mouth, ModelAndView mav_var) {

		mav_var.setViewName("month");
		int m = Math.abs(mouth) % 12;
		m = m == 0 ? 12 :m;
		mav_var.addObject("month", m);
		mav_var.addObject("check", Math.floor(m / 3));
		return mav_var;
	}*/

	/*
	 * バージョン5 循環
	 */
	@RequestMapping("/{mouth}")
	public ModelAndView index(ModelAndView mav_var) {

		mav_var.setViewName("month");
		ArrayList<String[]> data = new ArrayList<String[]>();
		data.add(new String[] {"taro", "taro@yamada", "090-9999-9999"});
		data.add(new String[] {"hanako", "hanako@flower", "080-8888-8888"});
		data.add(new String[] {"sachiko", "sachiko@happy", "080-8888-8888"});
		mav_var.addObject("data", data);
		return mav_var;
	}
	
	
	class DataObject {
		private int id;
		private String name;
		private String value;

		public DataObject(int id, String name, String value) {
			// TODO Auto-generated constructor stub
			super();
			this.id = id;
			this.name = name;
			this.value = value;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}

}
