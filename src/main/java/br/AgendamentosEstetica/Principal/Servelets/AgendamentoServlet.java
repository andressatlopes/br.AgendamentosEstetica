package br.AgendamentosEstetica.Principal.Servelets;

import br.AgendamentoEstetica.Principal.Model.Agendamento;
import br.AgendamentoEstetica.Principal.Model.Cliente;
import br.AgendamentoEstetica.Principal.dao.AgendamentoDao;
import br.AgendamentoEstetica.Principal.dao.ClienteDao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Optional;

@WebServlet(name = "AgendamentoServlet", value = "/AgendamentoServlet")
public class AgendamentoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

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
