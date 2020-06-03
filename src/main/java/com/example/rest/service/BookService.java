package com.example.rest.service;

import java.util.Collection;

import com.example.rest.model.Book;

public interface BookService {
	
	Collection<Book> findAll();
	
	Book findById(int id);

	Book save(Book b);

	Book update(Book b);

	Book deleteById(int id);

	

}
