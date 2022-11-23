package br.AgendamentosEstetica.Principal.Servelets;

import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.If;
import org.hibernate.mapping.List;

import br.AgendamentoEstetica.Principal.Model.Atendente;
import br.AgendamentoEstetica.Principal.Model.Cliente;
import br.AgendamentoEstetica.Principal.dao.AtendenteDao;
import br.AgendamentoEstetica.Principal.dao.ClienteDao;

/**
 * Servlet implementation class ClienteHomeServlet
 */
@WebServlet(description = "Cliente acessando do 'agendar horario'", urlPatterns = { "/ClienteHomeServlet" })
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public Boolean flag;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login = request.getParameter("UserName");
		String senha = request.getParameter("UserPwd");
		Atendente a = new Atendente();
		AtendenteDao ad = new AtendenteDao();
		
		a.setLogin(login);
		a.setSenha(senha);

		
		for (Atendente item : ad.findAll(null)) {
			if (item.getSenha() == senha) {
				  RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/Perfil.jsp");
				  dispatcher.forward(request, response);
			}
			else {
				response.setHeader("Refresh", "0; URL=");
			}
		}
		
		//doGet(request, response);
	}
	
	protected void Botao(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		flag = Boolean.parseBoolean(getServletInfo());
	}

}
