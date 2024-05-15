package com.tap.employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class AdminDB {
	
	static Connection con=null;
	static PreparedStatement stmt=null;
	static ResultSet res=null;
	static String url="jdbc:mysql://localhost:3306/employeemanagement";
	static String un="root";
	static String pwd="mysql";
	
	static String query =" insert into admin (`fullname`,`username`,`email`,`phonenumber`,`password`,`confirmpassword`) values(?,?,?,?,?,?)";
	
	public static int save(Admin s) {
		
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
				
				stmt.setString(1, s.getFullname());
				stmt.setString(2, s.getUsername());
				stmt.setString(3,s.getEmail());
				stmt.setString(4,s.getPhonenumber());
				stmt.setString(5, s.getPassword());
				stmt.setString(6, s.getConfirmpassword());
				
				int i=stmt.executeUpdate();
				return i;
			} catch (SQLException e) {
			
				e.printStackTrace();
			}
			return 0;
	
	}

}
