package com.sriram.presentation;

import java.util.ArrayList;
import java.util.Scanner;

import com.sriram.bean.Book;
import com.sriram.service.BookService;
import com.sriram.service.BookServiceImpl;

public class EmployeePresentationImpl implements EmployeePresentation{

	
	Scanner sc=new Scanner(System.in);
	private BookService bookService=new BookServiceImpl();
	
	@Override
	public void showMenu() {
		System.out.println("1. View all the Books");
		System.out.println("2. Search Book");
		System.out.println("3 Lend a Book");
	}

	@Override
	public void performMenu(int choice) {
		switch(choice) {
		case 1:
			ArrayList<Book>books=bookService.getAllBooks();
			for(Book book:books) {
				System.out.println(book);
			}
			break;
		case 2:
			System.out.println("Enter the id of the book to be searched");
			String id=sc.nextLine();
			Book book=bookService.searchBook(id);
			System.out.println(book);
			break;
		case 3:
//			System.out.println("Enter the id of the book to be lent");
//			String id=sc.nextLine();
			
		default:
			System.out.println("Enter valid option");
		}
		
	}
	
}
