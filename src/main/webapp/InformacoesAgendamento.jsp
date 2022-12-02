<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="br.AgendamentoEstetica.Principal.Model.Agendamento"%>
<%@page import="br.AgendamentoEstetica.Principal.dao.AgendamentoDao"%>
<%@page import="br.AgendamentosEstetica.Principal.Servelets.HomeServlet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="Style.css">
<link rel="stylesheet" href="StyleInfoAgendamento.css">
<link rel="stylesheet" href="StyleAtendente.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">


<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<meta charset="UTF-8">
<title>Informações</title>
</head>
<body>
<%
    //String nome = request.getParameter("nameCliente");
out.print(request.getParameter("agendaId"));    
AgendamentoDao ad = new AgendamentoDao();
	
    Agendamento a = ad.findById(Agendamento.class, Long.parseLong(request.getParameter("agendaId"))).get();
	
%>


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

	<h1>Informações do Agendamento</h1>

	<div class="tablecss">
		<table class="table table-hover">
			<thead>
				<tr>
					<th></th>
					<th></th>
					<th></th>
					<th></th>
					<th></th>
					<th></th>
					<th></th>
					<th></th>
				</tr>
			</thead>
			 <tbody>
			<tr>
				<td class="linha"><%=a.getCliente().get().getNome()%></td>
				<td class="linha"><%=a.getCliente().get().getTelefone()%></td>
				<td class="linha"><%=a.getCliente().get().getCpf()%></td>
				<td class="linha"><%=a.getCliente().get().getIdade()%></td>
				<td class="linha"><%=a.getHorario()%></td>
				<td class="linha"><%=a.getData()%></td>
				<td class="linha"><%=a.getProcedimento()%></td>
				<td><button class="btn btn-danger">Excluir</button></td>
				<td><button class="btn btn-primary">Editar</button></td>
			</tr>
		</tbody>
		</table>
	</div>

</body>
</html>