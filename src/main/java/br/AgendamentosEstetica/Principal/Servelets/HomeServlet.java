package br.AgendamentosEstetica.Principal.Servelets;

import br.AgendamentoEstetica.Principal.Model.Atendente;
import br.AgendamentoEstetica.Principal.Model.Cliente;
import br.AgendamentoEstetica.Principal.dao.AtendenteDao;
import br.AgendamentoEstetica.Principal.dao.ClienteDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

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
		ClienteDao cd = new ClienteDao();
		long id = Long.parseLong(request.getParameter("id"));
		Cliente c = cd.findById(Cliente.class, id).get();
		cd.delete(c);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cliente c = new Cliente();
		ClienteDao cd = new ClienteDao();

		if(request.getParameter("id") != null){

		}
		
		//doGet(request, response);
	}
	
	protected void Botao(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

	}

}
