package br.com.turma.teste;

import br.com.turma.dao.AlunoDao;
import br.com.turma.entidade.Aluno;

public class TesteMostrarAlunoPorCodigo {

	public static void main(String[] args) {

		AlunoDao alunoDao = new AlunoDao();
		Aluno aluno = alunoDao.mostrarPorCodigo(2);
		
		System.out.println("C�digo: " + aluno.getCodigo());
		System.out.println("Nome: " + aluno.getNome());
		System.out.printf("1� Bimestre: %.1f - 2� Bimestre: %.1f - 3� Bimestre: %.1f - 4� Bimestre: %.1f\n", aluno.getPrim(),aluno.getSeg(),aluno.getTer(),aluno.getQua());
		System.out.printf("M�dia: %.1f\n", aluno.getMedia());
		System.out.println("Status do aluno: " + aluno.getStatusFinal());
		System.out.println();
		
	}

}
