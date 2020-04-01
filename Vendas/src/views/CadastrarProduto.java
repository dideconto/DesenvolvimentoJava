package views;

import dao.ProdutoDAO;
import models.Produto;
import utils.Console;

public class CadastrarProduto {

	private static Produto p = new Produto();

	public static void renderizar() {

		p = new Produto();

		System.out.println("\n -- CADASTRAR PRODUTO --\n ");

		p.setNome(Console.readString("Digite o nome: "));
		p.setPreco(Console.readDouble("Digite o pre�o: "));
		p.setQuantidade(Console.readInt("Digite a quantidade: "));

		if (ProdutoDAO.cadastrarProduto(p)) {
			System.out.println("\nPRODUTO CADASTRADO!!!\n");
		} else {
			System.out.println("\nESSE PRODUTO J� EXISTE!!!\n");
		}

	}

}