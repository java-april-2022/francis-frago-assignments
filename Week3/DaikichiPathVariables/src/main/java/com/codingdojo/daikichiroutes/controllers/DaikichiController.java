package com.codingdojo.daikichiroutes.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// reuse daikichiroutes

@RestController
@RequestMapping ("daikichi")

public class DaikichiController {
	
	@RequestMapping("")
	public String index() {
		return "Welcome!";
	}
	
	@RequestMapping("/today")
	public String today() {
		return "Today you will find luch in all your endavors!";
	}
	
	@RequestMapping("/tomorrow")
	public String tomorrow() {
		return "Tomorrow an opportunity will arise, so be sure to be open to new ideas!";
	}
	
	
// adding path variables
	
	@RequestMapping("/{action}/{location}")
	public String action(
			@PathVariable("action") String action,
			@PathVariable("location") String location) {
		return "Congratulations! You will soon " + action + " to " + location + "!";
	}
	
	@RequestMapping("/lotto/{integer}")
	public String lotto(
			@PathVariable("integer") Integer integer) {
		if(integer%2 == 0) {
			return "You will take a grand journey in the near future, but be wary of tempting offers";			
		} else {
			return "You have enjoyed the fruits of your labor, but now is a great time to spend time with family and friends.";			
		}
	}
	
}