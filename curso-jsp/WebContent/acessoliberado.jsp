<jsp:useBean id="calcula" class="beans.BeanCursoJsp"
	type="beans.BeanCursoJsp" scope="page" />

<%@page language="java" contentType="text/html;charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="beans.BeanCursoJsp"%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>insira o texto</title>
</head>
<body>
<a href="index.jsp" ><img alt="Sair" title = "Sair"src="resources/img/sair.png" width="3%" height="4%" ></a>
	<h3>seja bem vindo ao JSP</h3>

	<a href="salvarUsuario?acao=listartodos"><img
		alt="Cadastro de ususarios" title="Cadastro de usuarios"
		src="resources/img/usuario2.png" width="8%" height="12%" style= "margin-top: 1%"></a>
		
		
<a href="salvarItem?acao=listartodos"><img
		alt="Cadastro de produtos" title="Cadastro de produtos"
		src="resources/img/produto.png" width="8%" height="12%" style= "margin-top: 2% ; margin-left: 3%"></a>

</body>