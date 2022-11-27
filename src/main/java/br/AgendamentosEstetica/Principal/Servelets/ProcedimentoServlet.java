package br.AgendamentosEstetica.Principal.Servelets;

import br.AgendamentoEstetica.Principal.Model.Esteticista;
import br.AgendamentoEstetica.Principal.Model.Procedimento;
import br.AgendamentoEstetica.Principal.dao.EsteticistaDao;
import br.AgendamentoEstetica.Principal.dao.ProcedimentoDao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ProcedimentoServlet", value = "/ProcedimentoServlet")
public class ProcedimentoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Procedimento p = new Procedimento();
        ProcedimentoDao pd = new ProcedimentoDao();
        EsteticistaDao ed = new EsteticistaDao();
        p.setNomeProtocolo(request.getParameter("name"));
        p.setDescricao(request.getParameter("descricao"));
        p.setValor(Double.parseDouble(request.getParameter("preco")));
        p.setEsteticista(ed.findById(Esteticista.class, Long.parseLong(request.getParameter("esteticista"))).get());
    }
}
