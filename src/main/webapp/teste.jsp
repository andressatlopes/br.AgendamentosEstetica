<%@page import="br.AgendamentosEstetica.Principal.Servelets.HomeServlet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="Style.css">
<link rel="stylesheet" href="StyleAgendamento.css">
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
		<h1>Agendar um Horário</h1>

		<form action="AgendamentoServlet" method="post">
			<%--@declare id="inlineformselectpref"--%>
			<label for="name"> <span>Nome:</span> <input type="text"
				id="name" name="name">
			</label> <label for="fone"> <span>Telefone:</span> <input type="text"
				id="fone" name="fone">
			</label> <label for="cpf"> <span>CPF:</span> <input type="text"
				id="cpf" name="cpf">
			</label> <label for="idade"> <span>Idade:</span> <input type="text"
				id="idade" name="idade">
			</label> <label for="horario"> <span>Horario:</span> <input
				type="time" id="horario" name="horario">
			</label> <label for="data"> <span>Data:</span> <input type="date"
				id="data" name="data">
			</label> <label class="visually-hidden" for="inlineFormSelectPref"><span>Escolher
					Procedimento: </span></label> <select class="select" id="procedimento"
				name="procedimento">
				<option value="1">Maquiagem</option>
				<option value="2">Massagem</option>
				<option value="3">Manicure</option>
			</select> <input type="submit" value="AGENDAR">

		</form>
		<a class="" href="./Home.jsp">Voltar para página inicial</a>
	</main>
	<section class="footer">
		<div class="circle"></div>
	</section>


</body>
</html>