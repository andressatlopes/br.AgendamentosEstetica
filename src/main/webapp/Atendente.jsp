<%@ page import="br.AgendamentoEstetica.Principal.dao.AgendamentoDao" %>
<%@ page import="br.AgendamentoEstetica.Principal.Model.Agendamento" %>
<%@page import="br.AgendamentosEstetica.Principal.Servelets.AgendamentoServlet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="utf-8" %>
  <!DOCTYPE html>
  <html>

  <head>
    <meta charset="UTF-8">
    <title>Atendente</title>
    <link rel="stylesheet" href="Style.css">
    <link rel="stylesheet" href="StyleAtendente.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
  </head>

  <body>
  
  	<header id="header">
		<nav class="navbar navbar-expand-lg navCor static-top">
			<div class="container">
				<a class="logo" href="#">af<span class="span">estética</span>.
				</a>
				<div class="collapse navbar-collapse" id="navbarSupportedContent">
					<ul class="navbar-nav ms-auto">
						<li class="nav-item"><a class="nav-link active"
							aria-current="page" href="./Home.jsp">Inicio</a></li>
						
					</ul>
				</div>
			</div>
		</nav>
	</header>

    <h1>Lista de Agendamentos:</h1>
    <div class="input-group">
      <form action="BuscaClienteServlet" method="post">
        <input type="search" class="form-control rounded" id="nameCliente" name="nameCliente" placeholder="Digite o nome do cliente" aria-label="Search" aria-describedby="search-addon" />
        <button type="submit" id="search" name="search" class="btn btn-outline-primary">Procurar</button>
      </form>
    </div>

    
    <div class="tablecss">
    <table class="table table-hover">
      <thead>
        <tr class="content">

          <th scope="col">#</th>
          <th scope="col">Nome</th>
          <th scope="col">Telefone</th>
          <th scope="col">CPF</th>
          <th scope="col">Idade</th>
          <th scope="col">Horário</th>
          <th scope="col">Data</th>
          <th scope="col">Procedimento</th>
        </tr>
      </thead>
      <tbody>
      <%
        AgendamentoDao ad = new AgendamentoDao();
        for (Agendamento item: ad.findAll(Agendamento.class)) {
      int i = 1;%>
      <tr>
        <th scope="row"><%Integer.toString(i);%></th>
        <td class="linha"><%=item.getCliente().get().getNome()%></td>
        <td class="linha"><%=item.getCliente().get().getTelefone()%></td>
        <td class="linha"><%=item.getCliente().get().getCpf()%></td>
        <td class="linha"><%=item.getProcedimento()%></td>
        <td class="linha"><%=item.getHorario()%></td>
        <td class="linha"><%=item.getData().toString()%></td>
        <td class="linha"><a type="button"
                              class="btn btn-outline-info"
                              href="EditAgenda.jsp?id=<%=item.getId()%>">Editar</a>
                              </td>

      </tr>
      <%i++;
      }%>
      </tbody>
    </table>
	</div>
  </body>

  </html>