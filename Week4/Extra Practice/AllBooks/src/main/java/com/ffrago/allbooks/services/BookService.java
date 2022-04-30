package com.ffrago.allbooks.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ffrago.allbooks.models.BookModel;
import com.ffrago.allbooks.repositories.BookRepository;

@Service
public class BookService {
	private final BookRepository bookRepository;
	
	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	 // returns all the books
    public List<BookModel> allBooks() {
        return bookRepository.findAll();
    }
    
    // returns a book
    public BookModel findBook(Long id) {
        Optional<BookModel> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }

}