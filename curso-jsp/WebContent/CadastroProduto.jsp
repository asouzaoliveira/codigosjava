<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Cadastro de Produtos</title>
</head>
<body>
<a href="acessoliberado.jsp"><img alt="Voltar" title = "Voltar"src="resources/img/salvar.png" width="2%" height="2%" ></a>
<a href="index.jsp" ><img alt="Sair" title = "Sair"src="resources/img/sair.png" width="2%" height="2%" ></a>
<script type="text/javascript">

function validarProduto() {
	
	if(document.getElementById("produto").value == ''){
		alert('informe o produto');
		return false;
	}else if(document.getElementById("quantidade").value == ''){
		alert('informe a quantidade');
		return false;
		
	}else if(document.getElementById("valor").value == ''){
		alert('informe o valor');
		return false;
		
	}
	
	return true;
}

</script>


<link rel="stylesheet" href="resources/css/cadastro.css">

</head>
<center>

<h3 style = "color:red">${msg}</h3>
</center>
<body>
	<center>
		<h2>Cadastro de Produtos</h2>
		
	</center>

	<form action="salvarItem" method="post" id = 'formProd' onsubmit="validarProduto()">
		<ul class="form-style-1">
			<li>

				<table>

					<tr>
						<td><label>CODIGO</label></td>
						<td><input type="text" readonly="readonly" id="id" name="id"
							value="${prod.id}" class="field-long"></td>
					</tr>
					<tr>
						<td><label>PRODUTO</label></td>
						<td><input type="text" id="produto" name="produto"
							value="${prod.produto}"></td>
					</tr>
					<tr>
						<td><label>QUANTIDADE</label></td>
						<td><input type="text" id="quantidade" name="quantidade"
							value="${prod.quantidade}"></td>
					</tr>
					<tr>
						<td><label>VALOR</label></td>
						<td><input type="text" id="valor" name="valor"
							value="${prod.valor}"></td>
					</tr>
					
					
					<tr>
						<td></td>
						<td><input type="submit" value="Salvar"> <input type = "submit" value = "Cancelar" onclick= "document.getElementById('formProd').action = 'salvarItem?acao=reset'"></td>
					</tr>

				</table>
			</li>
		</ul>
	</form>
	
	<div class="table-wrapper">
		<table class="fl-table">
		
			<h2>Produtos Cadastrados</h2>
			
			<thead>
			<tr>
				<th>Id</th>
				<th>Produto</th>
				<th>Quantidade</th>
				<th>Valor</th>
				<th>Delete</th>
				<th>Editar</th>
			</tr>
			</thead>
			<c:forEach items="${item}" var="prod">
				<tr>
					<td><c:out value="${prod.id}"></c:out></td>
					<td><c:out value="${prod.produto}"></c:out></td>
					<td><c:out value="${prod.quantidade}"></c:out></td>
					<td><c:out value="${prod.valor}"></c:out></td>
					
					
					<td><a href="salvarItem?acao=delete&prod=${prod.id}"><img
							alt="Excluir" title="Excluir"
							src="resources/img/excluir icon.png" width="20px" height="20px"></a></td>
					<td><a href="salvarItem?acao=editar&prod=${prod.id}"><img
							alt="Editar" title="Editar" src="resources/img/editar icon.png"
							width="20px" height="20px"></a></td>

				</tr>
			</c:forEach>

		</table>
	</div>

</body>



</html>