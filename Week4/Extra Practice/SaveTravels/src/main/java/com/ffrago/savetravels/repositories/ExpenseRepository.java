package com.ffrago.savetravels.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ffrago.savetravels.models.ExpenseModel;

@Repository // connection to the database
public interface ExpenseRepository extends CrudRepository<ExpenseModel, Long>{

    List<ExpenseModel> findAll();
}
