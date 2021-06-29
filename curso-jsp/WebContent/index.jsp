
<jsp:useBean id="calcula" class="beans.BeanCursoJsp"
	type="beans.BeanCursoJsp" scope="page" />

<%@page language="java" contentType="text/html;charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="beans.BeanCursoJsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel = "stylesheet"href="resources/css/estilo.css">
</head>

<body />
<div class="login-page">
	<div class="form">

		<form action="LoginServelet" method="post" class="login-form">


			<table>
				<tr>
					<td><label>LOGIN</label></td>
					<td><input type="text" id="login" name="login"></td>
				</tr>
				<tr>
					<td><label>SENHA</label></td>
					<td><input type="password" id="senha" name="senha"></td>
				</tr>
				<tr>
					<td></td>
					<td><button type="submit" value="LOGAR">Logar</button> </td>
				</tr>
			</table>
		</form>
	</div>
</div>


</body>
</html>