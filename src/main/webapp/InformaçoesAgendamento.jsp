<%@page import="br.AgendamentosEstetica.Principal.Servelets.HomeServlet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="Style.css">
<link rel="stylesheet" href="StyleInfoAgendamento.css">

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">


<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<meta charset="UTF-8">
<title>Home</title>
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

	<main>
		<h1>Informações do Agendamento</h1>

		<table border="1">
			<thead>
				<tr>
					<th>Nome</th>
					<th>Telefone</th>
					<th>CPF</th>
					<th>Idade</th>
					<th>Horário</th>
					<th>Data</th>
					<th>Procedimento</th>
					<th></th>
				</tr>
			</thead>
			<tr>
				<td>Body1 linha1</td>
				<td>Body2 linha1</td>
				<td>Body3 linha1</td>
				<td>Body1 linha1</td>
				<td>Body2 linha1</td>
				<td>Body3 linha1</td>
				<td>Body1 linha1</td>
				<td>Excluir Editar</td>
			</tr>
		</table>
	</main>

</body>
</html>