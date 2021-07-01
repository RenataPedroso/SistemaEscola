<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="br.com.turma.dao.AlunoDao"%>
<%@ page import="java.util.ArrayList"%>
<%@page import="br.com.turma.entidade.Aluno" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mostrar Alunos</title>
</head>
<body>	
	<%ArrayList<Aluno> aluno = (ArrayList)request.getAttribute("alunos"); %>
	<table>
		<thead>
			<tr>
				<th>Código</th>
				<th>Nome</th>
				<th>1º Bimestre</th>
				<th>2º Bimestre</th>
				<th>3º Bimestre</th>
				<th>4º Bimestre</th>
				<th>Média</th>
				<th>Status</th>
			</tr>
		</thead>
		<tbody>
			<%for(Aluno aluno:alunos){ %>
			<tr>
				<td><%=aluno.getCodigo() %></td>
				<td><%=aluno.getNome() %></td>
				<td><%=aluno.getPrim() %></td>
				<td><%=aluno.getSeg() %></td>
				<td><%=aluno.getTer() %></td>
				<td><%=aluno.getQua() %></td>
				<td><%=aluno.getMedia() %></td>
				<td><%=aluno.getStatus() %></td>
			</tr>
			<%} %>
		</tbody>
	</table>
</body>
</html>