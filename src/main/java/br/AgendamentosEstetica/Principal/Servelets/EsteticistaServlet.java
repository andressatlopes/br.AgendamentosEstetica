package br.AgendamentosEstetica.Principal.Servelets;

import br.AgendamentoEstetica.Principal.Model.Especialidade;
import br.AgendamentoEstetica.Principal.Model.Esteticista;
import br.AgendamentoEstetica.Principal.dao.EsteticistaDao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "EsteticistaServlet", value = "/EsteticistaServlet")
public class EsteticistaServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Esteticista e = new Esteticista();
        EsteticistaDao ed = new EsteticistaDao();
        Especialidade especialidade = new Especialidade();

        e.setNome(request.getParameter("name"));
        e.setEmail(request.getParameter("email"));
        e.setCpf(request.getParameter("cpf"));
        e.setTelefone(request.getParameter("fone"));
        especialidade.setNome(request.getParameter("EspNome"));
        especialidade.setDescricao(request.getParameter("descricao"));
        especialidade.setFormacao(request.getParameter("especialidade"));
        e.setEspecialidade(especialidade);
        ed.save(e);

    }
}
