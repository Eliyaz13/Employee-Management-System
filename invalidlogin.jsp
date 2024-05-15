<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>invalidloginjsp</title>
<link rel="stylesheet" href="login.css">
</head>
<body>
	
	<h1>Employee Mangement System</h1>
	
	<h2 class="invalid">Invalid Login Details</h2>
	<div class="container">
        <div class="form_header">
            <h2>Enter the Details</h2>
        </div>

        <div class="form_body">
            <form action = "LoginPage">
                <label>USERNAME</label><br>
                <input type="text" placeholder="username"  name="username" class="field">
                
                <br><br>
                <label>password</label><br>

                <input type="password" placeholder="password" name="password"  class="field">
               
                <br><br>
              
               <input type="submit" value="Login" class="btn">
            </form><br>
            <div class="form-footer">
                <span>not a member?</span>
                <a href="registration.html" class="sign">Singn Up</a>
    
            </div>
    
        </div>
       
    </div>

</body>
</html>