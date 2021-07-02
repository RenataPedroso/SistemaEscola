<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastrar Aluno</title>
</head>
<body>
	<h2>Cadastrar Aluno</h2>
	
	<form method="post" action="incluir">
	
		Nome: <input type="text" name="txtnome" size="60"><br></br>
		1º Bim: <input type="text" name="txtprim" size="5">
		2º Bim: <input type="text" name="txtseg" size="5">
		3º Bim: <input type="text" name="txtter" size="5">
		4º Bim: <input type="text" name="txtqua" size="5"><br></br>
		<input type="submit" value="Salvar Aluno">
	
	</form>
	
</body>
</html>