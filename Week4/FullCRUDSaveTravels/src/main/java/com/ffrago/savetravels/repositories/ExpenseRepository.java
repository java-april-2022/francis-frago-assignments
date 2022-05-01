package com.ffrago.savetravels.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ffrago.savetravels.models.ExpenseModel;

@Repository
public interface ExpenseRepository extends CrudRepository<ExpenseModel, Long>{
	
    // this method returns all the expenses from the database
    List<ExpenseModel> findAll();
}
