<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>WelCome</title>
</head>
<body bgcolor="pink">
	<center>
		<h2 style="color: blue">
			<u>SignIn Page</u>
		</h2>
		<form:form modelAttribute="loginCmd" method="POST">
			<table border="10" bordercolor="maroon" height="50" width="75">
				<tr>
					<td bordercolor="blue">UserName::</td>
					<td bordercolor="blue"><form:input path="userName" /></td>
				</tr>
				<tr>
					<td bordercolor="blue">Password::</td>
					<td bordercolor="blue"><form:password path="password" /></td>
				</tr>
				<tr>
					<td bordercolor="blue" align="center"><a href="#">Forgot
							Password</a></td>
					<td bordercolor="blue"><input type="submit" name=""
						value="Sign In">&nbsp;</td>
				</tr>
			</table>
		</form:form>
	</center>
</body>
</html>