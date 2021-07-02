<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mostrar Alunos</title>
</head>
<body>

	<h2>Lista de Alunos</h2>
	
	<table border="1" callspacing="0" width="70%">
		<thead>
			<tr bgcolor="black" style="color:white">
				<th>Código</th>
				<th>Nome</th>
				<th>1º Bimestre</th>
				<th>2º Bimestre</th>
				<th>3º Bimestre</th>
				<th>4º Bimestre</th>
				<th>Média</th>
				<th>Status</th>
				<th colspan="2">Ação</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="aluno" items="${alunos}">
				<tr>
					<td>${aluno.codigo }</td>
					<td>${aluno.nome }</td>
					<td>${aluno.prim }</td>
					<td>${aluno.seg }</td>
					<td>${aluno.ter }</td>
					<td>${aluno.qua }</td>
					<td>${aluno.media }</td>
					<td>${aluno.status }</td>
					<td><a href="alterar?codigo=${aluno.codigo }">Alterar</a></td>
					<td><a href="excluir?codigo=${aluno.codigo }">Excluir</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>


</body>
</html>