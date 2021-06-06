package com.sriram.bean;

public class Book {
	private String bookID;
	private String title;
//	private int totalCount=10;
	public Book(String bookID, String title) {
		super();
		this.bookID = bookID;
		this.title = title;
//		this.totalCount=totalCount;
	}
	public String getBookID() {
		return bookID;
	}
	public void setBookID(String bookID) {
		this.bookID = bookID;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "Book [BookID=" + bookID + ", title=" + title + "]";
	}
	
}
