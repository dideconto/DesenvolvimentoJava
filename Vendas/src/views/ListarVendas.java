package views;

import java.util.ArrayList;

import dao.ClienteDAO;
import models.Cliente;
import models.ItemVenda;
import models.Venda;

public class ListarVendas {

	public static void renderizar(ArrayList<Venda> vendas) {

		double subtotal, totalVenda = 0, total = 0;

		System.out.println("\n -- LISTAR VENDAS --\n ");

		for (Venda vendaCadastrada : vendas) {
			System.out.println("Cliente: " + vendaCadastrada.getCliente().getNome());
			System.out.println("Funcionário: " + vendaCadastrada.getFuncionario().getNome());
			System.out.println();
			totalVenda = 0;
			for (ItemVenda itemVenda : vendaCadastrada.getItensVenda()) {
				System.out.println("\tProduto: " + itemVenda.getProduto().getNome());
				subtotal = itemVenda.getPreco() * itemVenda.getQuantidade();
				System.out.println("\t" + itemVenda.getPreco() + " x " + itemVenda.getQuantidade() + " = " + subtotal);
				System.out.println();
				totalVenda += subtotal;
			}
			System.out.println("\tTotal da venda: " + totalVenda);
			System.out.println();
			total += totalVenda;
		}
		System.out.println("Total: " + totalVenda);
		System.out.println();
	}
}
