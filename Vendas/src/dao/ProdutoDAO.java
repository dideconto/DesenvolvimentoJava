package dao;
import java.util.ArrayList;

import models.Cliente;
import models.Funcionario;
import models.Produto;

//MVC
public class ProdutoDAO {

	//DAO - Data Access Object
	private static ArrayList<Produto> produtos = new ArrayList<Produto>();
	
	public static Boolean cadastrarProduto(Produto p) {		
		for (Produto produtoCadastrado : produtos) {
			if(produtoCadastrado.getNome().equals(p.getNome())) {
				return false;
			}
		}		
		produtos.add(p);	
		return true;
	}
	
	public static ArrayList<Produto> retonarProdutos(){
		return produtos;
	}
	
	
}
