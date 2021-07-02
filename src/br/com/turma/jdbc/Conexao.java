package br.com.turma.jdbc;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class Conexao {
	
	public static Connection obterConexao() {
		
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/dbAlunos?useSSL=false", "root", "root");
			System.out.println("Banco de dados conectado com sucesso!!");
		} catch (SQLException e) {
			System.err.println("Não foi possível conectar ao banco de dados:(");
			e.printStackTrace();
		}
		
		return con;
		
	}
	
}
