<%@page import="br.com.turma.entidade.Aluno"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Alterar Aluno</title>
</head>
<body>

	<h2>Alterar Aluno</h2>
	
	<form action="alterar" method="post">
		
		C�digo: <input type="text" name="txtcodigo" value="${aluno.codigo }" size="5" readonly>
		Nome: <input type="text" name="txtnome" value="${aluno.nome }" size="45"><br><br>
		1� Bim:<input type="text" name="txtprim" value="${aluno.prim }" size="5">
		2� Bim:<input type="text" name="txtseg" value="${aluno.seg }" size="5">
		3� Bim:<input type="text" name="txtter" value="${aluno.ter }" size="5">
		4� Bim:<input type="text" name="txtqua" value="${aluno.qua }" size="5"><br><br>
		
		<input type="submit" value="Salvar Aluno">
		
	</form>

</body>
</html>