<%@ page import="br.AgendamentoEstetica.Principal.dao.AgendamentoDao" %>
<%@ page import="br.AgendamentoEstetica.Principal.Model.Agendamento" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="utf-8" %>
  <!DOCTYPE html>
  <html>

  <head>
    <meta charset="UTF-8">
    <title>Atendente</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
      integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
  </head>

  <body>

    <h1>Lista de Agendamentos:</h1>
    <div class="input-group">
      <form action="BuscaClienteServlet" method="post">
        <input type="search" class="form-control rounded" id="nameCliente" name="nameCliente" placeholder="Digite o nome do cliente" aria-label="Search" aria-describedby="search-addon" />
        <button type="button" id="search" name="search" class="btn btn-outline-primary">Procurar</button>
      </form>
    </div>
    <table class="table table-striped">
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
        <td><%item.getCliente().get().getNome();%></td>
        <td><%item.getCliente().get().getTelefone();%></td>
        <td><%item.getCliente().get().getCpf();%></td>
        <td><%item.getProcedimento();%></td>
        <td><%item.getHorario();%></td>
        <td><%item.getData().toString();%></td>
      </tr>
      <%i++;
      }%>
      </tbody>
    </table>

  </body>

  </html>