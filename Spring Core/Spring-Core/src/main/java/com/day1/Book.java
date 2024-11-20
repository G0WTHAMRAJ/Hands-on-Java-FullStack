package com.day1;

import java.util.List;
import java.util.Map;

public class Book {
	private Map<String,String> books;
	private List<Author> authours;

	public List<Author> getAuthours() {
		return authours;
	}

	public void setAuthours(List<Author> authours) {
		this.authours = authours;
	}

	public Map<String, String> getBooks() {
		return books;
	}

	public void setBooks(Map<String, String> books) {
		this.books = books;
	}

	

	
	public Book(Map<String, String> books, List<Author> authours) {
		super();
		this.books = books;
		this.authours = authours;
	}

	@Override
	public String toString() {
		return "Book [books=" + books + ", authours=" + authours + "]";
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

}
