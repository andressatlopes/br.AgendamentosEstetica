<%@page import="br.AgendamentosEstetica.Principal.Servelets.HomeServlet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="Style.css">
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
							aria-current="page" href="#home">Inicio</a></li>
						<li class="nav-item"><a class="nav-link active"
							aria-current="page" href="#about">Sobre</a></li>
						<li class="nav-item"><a class="nav-link active"
							aria-current="page" href="#services">Serviços</a></li>
						<li class="nav-item"><a class="nav-link active"
							aria-current="page" href="#contact">Contato</a></li>
						<li class="nav-item"><a class="nav-link active"
							aria-current="page" href="Atendente.jsp">Todos os agendamentos</a></li>
					</ul>
				</div>
			</div>
		</nav>
	</header>

	<main>
		<!-- HOME -->
		<section class="section" id="home">
			<div class="container grid">
				<div class="image1">
<!-- 					<img -->
<!-- 						src="https://smakon.jp/marrial/wp-content/uploads/2017/01/pixta_28327617_L-768x533.jpg" -->
<!-- 						alt="Imagem mulher maquiando" /> -->
				</div>
				<div class="text">
					<h2 class="title">AF Estética</h2>
					<p>Uma clinica especializada em beleza.</p>
					<div class="button-image">
						<form action="ClienteHomeServlet"></form>
						<a class="button" href="./Agendamento.jsp">Agendar um horário</a>
					</div>
				</div>
			</div>
		</section>

		<div class="divider-1"></div>

		<!-- ABOUT -->
		<section class="section" id="about">
			<div class="container grid">
				<div class="image">
					<img src="https://static.beautyinsider.ru/2014/01/IMG_1336.jpg"
						alt="maquiagem" />
				</div>
				<div class="text">
					<h2 class="title">Sobre nós</h2>
					<p>
						<b>AF Estética </b> é um espaço que valoriza a Saúde, o Bem Estar
						e os Cuidados com a Beleza. Oferecemos a mais alta qualidade em
						tratamentos de Estética Facial e Corporal para que você se sinta
						cada vez melhor e mais bonita. Aqui você encontra um ambiente
						agradável e confortável, cuidadosamente preparado com muito
						carinho e respeito para que você se sinta muito bem recebida.
						Nosso atendimento é Personalizado e Privativo, feito em Salas
						Individuais, priorizando sempre a Segurança e Higiene dos nossos
						clientes.
					</p>
					<br />
					<p>Em todos os tratamentos utilizamos materiais 100%
						descartáveis. Todos os nossos procedimentos estão em conformidade
						com as normas de higiene exigidas pela Vigilância Sanitária.</p>
					<br />
				</div>
			</div>
		</section>

		<div class="divider-2"></div>

		<!-- SERVICES -->
		<section class="section" id="services">
			<div class="container grid">
				<header>
					<h2 class="title">Serviços</h2>
					<p class="subtitle">
						Com mais de 10 anos no mercado, a <strong>AF Estética</strong> já
						conquistou clientes de inúmeros países com seus tratamentos.
					</p>
				</header>
				<div class="cards grid">
					<div class="card">
						<i class="icon-woman-hair"></i>
						<h3 class="title">Maquiagem</h3>
						<p>Maquie-se e desperte o poder que há em você. A melhor make
							é aquela que combina com você!</p>
						<b><p>R$120,00</p></b>
					</div>
					<div class="card">
						<i class="icon-trim"></i>
						<h3 class="title">Manicure</h3>
						<p>Manicures são responsáveis por embelezar mãos e pés e
							trazerem alegria a partir de uma unha bem feita.</p>
						<b><p>R$40,00</p></b>
					</div>
					<div class="card">
						<i class="icon-cosmetic"></i>
						<h3 class="title">Massagem</h3>
						<p>Massagem vai além do relaxamento e auxilia no tratamento de
							doenças</p>
						<b><p>R$80,00</p></b>
					</div>
				</div>
			</div>
		</section>

		<!--imagem https://th.bing.com/th/id/R.7008a2c510059a3eca3a25b60d9177e3?rik=4cpv26sAfa1s3Q&riu=http%3a%2f%2fwww.backinbalanceclinic.com%2fwp-content%2fuploads%2f2015%2f07%2fmassage-therapy-in-Toronto.jpg&ehk=XnqXtP52d4sPV8CTDBoQo9L%2bBg5WPs981VPYkiTjEDk%3d&risl=&pid=ImgRaw&r=0 -->

		<div class="divider-1"></div>

		<!-- CONTACT -->
		<section class="section" id="contact">
			<div class="container grid">
				<div class="text">
					<h2 class="title">Entre em contato com a gente!</h2>
					<p>Entre em contato, queremos tirar suas dúvidas, ouvir suas
						críticas e sugestões.</p>
				</div>

				<div class="links">
					<ul class="grid">
						<li><b><i class="icon-phone"></i> 11 99999-7777</li>
						</b>
						<li><b><i class="icon-map-pin"></i> Centro, 346</li>
						</b>
						<li><b><i class="icon-mail"></i> contato@afestetica.com</li>
						</b>
					</ul>
				</div>
			</div>
		</section>

		<div class="divider-1"></div>
	</main>

	<footer class="section">
		<div class="container grid">
			<div class="brand">
				<a class="logo logo-alt" href="#home">AF<span>Estética</span>
				</a>
				<p>©2022 AF Estética.</p>
				<p>Todos os direitos reservados.</p>
			</div>
		</div>
	</footer>

</body>
</html>