package com.ffrago.savetravels.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ffrago.savetravels.models.ExpenseModel;
import com.ffrago.savetravels.services.ExpenseService;


@Controller
public class ExpenseController {
	
	@Autowired
	ExpenseService expenseService;
	
	
	@GetMapping("/")
	public String home() {
		return "redirect:/expenses";
	}
	
	@GetMapping("/expenses")
	public String index(Model model, @ModelAttribute("expense") ExpenseModel expense) {
		List<ExpenseModel> expenses = expenseService.allExpenses();
		model.addAttribute("allExpenses",expenses);
		return "index.jsp";
	}
	
	@PostMapping("/expenses")
	public String create(
			@Valid @ModelAttribute("expense") ExpenseModel expense, BindingResult result) {
		if (result.hasErrors()) {
			return "index.jsp";
			} else {
				expenseService.createExpense(expense);
				return "redirect:/expenses";				
			}
	}
 
}