<%@ page import="com.tap.employee.EmployeeList" import="java.util.ArrayList" import="com.tap.employee.Employee"

language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee List</title>
<link rel="stylesheet" href="employeeliststyle.css">

</head>
<body>

	
	<%! ArrayList<Employee> list=null;
	int employeeid=0;
	
	%>
	
	<% list= EmployeeList.showEmployees(); %>
	
	<% if (list==null) {%>
		<h2>employe list is not display</h2><br>
		
	<%} else { %>
		<h1>EMPLOYEE MANAGEMENT SYSTEM</h1>
		<h2 >List Of Employees</h2>
		<a href="addemployee.html" class="add">ADD EMPLOYEE</a><br><br>
		<table border ="1" width="700" >
			<tr >
				<th><b>EMPID</b></th>
				<th><b>EMPNAME</b></th>
				<th><b>EMAIL</b></th>
				<th><b>DEPARTMENT</b></th>
				<th><b>SALARY</b></th>
				<th><b>PHONE_NUMBER</b></th>
				<th><b>UPDATE</b></th>
				<th><b>DELETE</b></th>
				
			</tr>
			
			<% for(Employee e:list) {%>
			
				<tr>
					<td><%= e.getEmpid() %></td>
					<td><%= e.getEmpname() %></td>
					<td><%= e.getEmail() %></td>
					<td><%= e.getDepartment() %></td>
					<td><%= e.getSalary()%></td>
					<td><%= e.getPhonenumber() %></td>
					<%employeeid = e.getEmpid(); %>
					<td><a href="updateemployee.jsp?empid=<%= employeeid%>">update</a></td>
					
					<td><a href="DeleteEmployee?empid=<%= employeeid%>" >Delete</a></td>
					
				</tr>
				
			<%} %>
		
		</table>
			
	<%} %>
	
</body>
</html>