package com.tap.employee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddEmployee
 */
@WebServlet("/AddEmployee")
public class AddEmployee extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int empid =Integer.parseInt( req.getParameter("empid"));
		String empname=req.getParameter("empname");
		String email=req.getParameter("email");
		String department=req.getParameter("department");
		int salary =Integer.parseInt( req.getParameter("salary"));
		String phonenumber=req.getParameter("phonenumber");
		
		Employee e = new Employee(empid,empname,email,department,salary,phonenumber);
		
		int i = AddEmployeeDB.save(e);
		
		resp.setContentType("text/html");
		
		PrintWriter writer = resp.getWriter();
		
		if(i==1) {
			writer.println("<h1> successfully Added!!</h2>");
		}
		else {
			writer.println("<h1>please enter the correct details!!!</h1>");
		}
		
	}

	

}
