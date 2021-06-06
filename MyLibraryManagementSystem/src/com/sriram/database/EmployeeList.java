package com.sriram.database;

import java.util.HashMap;

import com.sriram.bean.Address;
import com.sriram.bean.Employee;

public class EmployeeList {
	private static HashMap<Integer,Employee> hashmap;
	static {
		Address address=new Address("street","rjy","ap","533101","india");
		hashmap.put(101,new Employee(101,"ram",address,"@gmail","8897821535"));
	}
	public static HashMap<Integer, Employee> getHashmap() {
		return hashmap;
	}
	public static void setHashmap(HashMap<Integer, Employee> hashmap) {
		EmployeeList.hashmap = hashmap;
	}
	

}
