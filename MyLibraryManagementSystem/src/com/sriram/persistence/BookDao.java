package com.sriram.persistence;

import java.util.ArrayList;

import com.sriram.bean.Book;

public interface BookDao {
	ArrayList<Book>getAllBookRecords();
	Book searchBookById(String id);
}
