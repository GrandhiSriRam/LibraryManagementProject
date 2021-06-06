package com.sriram.client;

import java.util.Scanner;

import com.sriram.presentation.EmployeePresentation;
import com.sriram.presentation.EmployeePresentationImpl;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		EmployeePresentation presentation=new EmployeePresentationImpl();
		while(true) {
			presentation.showMenu();
			System.out.println("Enter Choice : ");
			int choice=sc.nextInt();
			presentation.performMenu(choice);
		}	
		
	}

}
