package dao;

import models.Cliente;
import models.Funcionario;
import models.Produto;

public class Dados {

	public static void inicializar() {
		Cliente c = new Cliente();
		c.setNome("Diogo Deconto");
		c.setCpf("05363419904");
		ClienteDAO.cadastrarCliente(c);
		
		Funcionario f = new Funcionario();
		f.setNome("José da Silva");
		f.setCpf("05363419904");
		FuncionarioDAO.cadastrarFuncionario(f);
		
		Produto p = new Produto();
		p.setNome("Bolacha");
		p.setPreco(2.5);
		p.setQuantidade(15);
		ProdutoDAO.cadastrarProduto(p);
		
	}
	
}
