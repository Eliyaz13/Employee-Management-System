package com.tap.employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UpdateEmpName {
	
	static Connection con=null;
	static PreparedStatement stmt=null;
	static ResultSet res=null;
	static String url="jdbc:mysql://localhost:3306/employeemanagement";
	static String un="root";
	static String pwd="mysql";
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver class loaded successfully");
			con=DriverManager.getConnection(url,un,pwd);
			System.out.println("connection established  successfully");
			
		}
		catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	
	}
}
	
	public static int updateName(int empid,String empname) {
		
			String query =" update employee set empname=? where empid=?";
			
			  try {
				  stmt = con.prepareStatement(query);
				  stmt.setInt(2, empid);
				  stmt.setString(1, empname);
				  
				  int i = stmt.executeUpdate();
				  return i;
			 
				} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
				return 0;
	}
		
	
	public static int updateEmail(int empid,String email) {
		
		try {
			
			String query =" update employee set email=? where empid=?";
			stmt = con.prepareStatement(query);
			stmt.setInt(2, empid);
			stmt.setString(1, email);
			int i = stmt.executeUpdate();
			return i;
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}



	public static int updateDepartment(int empid,String department) {
		
		try {
			
			String query =" update employee set department=? where empid=?";
			stmt = con.prepareStatement(query);
			stmt.setInt(2, empid);
			stmt.setString(1, department);
			int i = stmt.executeUpdate();
			return i;
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	
	public static int updatePhonenumber(int empid,String phonenumber) {
		
		try {
			
			String query =" update employee set phonenumber=? where empid=?";
			stmt = con.prepareStatement(query);
			stmt.setInt(2, empid);
			stmt.setString(1, phonenumber);
			int i = stmt.executeUpdate();
			return i;
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	
	public static int updateSalary(int empid,int salary) {
		
		try {
			
			String query =" update employee set salary=? where empid=?";
			stmt = con.prepareStatement(query);
			stmt.setInt(2, empid);
			stmt.setInt(1, salary);
			int i = stmt.executeUpdate();
			return i;
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	
	public static int updateEmpID(int empid,int id) {
		
		try {
			
			String query =" update employee set empid=? where empid=?";
			stmt = con.prepareStatement(query);
			stmt.setInt(2, empid);
			stmt.setInt(1, id);
			int i = stmt.executeUpdate();
			return i;
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	


}
