package com.codingdojo.daikichipathvariables.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("daikichi")
public class HomeController {

	@RequestMapping("/")
	public String index() {
		return "Welcome";
	}
	
	@RequestMapping("/today")
	public String today() {
		return "Today you will find luck in all your endavors!";
	
	}
	
	@RequestMapping("/{action}/{location}")
	public String congrats(
			@PathVariable("action") String action,
			@PathVariable("location") String location) {
		return "Congratulations! You will soon " + action + " to " + location + "!";
	}
	
	@RequestMapping("/lotto/{integer}")
	public String fortune(
			@PathVariable("integer") Integer integer) {
		if(integer%2 == 0) {
			return "You will take a grand journey in the near future, but be wary of tempting offers";			
		} else {
			return "You have enjoyed the fruits of your labor, but now is a great time to spend time with family and friends.";			
		}
	}
}