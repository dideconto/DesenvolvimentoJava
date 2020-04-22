package models;

public class Cliente extends Pessoa{
	
	//As classes de modelo v�o definir as informa��es do 
	//que est� sendo modelado
	
	//Atributos, propriedades ou caracter�sticas
	
	//Os atributos devem ser SEMPRE privados
	
	//Criar um construtor que pegue a data e hora atual do
	//sistema e defina isso no objeto criado
	
	//Desenvolver as funcionalidades 1 e 2 do projeto
	//de vendas
	
	public Cliente(String nome, String cpf) {
		super(nome, cpf);
	}
	
	public Cliente() {}
	
	@Override
	public String toString() {
		return "Nome: " + getNome() + " | CPF: " + getCpf();
	}
	

}
