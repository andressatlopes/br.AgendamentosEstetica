package br.AgendamentoEstetica.Principal.Model;

import javax.persistence.*;

@Entity
@DiscriminatorValue("ESTETICISTA")
public class Esteticista extends Pessoa {
	@Column(unique = true)
	private String email;
	
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name = "nome", column = @Column(name="especialidade_nome")),
		@AttributeOverride(name = "formacao", column = @Column(name="especialidade_formação")),
		@AttributeOverride(name = "descricao", column = @Column(name="especialidade_descricao"))
	})
	
	private Especialidade especialidade;

	public Especialidade getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(Especialidade especialidade) {
		this.especialidade = especialidade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
