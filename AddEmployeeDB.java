package com.tap.employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AddEmployeeDB {
	
	static Connection con=null;
	static PreparedStatement stmt=null;
	static ResultSet res=null;
	static String url="jdbc:mysql://localhost:3306/employeemanagement";
	static String un="root";
	static String pwd="mysql";
	
	static String query =" insert into employee (`empid`,`empname`,`email`,`department`,`salary`,`phonenumber`) values(?,?,?,?,?,?)";
	
	
	public static int save (Employee emp) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url,un,pwd);
		} 
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		System.out.println("object is created....");
		
		try {
			stmt=con.prepareStatement(query);
			
			stmt.setInt(1, emp.getEmpid());
			stmt.setString(2, emp.getEmpname());
			stmt.setString(3,emp.getEmail());
			stmt.setString(4,emp.getDepartment());
			stmt.setInt(5, emp.getSalary());
			stmt.setString(6, emp.getPhonenumber());
			
			int i=stmt.executeUpdate();
			return i;
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		return 0;
		
		
		
	}

}
