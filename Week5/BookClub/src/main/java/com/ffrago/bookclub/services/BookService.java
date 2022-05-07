package com.ffrago.bookclub.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ffrago.bookclub.models.Book;
import com.ffrago.bookclub.repositories.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;

//Get All Books
	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	}

// Get Book
	public Book showOne(Long id) {
		return bookRepository.findById(id).orElse(null);
	}

// Create Book
	public Book create(Book book) {
		return bookRepository.save(book);
	}

// Update Book
	public Book update(Book book) {
		return bookRepository.save(book);
	}
	
// Delet Book
	public void delete(Book book) {
		
		bookRepository.delete(book);
	}
	
	
}
