package br.AgendamentoEstetica.Principal.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Procedimento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String nomeProtocolo;
	
	private String descricao;
	
	@OneToOne
	private Esteticista esteticista;
	
	@Column(precision = 6, scale = 2)
	private double valor;
	
	public String getNomeProtocolo() {
		return nomeProtocolo;
	}
	public void setNomeProtocolo(String nomeProtocolo) {
		this.nomeProtocolo = nomeProtocolo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Esteticista getEsteticista() {
		return esteticista;
	}
	public void setEsteticista(Esteticista esteticista) {
		this.esteticista = esteticista;
	}
}
