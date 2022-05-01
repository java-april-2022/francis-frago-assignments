package com.ffrago.savetravels.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

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
 
	 @GetMapping("/expenses/{id}")
	 public String show(Model model, @PathVariable("id") Long id) {
		 ExpenseModel expense = expenseService.findExpense(id);
		 model.addAttribute("showExpense",expense);
		 return "show.jsp";
	 }
	 
    @GetMapping("/expenses/edit/{id}")
	 public String edit(Model model, @PathVariable("id") Long id) {
		 ExpenseModel expense = expenseService.findExpense(id);
		 model.addAttribute("editExpense",expense);
        return "edit.jsp";
    }
    
    @PutMapping("/expenses/{id}")
    public String update(
    		@Valid @ModelAttribute("expense") ExpenseModel expense, BindingResult result) {
        if (result.hasErrors()) {
            return "edit.jsp";
        } else {
            expenseService.updateExpense(expense);
            return "redirect:/expenses";
        }
    }
    
	@GetMapping("/expenses/delete/{id}")
	public String destroy(@PathVariable Long id) {
		expenseService.deleteExpense(id);
		return "redirect:/";
	}
}