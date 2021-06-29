

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Cadastro de usuario</title>

<link rel="stylesheet" href="resources/css/cadastro.css">

</head>
<center>

	<h3 style="color: red">${msg}</h3>
</center>
<body>

	<a href="acessoliberado.jsp"><img alt="Voltar" title="Voltar"
		src="resources/img/salvar.png" width="2%" height="2%"></a>
	<a href="index.jsp"><img alt="Sair" title="Sair"
		src="resources/img/sair.png" width="2%" height="2%"></a>

	<script type="text/javascript">

function validarUsuario() {
	
	if(document.getElementById("login").value == ''){
		alert('informe o login do usuário');
		return false;
	}else if(document.getElementById("nome").value == ''){
		alert('informe o nome do usuário');
		return false;
		
	}else if(document.getElementById("telefone").value == ''){
		alert('informe o telefone do usuário');
		return false;
		
	}
	
	return true;
}


 
</script>


	<center>
		<h2>Cadastro de Usuario</h2>

	</center>

	<form action="salvarUsuario" method="post" id="formUser"
		onsubmit="validarUsuario()">
		<ul class="form-style-1">
			<li>

				<table>

					<tr>
						<td><label>CODIGO</label></td>
						<td><input type="text" readonly="readonly" id="id" name="id"
							value="${user.id}" class="field-long"></td>
					</tr>
					<tr>
						<td><label>USUARIO</label></td>
						<td><input type="text" id="login" name="login"
							value="${user.login}"></td>
					</tr>
					<tr>
						<td><label>SENHA</label></td>
						<td><input type="password" id="senha" name="senha"
							value="${user.senha}"></td>
					</tr>
					<tr>
						<td><label>NOME</label></td>
						<td><input type="text" id="nome" name="nome"
							value="${user.nome}"></td>
					</tr>

					<tr>
						<td><label>TELEFONE</label></td>
						<td><input type="text" id="telefone" name="telefone"
							value="${user.telefone}"></td>
					</tr>
					<tr>
						<td><label>CEP</label></td>
						<td><input type="text" id="cep" name="cep"
							></td>
					</tr>
					
					<tr>
						<td><label>RUA</label></td>
						<td><input type="text" id="rua" name="rua"
							></td>
					</tr>
					<tr>
						<td><label>BAIRRO</label></td>
						<td><input type="text" id="bairro" name="bairro"
							></td>
					</tr>
					
					<tr>
						<td><label>CIDADE</label></td>
						<td><input type="text" id="cidade" name="cidade"
							></td>
					</tr>
					<tr>
						<td><label>ESTADO</label></td>
						<td><input type="text" id="estado" name="estado"
							></td>
					</tr>
					<tr>
						<td><label>IBGE</label></td>
						<td><input type="text" id="ibge" name="ibge"
							></td>
					</tr>


					<tr>
						<td></td>
						<td><input type="submit" value="Salvar"> <input
							type="submit" value="Cancelar"
							onclick="document.getElementById('formUser').action = 'salvarUsuario?acao=reset'"></td>
					</tr>

				</table>
			</li>
		</ul>
	</form>

	<div class="table-wrapper">
		<table class="fl-table">

			<h2>Usuarios Cadastrados</h2>
			<thead>
				<tr>
					<th>Id</th>
					<th>Login</th>
					<th>Nome</th>
					<th>Telefone</th>
					<th>Delete</th>
					<th>Editar</th>
				</tr>
			</thead>
			<c:forEach items="${usuario}" var="user">
				<tr>
					<td><c:out value="${user.id}"></c:out></td>
					<td><c:out value="${user.login}"></c:out></td>
					<td><c:out value="${user.nome}"></c:out></td>
					<td><c:out value="${user.telefone}"></c:out></td>
					<td><a href="salvarUsuario?acao=delete&user=${user.id}"><img
							alt="Excluir" title="Excluir"
							src="resources/img/excluir icon.png" width="20px" height="20px"></a></td>
					<td><a href="salvarUsuario?acao=editar&user=${user.id}"><img
							alt="Editar" title="Editar" src="resources/img/editar icon.png"
							width="20px" height="20px"></a></td>

				</tr>
			</c:forEach>

		</table>
	</div>

</body>
</html>