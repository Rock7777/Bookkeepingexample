package com.example.rest.service.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.rest.model.Book;
import com.example.rest.service.BookService;

@Service
public class BookServiceImpl implements BookService {
	
	private int id = 100;
	 
	private Map<Integer,Book> bookMap = new HashMap<Integer,Book>(); 
	
	//Static block
	{
		Book b = new Book();
		b.setId(id);
		b.setTitle("Fountain Head");
		b.setAuthor("Ayn Rand");
		b.setPrice(200);
		b.setLanguage("English");
		bookMap.put(b.getId(), b);
	}
	{
		Book b1 = new Book();
		id = id + 1;
		b1.setId(id);
		b1.setTitle("Fountain");
		b1.setAuthor("Ayn");
		b1.setPrice(100);
		b1.setLanguage("English");
		bookMap.put(b1.getId(), b1);
	}
	
    @Override
	public Collection<Book> findAll() {
		
    	return bookMap.values();
	}

	@Override
	public Book findById(int id) {
		// TODO Auto-generated method stub
		return bookMap.get(id);
	}

	@Override
	public Book save(Book b) {
		// TODO Auto-generated method stub
		int newbookId=++id;
		b.setId(newbookId);
		bookMap.put(b.getId(), b);
		return bookMap.get(newbookId);
	}

	@Override
	public Book update(Book b) {
		id=b.getId();
		if(bookMap.get(id)!=null)
		{
			bookMap.put(id,b);
			return bookMap.get(id);
		}
		return null;
	}

	@Override
	public Book deleteById(int id) {
		// TODO Auto-generated method stub
		if(bookMap.get(id)!=null)
		{
			return bookMap.remove(id);
		}
		return null;
	}

}
