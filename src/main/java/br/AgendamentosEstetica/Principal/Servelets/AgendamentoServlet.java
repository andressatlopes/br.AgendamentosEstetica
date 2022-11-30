package br.AgendamentosEstetica.Principal.Servelets;

import br.AgendamentoEstetica.Principal.Model.*;
import br.AgendamentoEstetica.Principal.dao.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.List;
//@WebServlet({ "/ServletCurso", "/controllerCurso" })


@WebServlet({"/AgendamentoServlet","/AgendamentoController"})
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
        PrintWriter out = response.getWriter();
        if (request.getParameter("tipo") == "1"){
            List<Agendamento> Lista = ad.AgendaCliente(request.getParameter("name"));
            for (Agendamento item: Lista) {
                out.print(item.getCliente().get().getNome());
                out.print(item.getHorario());
                out.print(item.getData().toString());
                out.print(item.getAtendente().getNome());
            }

        }
        else if (request.getParameter("tipo") == "2"){
            List<Agendamento> Lista = ad.AgendaAtendente(request.getParameter("name"));
            for (Agendamento item: Lista) {
                out.print(item.getCliente().get().getNome());
                out.print(item.getHorario());
                out.print(item.getData().toString());
                out.print(item.getAtendente().getNome());
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Agendamento a = new Agendamento();
        AgendamentoDao ad = new AgendamentoDao();
        Cliente c = new Cliente();
        ClienteDao cd = new ClienteDao();
        
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
        a.setData(LocalDate.parse(request.getParameter("data")));
        a.setHorario(request.getParameter("Hora"));
        ad.save(a);
    }
}
