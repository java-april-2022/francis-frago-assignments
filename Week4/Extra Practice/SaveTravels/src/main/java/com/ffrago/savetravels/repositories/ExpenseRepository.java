package com.ffrago.savetravels.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ffrago.savetravels.models.ExpenseModel;

@Repository // connection to the database
public interface ExpenseRepository extends CrudRepository<ExpenseModel, Long>{
<<<<<<< HEAD

=======
	
    // this method retrieves all the expenses from the database
>>>>>>> 886370d27c3a0fefe34e41921cca32ee34987097
    List<ExpenseModel> findAll();
}
