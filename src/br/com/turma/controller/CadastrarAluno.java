package br.com.turma.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.turma.dao.AlunoDao;
import br.com.turma.entidade.Aluno;


@WebServlet("/incluir")
public class CadastrarAluno extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		RequestDispatcher rd = request.getRequestDispatcher("/telacadastraraluno.jsp");
		rd.forward(request, response);
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String nome = request.getParameter("txtnome");
		double prim = Double.parseDouble(request.getParameter("txtprim"));
		double seg = Double.parseDouble(request.getParameter("txtseg"));
		double ter = Double.parseDouble(request.getParameter("txtter"));
		double qua = Double.parseDouble(request.getParameter("txtqua"));
		
		Aluno aluno = new Aluno(nome,prim,seg,ter,qua);
		
		AlunoDao alunoDao = new AlunoDao();
		alunoDao.cadastrar(aluno);
		
		response.sendRedirect("http://localhost:8080/SistemaEscola/mostrar");
	
	}

}
