package com.spring.documentdb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.documentdb.entity.Book;
import com.spring.documentdb.service.Library;

@RestController
public class LibraryController {
	@Autowired
	private Library library;

	@GetMapping("/")
	public String hello() {
		return "Hello , welcome to library";
	}

	@GetMapping("/all")
	public List<Book> getBooks(){
		return library.getAll();
	}
	
	@PostMapping("/book/{title}/author/{author}")
	public Book add(@PathVariable String title,@PathVariable String author) {
		return library.insertBook(title, author);
	}

}
