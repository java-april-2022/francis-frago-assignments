package com.ffrago.RenderingBooks.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ffrago.RenderingBooks.models.BookModel;


@Repository // database connection
public interface BookRepository extends CrudRepository<BookModel, Long>{
	
    // method to retrieve all books from database
    List<BookModel> findAll();
    
    // method to find book with descriptions containing the search string
    List<BookModel> findByDescriptionContaining(String search);
    
    // method counts how many titles contain a certain string
    Long countByTitleContaining(String search);
    
    // method deletes a book that starts with a specific title
    Long deleteByTitleStartingWith(String search);

}