package br.com.turma.teste;

import br.com.turma.dao.AlunoDao;
import br.com.turma.entidade.Aluno;


public class TesteCadastrarAluno {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno("Renato",7.0,5.5,9.5,10);
		
		AlunoDao alunoDao = new AlunoDao();
		alunoDao.cadastrar(aluno);

	}

}
