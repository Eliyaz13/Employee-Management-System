package com.tap.employee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String fullname = req.getParameter("fullname");
		String username=req.getParameter("username");
		String email=req.getParameter("email");
		String phonenumber=req.getParameter("phonenumber");
		String password=req.getParameter("password");
		String confirmpassword=req.getParameter("confirmpassword");
		
		Admin s=new Admin(fullname,username,email,phonenumber,password,confirmpassword);
		
		
		int i= AdminDB.save(s);
		resp.setContentType("text/html");
		
		PrintWriter writer = resp.getWriter();
		
		if(i==1) {
			writer.println("<h1>Registered successfully!!</h2>");
		}
		else {
			writer.println("please enter the correct details!!!");
		}
	}
	

}
