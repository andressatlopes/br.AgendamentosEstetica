<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<form action="ClienteHomeServlet" method="post">
		<label>Usuario</label>
		<input type="text" id="UserName" name="UserName">
		<label>Senha</label>
		<input type="text" id="UserPwd" name="UserPwd"> 
		<input type="submit" value="Entrar" />
	</form>
</body>
</html>