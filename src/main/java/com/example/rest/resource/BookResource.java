package com.example.rest.resource;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest.model.Book;
import com.example.rest.service.BookService;

@RestController
@RequestMapping("/books")
public class BookResource {
	@Autowired
	private BookService bookservice;

	@GetMapping
	public Collection<Book> findAll() {
		return bookservice.findAll();
	}

	@GetMapping("{id}")
	public Book findById(@PathVariable int id) {
		return bookservice.findById(id);
	}

	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public Book save(@RequestBody Book b) {
		return bookservice.save(b);
	}

	@PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public Book update( @RequestBody Book b) {
		return bookservice.update(b);
	}

	@DeleteMapping("{id}")
	public Book deleteById(@PathVariable int id) {
		return bookservice.deleteById(id);
	}
}
