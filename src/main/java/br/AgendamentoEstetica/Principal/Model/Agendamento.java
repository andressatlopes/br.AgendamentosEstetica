package br.AgendamentoEstetica.Principal.Model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Optional;

@Entity
public class Agendamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "data", columnDefinition = "DATE")
	private LocalDate data;
	@Column(name= "horario")
	private String horario;
	
	@OneToOne  
	private Cliente cliente;

	@OneToOne
	private Atendente atendente;
	
	@Enumerated(EnumType.STRING)
	private Procedimentos procedimento;

	public Procedimentos getProcedimento() {
		return procedimento;
	}

	public void setProcedimento(Procedimentos procedimento) {
		this.procedimento = procedimento;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getId() {
		return id;
	}

	public Atendente getAtendente() {
		return atendente;
	}

	public void setAtendente(Atendente atendente) {
		this.atendente = atendente;
	}

	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public Optional<Cliente> getCliente() {
		return Optional.ofNullable(cliente);
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	
}
