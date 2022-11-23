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

<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
	<header id="header">

		<nav class="navbar navbar-expand-lg navCor static-top">
			<div class="container">
				<a class="navbar-brand" href="#"> <img
					src="https://placeholder.pics/svg/150x50/888888/EEE/Logo" alt="..."
					height="36">
				</a>
				<button class="navbar-toggler" type="button"
					data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
					aria-controls="navbarSupportedContent" aria-expanded="false"
					aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
				<div class="collapse navbar-collapse" id="navbarSupportedContent">
					<ul class="navbar-nav ms-auto">
						<li class="nav-item"><a class="nav-link active"
							aria-current="page" href="#">Home</a></li>
						<li class="nav-item"><a class="nav-link" href="#">Link</a></li>
						<li class="nav-item dropdown"><a
							class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
							role="button" data-bs-toggle="dropdown" aria-expanded="false">
								Dropdown </a>
							<ul class="dropdown-menu dropdown-menu-end"
								aria-labelledby="navbarDropdown">
								<li><a class="dropdown-item" href="#">Action</a></li>
								<li><a class="dropdown-item" href="#">Another action</a></li>
								<li>
									<hr class="dropdown-divider">
								</li>
								<li><a class="dropdown-item" href="#">Something else
										here</a></li>
							</ul></li>
					</ul>
				</div>
			</div>
		</nav>
	</header>

	<main>
		<!-- HOME -->
		<section class="section" id="home">
			<div class="container grid">
				<div class="image">
					<img
						src="https://smakon.jp/marrial/wp-content/uploads/2017/01/pixta_28327617_L-768x533.jpg"
						alt="Imagem mulher maquiando" />
				</div>
				<div class="text">
					<h2 class="title">Estética</h2>
					<p>Uma clinica especializada em beleza.</p>
					<div class="button-image">
						<div class="imagGoogle">
							<img
								src="https://www.google.com/url?sa=i&url=https%3A%2F%2Fpt.m.wikipedia.org%2Fwiki%2FFicheiro%3AGoogle_%2522G%2522_Logo.svg&psig=AOvVaw2IalT7K1Gqb61jfsXFoZfz&ust=1654214728244000&source=images&cd=vfe&ved=0CAwQjRxqFwoTCPjI5529jfgCFQAAAAAdAAAAABAD"
								alt="Google" />

						</div>
						<form action="ClienteHomeServlet"></form>
						<a class="button" href="Login.jsp">Agendar um horário</a>

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
					<p>Lorem ipsum dolor sit amet consectetur, adipisicing elit.
						Necessitatibus deleniti perferendis vel molestiae soluta, quaerat
						beatae dicta ducimus praesentium architecto harum dolorum
						distinctio illo earum assumenda itaque. Omnis, quam repellat.</p>
					<br />
					<p>Lorem ipsum dolor sit amet consectetur adipisicing elit.
						Iure illum ratione impedit quae eum quis adipisci asperiores, est
						doloribus distinctio excepturi minima eius dolore! Perferendis
						laborum illo aspernatur repellendus ipsum.</p>
					<br />
					<p>Lorem ipsum, dolor sit amet consectetur adipisicing elit.
						Sed exercitationem, illum sapiente quasi hic iusto odio maiores
						esse quaerat quis necessitatibus at odit, dolores dicta, officia
						ab quos. Provident, quae.</p>
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
						Com mais de 10 anos no mercado, a <strong>ClinicaAL</strong> já
						conquistou clientes de inúmeros países com seus tratamentos.
					</p>
				</header>
				<div class="cards grid">
					<div class="card">
						<i class="icon-woman-hair"></i>
						<h3 class="title">Maquiagem</h3>
						<p>Lorem ipsum dolor sit amet consectetur adipisicing elit.
							Odit distinctio neque blanditiis, dolorem aperiam nulla explicabo
							asperiores</p>
					</div>
					<div class="card">
						<i class="icon-trim"></i>
						<h3 class="title">Manicure</h3>
						<p>Lorem ipsum dolor sit amet consectetur adipisicing elit.
							Odit distinctio neque blanditiis, dolorem aperiam nulla explicabo
							asperiores</p>
					</div>
					<div class="card">
						<i class="icon-cosmetic"></i>
						<h3 class="title">Massagem</h3>
						<p>Lorem ipsum dolor sit amet consectetur adipisicing elit.
							Odit distinctio neque blanditiis, dolorem aperiam nulla explicabo
							asperiores</p>
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
						<li><i class="icon-phone"></i> 11 99999-7777</li>
						<li><i class="icon-map-pin"></i> Centro, 346</li>
						<li><i class="icon-mail"></i> contato@clinicaal.com</li>
					</ul>
				</div>
			</div>
		</section>

		<div class="divider-1"></div>
	</main>

	<footer class="section">
		<div class="container grid">
			<div class="brand">
				<a class="logo logo-alt" href="#home">Clínica<span>AL</span>.
				</a>
				<p>©2022 ClinicaAL.</p>
				<p>Todos os direitos reservados.</p>
			</div>
		</div>
	</footer>

</body>
</html>