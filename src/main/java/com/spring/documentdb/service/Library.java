package com.spring.documentdb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.documentdb.entity.Book;
import com.spring.documentdb.repository.BooksRepository;

@Service
public class Library {
	
	@Autowired
	private BooksRepository repository;
	
	public Book insertBook(String title,String author) {		
		return repository.save(new Book (title, author));
	}
	
	public List<Book> getAll() {
		return (List<Book>)repository.findAll();
	}

}
