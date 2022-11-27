package br.AgendamentosEstetica.Principal.Servelets;

import br.AgendamentoEstetica.Principal.Model.Agendamento;
import br.AgendamentoEstetica.Principal.Model.Cliente;
import br.AgendamentoEstetica.Principal.dao.AgendamentoDao;
import br.AgendamentoEstetica.Principal.dao.ClienteDao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@WebServlet(name = "AgendamentoServlet", value = "/AgendamentoServlet")
public class AgendamentoServlet extends HttpServlet {
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
        ClienteDao cd = new ClienteDao();
        Optional<Cliente> c = cd.findById(Cliente.class, Long.parseLong(request.getParameter("id")));

        a.setCliente(c.get());
        a.setData(LocalDate.parse(request.getParameter("Data")));
        a.setHorario(request.getParameter("Hora"));
        ad.save(a);
    }
}