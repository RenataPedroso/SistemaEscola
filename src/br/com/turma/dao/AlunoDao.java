package br.com.turma.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.turma.entidade.Aluno;
import br.com.turma.jdbc.Conexao;

public class AlunoDao {

	public void cadastrar(Aluno aluno) {
		
		Connection con = Conexao.obterConexao();
		
		String sql = "INSERT INTO aluno(nome,prim,seg,ter,qua,media,status_final) VALUES(?,?,?,?,?,?,?)";
		
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, aluno.getNome());
			preparador.setDouble(2, aluno.getPrim());
			preparador.setDouble(3, aluno.getSeg());
			preparador.setDouble(4, aluno.getTer());
			preparador.setDouble(5, aluno.getQua());
			preparador.setDouble(6, aluno.getMedia());
			preparador.setString(7, aluno.getStatusFinal());

			preparador.execute();
			
			preparador.close();
			
			System.out.println("O aluno cadastrado!");
			
		} catch (SQLException e) {
			System.err.println("Erro ao cadastrar aluno :(");
			e.printStackTrace();
		}
		
	}
	
	public ArrayList<Aluno> mostrarTodos(){
		Connection con = Conexao.obterConexao();
		
		ArrayList<Aluno> alunos = new ArrayList<>();
		String sql = "SELECT * FROM aluno";
		
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			ResultSet resultado = preparador.executeQuery();
			
			while(resultado.next()) {
				Aluno aluno = new Aluno();
				aluno.setCodigo(resultado.getInt("codigo"));
				aluno.setNome(resultado.getString("nome"));
				aluno.setPrim(resultado.getDouble("prim"));
				aluno.setSeg(resultado.getDouble("seg"));
				aluno.setTer(resultado.getDouble("ter"));
				aluno.setQua(resultado.getDouble("qua"));
				aluno.setMedia(resultado.getDouble("media"));
				aluno.setStatusFinal(resultado.getString("status_final"));

				alunos.add(aluno);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return alunos;
	}
	
}
