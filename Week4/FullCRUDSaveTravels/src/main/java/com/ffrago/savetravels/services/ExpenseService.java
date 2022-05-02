package com.ffrago.savetravels.services;

import java.util.List;
import java.util.Optional;

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
    
    // return an expense
    public ExpenseModel findExpense(Long id) {
        Optional<ExpenseModel> oneExpense = expenseRepository.findById(id);
        if(oneExpense.isPresent()) {
            return oneExpense.get();
        } else {
            return null;
        }
    }
    
    // update an expense
    public ExpenseModel updateExpense(ExpenseModel updatedExpense) {
    	return expenseRepository.save(updatedExpense);
    }

    // destroy an expense
    public void deleteExpense(Long id) {
    	Optional<ExpenseModel> deleteExpense = expenseRepository.findById(id);
    	if(deleteExpense.isPresent()) {
    		expenseRepository.deleteById(id);
    	} 
    	else {
    		System.out.println("Unable to delete item");
    	}
    }
}
