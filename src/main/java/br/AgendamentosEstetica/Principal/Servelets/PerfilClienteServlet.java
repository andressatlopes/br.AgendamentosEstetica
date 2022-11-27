package br.AgendamentosEstetica.Principal.Servelets;

import br.AgendamentoEstetica.Principal.Model.Cliente;
import br.AgendamentoEstetica.Principal.Model.Endereco;
import br.AgendamentoEstetica.Principal.dao.ClienteDao;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PerfilServlet
 */
@WebServlet("/PerfilServlet")
public class PerfilClienteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PerfilClienteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Cliente c = new Cliente();
		Endereco e = new Endereco();
		ClienteDao cd = new ClienteDao();

		c.setNome(request.getParameter("name"));
		c.setIdade(Integer.parseInt(request.getParameter("idade")));
		c.setCpf(request.getParameter("cpf"));
		c.setTelefone(request.getParameter("fone"));
		e.setRua(request.getParameter("rua"));
		e.setBairro(request.getParameter("bairro"));
		e.setNumero(request.getParameter("numero"));
		c.setEndereco(e);
		cd.save(c);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
