package com.tap.employee;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeleteEmployee
 */
@WebServlet("/DeleteEmployee")
public class DeleteEmployee extends HttpServlet {
	static Connection con=null;
	static PreparedStatement stmt=null;
	static ResultSet res=null;
	static String url="jdbc:mysql://localhost:3306/employeemanagement";
	static String un="root";
	static String pwd="mysql";
	
	static String query = "delete from employee where empid = ? ";
	
	

	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String deletevalue =( req.getParameter("empid"));
		System.out.println(deletevalue);
		System.out.println(deletevalue+10);
		int empid=Integer.parseInt(deletevalue);
		
		System.out.println(empid+10);
		
		System.out.println("request");
		
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
			
			stmt.setInt(1, empid);
			
			int i=stmt.executeUpdate();
			
			
			
			resp.setContentType("text/html");
			
			PrintWriter writer = resp.getWriter();
			
			if(i==1) {
				RequestDispatcher rd = req.getRequestDispatcher("/employeelist.jsp");
				rd.forward(req, resp);
			}
			else {
				writer.println("<h1>please enter the correct details!!!</h1>");
			}
			
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
		
		
	}
	

}
