/**
 * @Ravenloup-v1.0.
 */
package com.spring.sample.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author sunil.yadav
 *
 */
@Controller
public class HomeController {

	@RequestMapping(value = { "/", "/shome" }, method = RequestMethod.GET)
	public String home() {
		return "home";
	}

	@RequestMapping(value = { "/message" }, method = RequestMethod.GET)
	public ModelAndView message() {
		ModelAndView modelAndView = new ModelAndView("message");
		modelAndView.addObject("count", 4);
		modelAndView.addObject("count2", 2);
		return modelAndView;
	}

	@RequestMapping(value = "/model", method = RequestMethod.GET)
	@ResponseBody
	public String model() {
		return "sampleapp";
	}
}
