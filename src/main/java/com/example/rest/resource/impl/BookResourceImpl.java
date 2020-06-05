package com.example.rest.resource.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest.model.Book;

import com.example.rest.resource.Resource;
import com.example.rest.service.BookService;

@RestController
@RequestMapping("/books")

public class BookResourceImpl implements Resource<Book> {

	@Autowired
	private BookService bookservice;
	
	@Override
	public ResponseEntity<Collection<Book>> findAll() {
		// TODO Auto-generated method stub
		return new ResponseEntity<>(bookservice.findAll(),HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Book> findById(int id) {
		// TODO Auto-generated method stub
		return new ResponseEntity<>(bookservice.findById(id),HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Book> save(Book t) {
		// TODO Auto-generated method stub
		return new ResponseEntity<>(bookservice.save(t),HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Book> update(Book t) {
		// TODO Auto-generated method stub
		return new ResponseEntity<>(bookservice.update(t),HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Book> deleteById(int id) {
		// TODO Auto-generated method stub
		return new ResponseEntity<>(bookservice.deleteById(id),HttpStatus.OK);
	}

}
