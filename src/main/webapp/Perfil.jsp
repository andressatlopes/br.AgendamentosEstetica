<%@ page import="br.AgendamentoEstetica.Principal.dao.ClienteDao" %>
<%@ page import="br.AgendamentoEstetica.Principal.Model.Cliente" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%><!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cliente</title>
</head>
<body>
<%
	ClienteDao cd = new ClienteDao();
	long id = Long.parseLong(request.getParameter("clienteId"));
	Cliente c = cd.findById(Cliente.class, id).get();
%>
<div class="tablecss">
	<table class="table table-hover">
		<thead>
		<tr>
			<th>Nome</th>
			<th>Telefone</th>
			<th>CPF</th>
			<th>Idade</th>
			<th></th>
		</tr>
		</thead>
		<tbody>
		<tr>
			<td class="linha" ><%c.getNome();%></td>
			<td class="linha"><%c.getTelefone();%></td>
			<td class="linha"><%c.getCpf();%></td>
			<td class="linha"><%c.getIdade();%></td>
			<td><a class="btn btn-danger" href="<%=request.getContextPath()%>HomeServlet?cartaoid=<%=c%>.getId()%>">Excluir</a> >Excluir</a></td>
<%--	//href="<%=request.getContextPath()%>/ServletCartao\?cartaoid=<%=obj.getId()%>">Excluir</a>--%>
		</tr>
		</tbody>
	</table>
</div>
</body>
</html>