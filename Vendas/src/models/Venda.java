package models;

public class Venda {

	//Criando em relacionamento entre Venda e Cliente: composi��o ou � um agrega��o
	//cliente, funcion�rio e produto -> Agrega��o
	private Cliente cliente;
	private Funcionario funcionario;
	private Produto produto;
	private int quantidade;
	
	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	
	
}
