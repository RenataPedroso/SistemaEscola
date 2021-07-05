package br.com.turma.teste;

import br.com.turma.dao.AlunoDao;
import br.com.turma.entidade.Aluno;

public class TesteAlterarAluno {

	public static void main(String[] args) {
		
		Aluno aluno01 = new Aluno();
		aluno01.setCodigo(4);
		aluno01.setNome("Anderson Barros");
		aluno01.setPrim(10);
		aluno01.setSeg(10);
		aluno01.setTer(10);
		aluno01.setQua(10);
		aluno01.setMedia(aluno01.calcularMedia());
		aluno01.setStatusFinal(aluno01.verificarStatus());
		
		AlunoDao alunoDao = new AlunoDao();
		alunoDao.alterarPorCodigo(aluno01);

	}

}
