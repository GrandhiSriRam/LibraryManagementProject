package com.sriram.bean;

public class Employee {
	private int empId;
	private String employeeName;
	private Address address;
	private String email;
	private String phone;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", employeeName=" + employeeName + ", address=" + address + ", email="
				+ email + ", phone=" + phone + "]";
	}
	public Employee(int empId, String employeeName, Address address, String email, String phone) {
		super();
		this.empId = empId;
		this.employeeName = employeeName;
		this.address = address;
		this.email = email;
		this.phone = phone;
	}
	
	
	
	

}
