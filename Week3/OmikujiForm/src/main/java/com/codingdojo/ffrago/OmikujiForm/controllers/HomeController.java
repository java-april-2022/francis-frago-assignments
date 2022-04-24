package com.codingdojo.ffrago.OmikujiForm.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index() {
		return "redirect:/omikuji";
	}
	
	@RequestMapping(value="/omikuji")
	public String indexRoute() {
		return "index.jsp";
	}
	
	@RequestMapping(value="/processForm", method=RequestMethod.POST)
	public String processForm(
		@RequestParam(value="randNumber") int randNumber,
		@RequestParam(value="cityName") String cityName,
		@RequestParam(value="personName") String personName,
		@RequestParam(value="hobby") String hobby,
		@RequestParam(value="livingThing") String livingThing,
		@RequestParam(value="somethingNice") String somethingNice,
		HttpSession session) {
		String formResults=String.format(
				"In %s years, you will live in %s with %s as your roommate, %s for a living. "
				+ "The next time you see a %s, you will have good luck. Also, %s.", 
				randNumber, cityName, personName, hobby, livingThing, somethingNice
				);
		session.setAttribute("omikujiResults",formResults);
		return "redirect:/omikuji/show";
	}
	
	@RequestMapping("/omikuji/show")
	public String display(HttpSession session, Model model) {
		String showResult = (String) session.getAttribute("omikujiResults");
		model.addAttribute("result",showResult);
		return "show.jsp";
	}
}
	