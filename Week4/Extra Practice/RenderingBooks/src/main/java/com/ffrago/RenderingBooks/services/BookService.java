package com.ffrago.RenderingBooks.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ffrago.RenderingBooks.models.BookModel;
import com.ffrago.RenderingBooks.repositories.BookRepository;


@Service
public class BookService {
	private final BookRepository bookRepository;
	
	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
    // retrieves a book
    public BookModel findBook(Long id) {
        Optional<BookModel> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
    
}

