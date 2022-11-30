package br.AgendamentoEstetica.Principal.App;

import java.util.*;

import org.hibernate.mapping.List;

import br.AgendamentoEstetica.Principal.Model.Agendamento;
import br.AgendamentoEstetica.Principal.dao.AgendamentoDao;

public class Main {

	public static void main(String[] args) {
		AgendamentoDao ad = new AgendamentoDao();
		//List<Agendamento> agendas = new ArrayList<>();
		//java.util.List<Agendamento> agenda = new ArrayList<>();
		//agenda.addAll(ad.AgendaAtendente("Natalia"));
		for (Agendamento item : ad.AgendaAtendente(null) ) {
			System.out.println(item.getCliente().get().getNome());
			
		}
	}

}
