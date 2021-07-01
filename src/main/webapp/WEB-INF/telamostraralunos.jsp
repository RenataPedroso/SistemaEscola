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
				<th>C�digo</th>
				<th>Nome</th>
				<th>1� Bimestre</th>
				<th>2� Bimestre</th>
				<th>3� Bimestre</th>
				<th>4� Bimestre</th>
				<th>M�dia</th>
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