package br.AgendamentosEstetica.Principal.Servelets;

import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.mapping.List;

import br.AgendamentoEstetica.Principal.Model.Cliente;
import br.AgendamentoEstetica.Principal.dao.ClienteDao;

/**
 * Servlet implementation class ClienteHomeServlet
 */
@WebServlet(description = "Cliente acessando do 'agendar horario'", urlPatterns = { "/ClienteHomeServlet" })
public class ClienteHomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public Boolean flag;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClienteHomeServlet() {
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
		ClienteDao cd = new ClienteDao();
		Cliente c = new Cliente();
		c.setLogin(login);
		c.setSenha(senha);
		for (Cliente item : cd.findAll(null)) {
			if (item.getLogin() == login){
				if (item.getSenha() == senha) {
					  RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/Agendamento.jsp");
					  dispatcher.forward(request, response);
				}
			}
			
		}
		
		//doGet(request, response);
	}
	
	protected void Botao(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		flag = Boolean.parseBoolean(getServletInfo());
	}

}
