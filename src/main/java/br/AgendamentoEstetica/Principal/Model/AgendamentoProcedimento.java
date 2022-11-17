package br.AgendamentoEstetica.Principal.Model;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.mapping.Array;

public class AgendamentoProcedimento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@OneToOne
	private Agendamento agendamento;
	@OneToMany
	private List<Procedimento> procedimentos = new ArrayList<>();
	@Column(precision = 6, scale = 2)
	private double total;
	
}
