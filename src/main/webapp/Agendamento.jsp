<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Agendamento</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
</head>
<body>

	<h1>Agendar um horário</h1>
	<form action="AgendamentoServlet" method="post">
		<!-- 2 column grid layout with text inputs for the first and last names -->
		<div class="row mb-4">
			<div class="col" style="left: 1ram">
				<div class="form-outline"><p>Nome Completo:
					<input type="text" id="name" name="name" class="form-control" /> <label
						class="form-label" for="form6Example1"> </label>
				</div>
			</div>
			<div class="col">
				<div class="form-outline"><p>Telefone:
					<input type="text" id="fone" name="fone" class="form-control" /> <label
						class="form-label" for="form6Example2"> </label>
				</div>
			</div>
		</div>

		<!-- Text input -->
		<div class="form-outline mb-4"><p>CPF:
			<input type="text" id="cpf" name="cpf" class="form-control" /> <label
				class="form-label" for="form6Example3"></label>
		</div>
		
		<div class="form-outline mb-4"><p>Idade:
			<input type="text" id="idade" name="idade" class="form-control" /> <label
				class="form-label" for="form6Example3"></label>
		</div>
		
		<div class="form-outline mb-4"><p>Horário:
			<input type="time" id="horario" name="horario" class="form-control" /> <label
				class="form-label" for="form6Example3"></label>
		</div>
		<div class="form-outline mb-4"><p>Data:
			<input type="date" id="data" name="data" class="form-control" /> <label
				class="form-label" for="form6Example3"></label>
		</div>

		<div class="col-12">
			<label class="visually-hidden" for="inlineFormSelectPref">Escolher Procedimento: </label>
			<select class="select" id="procedimento" name="procedimento">
				<option value="1">Maquiagem</option>
				<option value="2">Massagem</option>
				<option value="3">Manicure</option>
			</select>
		</div>

		<!-- Submit button -->
		<button type="submit" class="btn btn-primary btn-block mb-4">AGENDAR</button>
	</form>

</body>
</html>