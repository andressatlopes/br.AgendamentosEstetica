package br.AgendamentosEstetica.Principal.Servelets;

import br.AgendamentoEstetica.Principal.Model.Atendente;
import br.AgendamentoEstetica.Principal.dao.AtendenteDao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "PerfilAtendente", value = "/PerfilAtendente")
public class PerfilAtendenteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Atendente a = new Atendente();
        AtendenteDao ad = new AtendenteDao();

        a.setNome(request.getParameter("name"));
        a.setCpf(request.getParameter("cpf"));
        a.setEmail(request.getParameter("email"));
        a.setTelefone(request.getParameter("fone"));
        ad.save(a);
    }
}
