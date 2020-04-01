package views;
import dao.FuncionarioDAO;
import dao.ProdutoDAO;
import models.Produto;

public class ListarProdutos {	
	
	public static void renderizar() {
		System.out.println("\n -- LISTAR PRODUTOS --\n ");	
		
		for(Produto produtoCadastrado : ProdutoDAO.retonarProdutos()) {
			System.out.println(produtoCadastrado);
		}
	}
}
