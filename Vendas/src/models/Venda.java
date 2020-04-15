package models;

import java.util.ArrayList;

public class Venda {

	//Criando em relacionamento entre Venda e Cliente: composi��o ou � um agrega��o
	//cliente, funcion�rio -> Agrega��o
	//itensVenda -> Composi��o
	private Cliente cliente;
	private Funcionario funcionario;
	private ArrayList<ItemVenda> itensVenda;	
	
	public Venda() {
		cliente = new Cliente();
		funcionario = new Funcionario();
		itensVenda = new ArrayList<ItemVenda>();
	}
	
	public ArrayList<ItemVenda> getItensVenda() {
		return itensVenda;
	}

	public void setItensVenda(ArrayList<ItemVenda> itensVenda) {
		itensVenda = itensVenda;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	
	
}
