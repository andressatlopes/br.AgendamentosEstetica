package br.AgendamentosEstetica.Principal.Servelets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	protected void Botao(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		flag = Boolean.parseBoolean(getServletInfo());
	}

}
