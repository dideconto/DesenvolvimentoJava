package dao;

import java.util.ArrayList;

import models.Cliente;
import models.Funcionario;
import models.Produto;

//MVC
public class ProdutoDAO {

	// DAO - Data Access Object
	private static ArrayList<Produto> produtos = new ArrayList<Produto>();

	public static Produto buscarProdutoPorNome(String nome) {
		for (Produto produtoCadastrado : produtos) {
			if (produtoCadastrado.getNome().equals(nome)) {
				return produtoCadastrado;
			}
		}
		return null;
	}

	public static Boolean cadastrarProduto(Produto p) {
		if (buscarProdutoPorNome(p.getNome()) == null) {
			produtos.add(p);
			return true;
		}
		return false;
	}

	public static ArrayList<Produto> retonarProdutos() {
		return produtos;
	}

}
