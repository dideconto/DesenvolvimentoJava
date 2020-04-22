package models;

public class Funcionario extends Pessoa{	
	
	public Funcionario() {
		super();
	}

	public Funcionario(String nome, String cpf) {
		super(nome, cpf);
	}

	@Override
	public String toString() {
		return "Nome: " + getNome() + " | CPF: " + getCpf();
	}

}
