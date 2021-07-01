package br.com.turma.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.turma.dao.AlunoDao;
import br.com.turma.entidade.Aluno;


@WebServlet("/mostrar")
public class MostrarTodosAlunos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		AlunoDao alunoDao = new AlunoDao();
		ArrayList<Aluno> alunos = alunoDao.mostrarTodos();
		
		request.setAttribute("alunos", alunos);
		RequestDispatcher rd = request.getRequestDispatcher("/telamostraralunos.jsp");
		rd.forward(request, response);
		
	}
}