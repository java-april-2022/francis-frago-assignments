package com.ffrago.savetravels.services;

import java.util.List;
<<<<<<< HEAD
=======
import java.util.Optional;
>>>>>>> 886370d27c3a0fefe34e41921cca32ee34987097

import org.springframework.stereotype.Service;

import com.ffrago.savetravels.models.ExpenseModel;
import com.ffrago.savetravels.repositories.ExpenseRepository;

@Service
public class ExpenseService {
	private final ExpenseRepository expenseRepository;
	
	public ExpenseService(ExpenseRepository expenseRepository) {
		this.expenseRepository = expenseRepository;
	}
	
<<<<<<< HEAD
	 // return all expenses
=======
	 // returns all the expenses
>>>>>>> 886370d27c3a0fefe34e41921cca32ee34987097
    public List<ExpenseModel> allExpenses() {
        return expenseRepository.findAll();
    }
    
<<<<<<< HEAD
    // create an expense
    public ExpenseModel createExpense(ExpenseModel b) {
        return expenseRepository.save(b);
    }
=======
    // creates a expense
    public ExpenseModel createExpense(ExpenseModel b) {
        return expenseRepository.save(b);
    }
    
    // retrieves a expense
    public ExpenseModel findExpense(Long id) {
        Optional<ExpenseModel> optionalExpense = expenseRepository.findById(id);
        if(optionalExpense.isPresent()) {
            return optionalExpense.get();
        } else {
            return null;
        }
    }
    
    // updates the expense
    public ExpenseModel updateExpense(ExpenseModel updatedExpense) {
    	return expenseRepository.save(updatedExpense);
    }
    
    public void deleteExpense(Long id) {
    	Optional<ExpenseModel> deleteExpenseAction = expenseRepository.findById(id);
    	if(deleteExpenseAction.isPresent()) {
    		expenseRepository.deleteById(id);
    	} 
    	else {
    		System.out.println("Failed to delete");
    	}
    }
>>>>>>> 886370d27c3a0fefe34e41921cca32ee34987097
}
