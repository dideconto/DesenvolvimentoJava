package models;

public class Cliente {
	
	//As classes de modelo vão definir as informações do 
	//que está sendo modelado
	
	//Atributos, propriedades ou características
	
	//Os atributos devem ser SEMPRE privados
	
	//Criar um construtor que pegue a data e hora atual do
	//sistema e defina isso no objeto criado
	
	//Desenvolver as funcionalidades 1 e 2 do projeto
	//de vendas
	
	public Cliente(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public Cliente() {}
	
	private String nome;
	private String cpf;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public String toString() {
		return "Nome: " + this.nome + " | CPF: " + this.cpf;
	}
	
	public Boolean verificarCpf() {
		
		return true;
	}
	

}
