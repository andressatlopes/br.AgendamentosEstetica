<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Agendamento</title>
</head>
<body>

	<h1>Agendar um horário</h1>
	<form>
		<!-- 2 column grid layout with text inputs for the first and last names -->
		<div class="row mb-4">
			<div class="col">
				<div class="form-outline">
					<input type="text" id="form6Example1" class="form-control" /> <label
						class="form-label" for="form6Example1">Nome Completo: </label>
				</div>
			</div>
			<div class="col">
				<div class="form-outline">
					<input type="text" id="form6Example2" class="form-control" /> <label
						class="form-label" for="form6Example2">Telefone: </label>
				</div>
			</div>
		</div>

		<!-- Text input -->
		<div class="form-outline mb-4">
			<input type="text" id="form6Example3" class="form-control" /> <label
				class="form-label" for="form6Example3">Email: </label>
		</div>


		<div class="col-12">
			<label class="visually-hidden" for="inlineFormSelectPref">Escolher Procedimento: </label>
			<select class="select">
				<option value="1">Maquiagem</option>
				<option value="2">Massagem</option>
				<option value="3">Manicure</option>
			</select>
		</div>

		<!-- Number input -->
		<div class="form-outline mb-4">
			<input type="number" id="form6Example6" class="form-control" /> <label
				class="form-label" for="form6Example6">Phone</label>
		</div>

		<!-- Submit button -->
		<button type="submit" class="btn btn-primary btn-block mb-4">AGENDAR</button>
	</form>

</body>
</html>