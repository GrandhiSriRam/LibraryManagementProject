package com.sriram.persistence;

import java.util.ArrayList;

import com.sriram.bean.Book;
import com.sriram.database.BookList;

public class BookDaoImpl implements BookDao{

	@Override
	public ArrayList<Book> getAllBookRecords() {
		
		ArrayList<Book>books=BookList.getAllBooks();
		return books;
	}

	@Override
	public Book searchBookById(String id) {
		
		ArrayList<Book>books=BookList.getAllBooks();
		for(Book book:books) {
			if(book.getBookID().equals(id)) {
				return book;
			}
		}
		return null;
	}
	
}
