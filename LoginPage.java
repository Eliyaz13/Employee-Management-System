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
 * Servlet implementation class LoginPage
 */
@WebServlet("/LoginPage")
public class LoginPage extends HttpServlet {
	Connection con=null;
	PreparedStatement stmt=null;
	ResultSet res=null;
	String url="jdbc:mysql://localhost:3306/example1";
	String un="root";
	String pwd="mysql";
	
	
	// jdbc 1st and 2nd steps
	// 1.class loading and 2.create connection
	// override the init() method
		
		@Override
		public void init() throws ServletException {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("driver class loaded successfully");
				con=DriverManager.getConnection(url,un,pwd);
				System.out.println("connection established  successfully");
				 
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			}
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		// to perform jdbc remainong steps inside the dogetmethod
		
		
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			String username=req.getParameter("username");
			String password=req.getParameter("password");
			String query="select * from admin where username = ? and password = ?";
			
			resp.setContentType("text/html");
			PrintWriter writer = resp.getWriter();
			
			try {
				stmt=con.prepareStatement(query);
				stmt.setString(1, username);
				stmt.setString(2, password);
				
				res=stmt.executeQuery();
				System.out.println("hii");
				
				if(res.next()== true) {
					//writer.println("<h2>Welcome "+accnumber +" !</h2>");
					
					
					System.out.println("valid userr");
					
					RequestDispatcher rd = req.getRequestDispatcher("/employeelist.jsp");
					rd.forward(req, resp);
						
				}
				else {
	//if the user enter the wrong un and password then again u will give the login details 
					System.out.println("wrong details");
					
					RequestDispatcher rd = req.getRequestDispatcher("/invalidlogin.jsp");
					rd.forward(req, resp);
					
					//RequestDispatcher rd = req.getRequestDispatcher("/invalidlogin.html");
					//rd.forward(req, resp);
					
				}
			} catch (SQLException e) {
				
				e.printStackTrace();
				
			}
			
			
			
		}

}
