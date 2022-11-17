package br.AgendamentoEstetica.Principal.Model;

import javax.persistence.Embeddable;

@Embeddable
public class Endereco {

	private String rua;
	private String numero;
	private String bairro;

	public Endereco() {
	}

	public Endereco(String rua, String numero, String bairro) {
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
	}

	/**
	 * @return the rua
	 */
	public String getRua() {
		return rua;
	}

	/**
	 * @param rua the rua to set
	 */
	public void setRua(String rua) {
		this.rua = rua;
	}

	/**
	 * @return the numero
	 */
	public String getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}

	/**
	 * @return the bairro
	 */
	public String getBairro() {
		return bairro;
	}

	/**
	 * @param bairro the bairro to set
	 */
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

}
