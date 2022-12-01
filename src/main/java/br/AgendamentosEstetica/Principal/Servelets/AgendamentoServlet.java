package br.AgendamentosEstetica.Principal.Servelets;

import br.AgendamentoEstetica.Principal.Model.*;
import br.AgendamentoEstetica.Principal.dao.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
//@WebServlet({ "/ServletCurso", "/controllerCurso" })


@WebServlet(name = "AgendamentoServlet", value = "/AgendamentoServlet")
public class AgendamentoServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AgendamentoServlet() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        AgendamentoDao ad = new AgendamentoDao();
        long id = Long.parseLong(request.getParameter("agendaId"));
        Agendamento agenda = ad.findById(Agendamento.class,id).get();
        ad.delete(agenda);

        response.sendRedirect("Atendente.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Agendamento a = new Agendamento();
        AgendamentoDao ad = new AgendamentoDao();
        Cliente c = new Cliente();
        ClienteDao cd = new ClienteDao();

        long agendaid = 0;
        if (request.getParameter("agendaId") == null) {
            c.setNome(request.getParameter("name"));
            c.setTelefone(request.getParameter("fone"));
            c.setCpf(request.getParameter("cpf"));
            c.setIdade(Integer.parseInt(request.getParameter("idade")));
            cd.save(c);

            switch (request.getParameter("procedimento")) {
                case "Maquiagem":
                    a.setProcedimento(Procedimentos.Maquiagem);
                    break;
                case "Massagem":
                    a.setProcedimento(Procedimentos.Massagem);
                    break;
                case "Manicure":
                    a.setProcedimento(Procedimentos.Manicure);
                    break;
            }

            a.setCliente(cd.findById(Cliente.class, c.getId()).get());
            a.setHorario("horario");
            a.setData(LocalDate.parse(request.getParameter("data"), DateTimeFormatter.ISO_DATE));
            ad.save(a);
            agendaid = a.getId();
        } else {
            agendaid = Long.parseLong(request.getParameter("agendaId"));
            a = ad.findById(Agendamento.class, agendaid).get();

            a.setId(agendaid);
            c = cd.findById(Cliente.class, a.getCliente().get().getId()).get();
            c.setNome(request.getParameter("name"));
            c.setTelefone(request.getParameter("fone"));
            c.setCpf(request.getParameter("cpf"));
            c.setIdade(Integer.parseInt(request.getParameter("idade")));
            cd.update(c);
            a.setHorario("horario");
            a.setData(LocalDate.parse(request.getParameter("data"), DateTimeFormatter.ISO_DATE));
        }
        request.setAttribute("agendaId", agendaid);
        RequestDispatcher dispacher = request.getRequestDispatcher("InformacoesAgendamento.jsp");
        dispacher.forward(request, response);
    }
}
