package com.tap.employee;

public class Employee {
	private int empid;
	private String empname;
	private String email;
	private String department;
	private int salary;
	private String phonenumber;
	
	public Employee(int empid, String empname, String email, String department, int salary, String phonenumber) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.email = email;
		this.department = department;
		this.salary = salary;
		this.phonenumber = phonenumber;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	
	
	
	
	
}
