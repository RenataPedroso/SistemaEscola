package br.com.turma.teste;

import br.com.turma.dao.AlunoDao;
import br.com.turma.entidade.Aluno;

public class TesteAlterarAluno {

	public static void main(String[] args) {

		Aluno aluno1 = new Aluno();
		aluno1.setCodigo(2);
		aluno1.setNome("Yara Franco da Rocha");
		aluno1.setPrim(5.0);
		aluno1.setSeg(3.0);
		aluno1.setTer(2.5);
		aluno1.setQua(2.0);
		aluno1.setMedia(aluno1.calcularMedia());
		aluno1.setStatusFinal(aluno1.verificarStatus());
		
		AlunoDao alunoDao = new AlunoDao();
		alunoDao.alterarPorCodigo(aluno1);
	}

}
