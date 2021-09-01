<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
<link rel="stylesheet" href="register.css" type="text/css">
</head>
<body>
<body>
	<div class="container">

		<form id="signup" action="insertData" method="post">

			<div class="header">

				<h3>Sign Up</h3>

				<p>You want to fill out this form</p>

			</div>

			<div class="sep"></div>

			<div class="inputs">
				<input type="text" name="firstName" placeholder="firstName" required />
				<input type="text" name="lastName" placeholder="lastName" required />
				<input type="text" name="Address" placeholder="Address" /> 
				<input type="text" name="Zip"  placeholder="Zip" /> 
				<input type="text" name="State" placeholder="State" />
				<input type="text" name="Country" placeholder="Country" /> 
				<input type="text" name="Phone" placeholder="Phone" /> 
				<input type="email" name="Username" placeholder="e-mail" />
                <input type="password" name="Password" placeholder="Password" />
                <a id="submit"href="#">SIGN UP FOR INVITE NOW</a>

			</div>

		</form>

	</div>
	​
</body>
</html>