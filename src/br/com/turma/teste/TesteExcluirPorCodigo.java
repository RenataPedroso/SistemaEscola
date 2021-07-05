package br.com.turma.teste;

import br.com.turma.dao.AlunoDao;

public class TesteExcluirPorCodigo {

	public static void main(String[] args) {

		AlunoDao alunoDao = new AlunoDao();
		alunoDao.excluirPorCodigo(8);
		
	}

}
