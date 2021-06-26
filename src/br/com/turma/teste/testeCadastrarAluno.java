package br.com.turma.teste;

import br.com.turma.dao.AlunoDao;
import br.com.turma.entidade.Aluno;

public class testeCadastrarAluno {

	public static void main(String[] args) {

		Aluno aluno01 = new Aluno("Yara de Franco Rossi", 4.5,3.0,2.5,1.5);
		
		AlunoDao alunoDao = new AlunoDao();
		alunoDao.cadastrar(aluno01);
		
	}

}
