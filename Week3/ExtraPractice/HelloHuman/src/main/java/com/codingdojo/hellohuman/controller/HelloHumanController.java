package com.codingdojo.hellohuman.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloHumanController {

	@RequestMapping("/")
	public String index(@RequestParam(value = "name", required = false) String firstName,
			@RequestParam(value = "lastName", required = false) String lastName,
			@RequestParam(value = "times", required = false) Integer times) {
		String name = "Hello " + firstName + " " + lastName + " ";
		String result = "";

		if (firstName == null) {
			result = "Hello Human";
		} else if (times == null) {
			result = name;
		} else {
			for (int i = 1; i <= times; i++) {
				result = result + name;
			}
		}
		return result;

	}
}
