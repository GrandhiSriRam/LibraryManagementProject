package com.sriram.service;

import java.util.ArrayList;

import com.sriram.bean.Book;

public interface BookService {
	ArrayList<Book>getAllBooks();
	Book searchBook(String id);
}
