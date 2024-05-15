package com.tap.employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class EmployeeList {
	
	public static ArrayList<Employee> showEmployees() {
		Connection con=null;
		PreparedStatement pstmt=null;
		Statement stmt=null;
		ResultSet res=null;
		String url="jdbc:mysql://localhost:3306/employeemanagement";
		String un="root";
		String pwd="mysql";
		
	try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver class loaded successfully");
			con=DriverManager.getConnection(url,un,pwd);
			System.out.println("connection established  successfully");
			
			String query="select * from employee";
			stmt = con.createStatement();
			res = stmt.executeQuery(query);
			
			ArrayList<Employee>  list=new ArrayList<Employee>();
			
			while(res.next() == true) {
				int empid = res.getInt("empid");
				String empname = res.getString("empname");
				String email = res.getString("email");
				String department = res.getString("department");
				int salary = res.getInt("salary");
				String phonenumber = res.getString("phonenumber");
				
				Employee emp = new Employee(empid,empname,email,department,salary,phonenumber);
				list.add(emp);
				
				
			}
			return list;
				 
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
				
	}

}
