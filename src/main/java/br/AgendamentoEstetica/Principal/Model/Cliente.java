package br.AgendamentoEstetica.Principal.Model;

import javax.persistence.*;

@Entity
@DiscriminatorValue("CLIENTE")
public class Cliente extends Pessoa {
	
	private int idade;
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name = "rua", column = @Column(name="endereco_rua")),
		@AttributeOverride(name = "numero", column = @Column(name="endereco_numero")),
		@AttributeOverride(name = "bairro", column = @Column(name="endereco_bairro"))
	})
	private Endereco endereco;
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
}
