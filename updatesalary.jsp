<%@ page import="com.tap.employee.UpdateEmpName" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
 h2{
      color: darkblue;
      font-size: 50px;
      margin-top: 40px;
      margin-left: 30px;
   }

</style>
</head>
<body>

	<%! int i=0; %>

	<%String sal=request.getParameter("salary");
		int salary=Integer.parseInt(sal);
	
	%>
		
	<%
	
		String empid=(String)( pageContext.getAttribute("id", PageContext.SESSION_SCOPE ));
		int num=Integer.parseInt(empid);
	
	%>
		
	
	<%=empid %>
	<%=num %>
	
	
	<%i=UpdateEmpName.updateSalary(num,salary) ;%>
	
	<% if(i == 1){ %>
	
		<h2>Employee PhoneNumber Updated Successfully!!</h2>
	<%} else { %>
		<h2>Employee Department NOT Updated Successfully!!</h2>
		
	<%} %>

</body>
</html>