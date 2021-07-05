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
		
		try {
			
			//1º)Pegar uma conexão com o banco de dados
			Connection con = Conexao.obterConexao();
			
			//2º) Definir o comando que será executado no banco de dados
			String sql = "INSERT INTO aluno(nome,prim,seg,ter,qua,media,status_final) VALUES(?,?,?,?,?,?,?)";
			
			//3º) Preparar a linha de instrução (Statement)
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, aluno.getNome());
			preparador.setDouble(2, aluno.getPrim());
			preparador.setDouble(3, aluno.getSeg());
			preparador.setDouble(4, aluno.getTer());
			preparador.setDouble(5,aluno.getQua());
			preparador.setDouble(6, aluno.getMedia());
			preparador.setString(7, aluno.getStatusFinal());
			
			//4º)Executar no banco de dados
			preparador.execute();
			
			System.out.println("Aluno cadastrado com sucesso!");
			
		} catch (SQLException e) {
			System.err.println("Não foi possível cadastrar o aluno!");
			e.printStackTrace();
		}	
	}

	public ArrayList<Aluno> mostrarTodos(){
		
		Connection con = Conexao.obterConexao();
		ArrayList<Aluno> alunos = new ArrayList<>();
		String sql = "SELECT * from aluno";
		
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

	public Aluno mostrarPorCodigo(int codigo) {
		
		Connection con = Conexao.obterConexao();
		Aluno aluno = null;
		String sql = "SELECT * from aluno WHERE codigo = ?";
		
		PreparedStatement preparador;
		try {
			preparador = con.prepareStatement(sql);
			preparador.setInt(1, codigo);
			
			ResultSet resultado = preparador.executeQuery();
			
			if(resultado.next()) {
				aluno = new Aluno();
				aluno.setCodigo(resultado.getInt("codigo"));
				aluno.setNome(resultado.getString("nome"));
				aluno.setPrim(resultado.getDouble("prim"));
				aluno.setSeg(resultado.getDouble("seg"));
				aluno.setTer(resultado.getDouble("ter"));
				aluno.setQua(resultado.getDouble("qua"));
				aluno.setMedia(resultado.getDouble("media"));
				aluno.setStatusFinal(resultado.getString("status_final"));
				
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return aluno;
		
	}
	
	public void excluirPorCodigo(int codigo) {
		
		Connection con = Conexao.obterConexao();
		
		String sql = "DELETE FROM aluno WHERE codigo = ?";
		
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setInt(1, codigo);
			
			preparador.execute();
			System.out.println("Aluno excluído com sucesso!!!");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void alterarPorCodigo(Aluno aluno) {
		
		Connection con = Conexao.obterConexao();
		
		String sql = "UPDATE aluno SET nome=?, prim=?, seg=?, ter=?, qua=?, media=?, status_final=? WHERE codigo = ?";
		
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, aluno.getNome());
			preparador.setDouble(2, aluno.getPrim());
			preparador.setDouble(3, aluno.getSeg());
			preparador.setDouble(4, aluno.getTer());
			preparador.setDouble(5, aluno.getQua());
			preparador.setDouble(6,aluno.getMedia());
			preparador.setString(7,aluno.getStatusFinal());
			preparador.setInt(8, aluno.getCodigo());
			
			preparador.execute();
			
			System.out.println("O aluno foi alterado com sucesso!!!");
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
}
