package br.com.turma.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.turma.dao.AlunoDao;

/**
 * Servlet implementation class ExcluirAluno
 */
@WebServlet("/excluir")
public class ExcluirAluno extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int codigo=Integer.parseInt(request.getParameter("codigo"));
		
		AlunoDao alunoDao = new AlunoDao();
		alunoDao.excluirPorCodigo(codigo);
		
		response.sendRedirect("http://localhost:8080/SistemaEscola/mostrar");
	}

}
