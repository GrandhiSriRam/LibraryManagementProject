package com.sriram.service;

import java.util.ArrayList;

import com.sriram.bean.Book;
import com.sriram.persistence.BookDaoImpl;
import com.sriram.persistence.BookDao;

public class BookServiceImpl implements BookService{

	private BookDao bookDao=new BookDaoImpl();
	@Override
	public ArrayList<Book> getAllBooks() {
		
		return bookDao.getAllBookRecords();
	}
	@Override
	public Book searchBook(String id) {
		// TODO Auto-generated method stub
		return bookDao.searchBookById(id);
	}

}
