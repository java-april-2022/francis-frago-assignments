package com.ffrago.RenderingBooks.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ffrago.RenderingBooks.models.BookModel;
import com.ffrago.RenderingBooks.services.BookService;

@Controller
public class BookController {

	@Autowired
	BookService bookService;

	@RequestMapping("/books/{id}")
	public String show(Model model, @PathVariable("id") Long id) {
     BookModel book = bookService.findBook(id);
     model.addAttribute("showBook",book);
     
     return "show.jsp";
	}
}
