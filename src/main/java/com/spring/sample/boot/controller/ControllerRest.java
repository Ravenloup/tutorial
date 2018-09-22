/**
 * @Ravenloup-v1.0.
 */
package com.spring.sample.boot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sunil.yadav
 *
 */
@RestController
public class ControllerRest {

	@Value("${version}")
	private String version;

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test() {
		return "application-" + version;
	}
}
