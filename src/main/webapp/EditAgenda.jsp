<%@ page import="br.AgendamentoEstetica.Principal.Model.Agendamento" %>
<%@ page import="br.AgendamentoEstetica.Principal.dao.AgendamentoDao" %>
<%@ page import="static org.graalvm.compiler.nodeinfo.Verbosity.Id" %><%--
  Created by IntelliJ IDEA.
  User: limad
  Date: 01/12/2022
  Time: 10:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    long id = Long.parseLong(request.getParameter("id"));
    AgendamentoDao ad = new AgendamentoDao();
    Agendamento agenda = ad.findById(Agendamento.class,id).get();
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<main>
    <h1>Agendar um Horário</h1>

    <form action="AgendamentoServlet" method="post">
        <input type="hidden" name="agendaId" value="<%=id%>" />
        <label for="name">
            <span>Nome:</span>
            <input type="text" value="<%agenda.getCliente().get().getNome();%>" id="name" name="name">
        </label>

        <label for="fone">
            <span>Telefone:</span>
            <input type="tel" value="<%agenda.getCliente().get().getTelefone();%>" id="fone" name="fone">
        </label>

        <label for="cpf">
            <span>CPF:</span>
            <input type="text" value="<%agenda.getCliente().get().setTelefone();%>" id="cpf" name="cpf">
        </label>

        <label for="idade">
            <span>Idade:</span>
            <input type="text" value="<%agenda.getCliente().get().getTelefone();%>" id="idade" name="idade">
        </label>

        <label for="horario">
            <span>Horario:</span>
            <input type="time" id="horario" name="horario">
        </label>

        <label for="data">
            <span>Data:</span>
            <input type="date" id="data" name="data">
        </label>

        <label class="visually-hidden" for="inlineFormSelectPref"><span>Escolher Procedimento: </span></label>
        <select class="select" id="procedimento" name="procedimento">
            <option value="1">Maquiagem</option>
            <option value="2">Massagem</option>
            <option value="3">Manicure</option>
        </select>

        <input type="submit" value="AGENDAR">

    </form>
    <a class="" href="./Home.jsp">Voltar para página inicial</a>
</main>
<section class="footer">
    <div class="circle"></div>
</section>
</body>
</html>
