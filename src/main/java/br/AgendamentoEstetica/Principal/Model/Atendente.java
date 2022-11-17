package br.AgendamentoEstetica.Principal.Model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("ATENDENTE")
public class Atendente extends Pessoa {
	
	@Column(unique = true)

	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
