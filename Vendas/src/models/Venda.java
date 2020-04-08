package models;

import java.util.ArrayList;

public class Venda {

	//Criando em relacionamento entre Venda e Cliente: composi��o ou � um agrega��o
	//cliente, funcion�rio e produto -> Agrega��o
	private Cliente cliente;
	private Funcionario funcionario;
	private ArrayList<ItemVenda> ItensVenda;	
	
	public ArrayList<ItemVenda> getItensVenda() {
		return ItensVenda;
	}

	public void setItensVenda(ArrayList<ItemVenda> itensVenda) {
		ItensVenda = itensVenda;
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
