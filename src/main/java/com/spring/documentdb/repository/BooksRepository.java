package com.spring.documentdb.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.spring.documentdb.entity.Book;

public interface BooksRepository extends PagingAndSortingRepository<Book, Long> {

}
