package com.sriram.database;

import java.util.ArrayList;

import com.sriram.bean.Book;

public class BookList {
	
	private static ArrayList<Book>books=new ArrayList<>();
	static{
		books.add(new Book("123","dk"));
		books.add(new Book("124","ab"));
		books.add(new Book("125","cd"));
		books.add(new Book("126","ef"));
		books.add(new Book("127","gh"));
		books.add(new Book("128","ij"));
		books.add(new Book("129","kl"));
		books.add(new Book("130","dmnk"));
	}
	
	public static ArrayList<Book> getAllBooks(){
		return books;
	}
}
