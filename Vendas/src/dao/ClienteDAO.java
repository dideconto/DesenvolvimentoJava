package dao;

import java.util.ArrayList;

import models.Cliente;

//MVC
/**
 * Esse é classe responsável por realizar operações de CRUD para o objeto de
 * Cliente
 * 
 * @author Diogo Steinke Deconto
 * 
 */
public class ClienteDAO {

	// DAO - Data Access Object
	private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();

	// criar um método para buscar o cliente
	public static Cliente buscarClientePorCpf(String cpf) {
		for (Cliente clienteCadastrado : clientes) {
			if (clienteCadastrado.getCpf().equals(cpf)) {
				return clienteCadastrado;
			}
		}
		return null;
	}

	// JavaDoc
	// Qual é motivo das aplicações em Java rodarem em qualquer SO.
	/**
	 * Este busca um objeto do tipo cliente com base no CPF
	 * 
	 * @param Objeto do tipo Cliente
	 * @return Retorna um objeto de cliente
	 */
	public static Boolean cadastrarCliente(Cliente c) {
		if (buscarClientePorCpf(c.getCpf()) == null) {
			clientes.add(c);
			return true;
		}
		return false;
	}

	public static ArrayList<Cliente> retonarClientes() {
		return clientes;
	}

}
