package br.AgendamentosEstetica.Principal.Servelets;

import javax.servlet.*;
import javax.servlet.http.*;

import br.AgendamentoEstetica.Principal.Model.Agendamento;
import br.AgendamentoEstetica.Principal.dao.AgendamentoDao;

import javax.servlet.annotation.*;
import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;
import java.util.List;

@WebServlet(name = "BuscaClienteServlet", value = "/BuscaClienteServlet")
public class BuscaClienteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	AgendamentoDao ad = new AgendamentoDao();
    	List<Agendamento> agenda = ad.AgendaCliente(request.getParameter("nomeCliente"));
    	request.setAttribute("lista", agenda );
    	
    	RequestDispatcher dispacher = request.getRequestDispatcher("AtendentePorCliente.jsp");
        dispacher.forward(request, response);
    }
}
