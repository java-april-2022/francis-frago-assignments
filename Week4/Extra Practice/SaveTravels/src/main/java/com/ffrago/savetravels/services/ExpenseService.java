package com.ffrago.savetravels.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ffrago.savetravels.models.ExpenseModel;
import com.ffrago.savetravels.repositories.ExpenseRepository;

@Service
public class ExpenseService {
	private final ExpenseRepository expenseRepository;
	
	public ExpenseService(ExpenseRepository expenseRepository) {
		this.expenseRepository = expenseRepository;
	}
	
	 // return all expenses
    public List<ExpenseModel> allExpenses() {
        return expenseRepository.findAll();
    }
    
    // create an expense
    public ExpenseModel createExpense(ExpenseModel b) {
        return expenseRepository.save(b);
    }
}
