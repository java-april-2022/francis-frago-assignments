package com.ffrago.allbooks.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ffrago.allbooks.models.BookModel;
import com.ffrago.allbooks.services.BookService;

@Controller
public class BookController {

	@Autowired
	BookService bookService;
	
	@RequestMapping("/books")
	public String index(Model model) {
		List<BookModel> books = bookService.allBooks();
		model.addAttribute("allBooks",books);
		return "index.jsp";
 }

	@RequestMapping("/books/{id}")
	public String show(Model model, @PathVariable("id") Long id) {
     BookModel book = bookService.findBook(id);
     model.addAttribute("showBook",book);
     
     return "show.jsp";
	}
}