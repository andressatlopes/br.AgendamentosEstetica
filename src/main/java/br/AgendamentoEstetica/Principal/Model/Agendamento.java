package br.AgendamentoEstetica.Principal.Model;

import java.time.LocalDate;
import java.util.Optional;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Agendamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "data", columnDefinition = "DATE")
	private LocalDate data;
	
	private String horario;
	
	@OneToOne  
	private Cliente cliente;

	@OneToOne
	private Atendente atendente;

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
