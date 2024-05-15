<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MENU</title>
<link rel="stylesheet" href="menu.css">
</head>
<body>

	<h1>EMPLOYEE MANAGEMENT SYSTEM</h1>
	
	<%
		String emp=(String)(request.getParameter("empid"));
		
		pageContext.setAttribute("id",emp,PageContext.SESSION_SCOPE);
		
		int empid=Integer.parseInt(emp);
	
	%>
	<%=empid+200 %>
    <div class="container">

        <div class="input-box">
            <div class="input-field">

                <a href="updateempid.html">EMPID</a>
            </div>

            <div class="input-field">

                <a href="updateempname.html"> EMPLOYEE NAME</a>
            </div>
        </div><br>

        <div class="input-box">
            <div class="input-field">

                <a href="updateemail.html"> EMAIL</a>
            </div>

            <div class="input-field">

                <a href="updatedepaerment.html"> DEPARTMENT</a>
            </div>
        </div><br>

        <div class="input-box">
            <div class="input-field">

                <a href="updatesalary.html"> SALARY</a>
            </div>

            <div class="input-field">

                <a href="updatephonenumber.html">PHONE NUMBER</a>
            </div>
        </div>
        <div class="input-box">
            <div class="input-field">

                <a href="updateemployee.html"> UPDATE ALL</a>
            </div>

            <div class="input-field">

                <a href="employeelist.jsp">GO BACK</a>
            </div>
        </div>


    </div>

</body>
</html>