package views;

import dao.ClienteDAO;
import dao.FuncionarioDAO;
import dao.ProdutoDAO;
import dao.VendaDAO;
import models.Cliente;
import models.Funcionario;
import models.ItemVenda;
import models.Produto;
import models.Venda;
import utils.Console;

public class CadastrarVenda {

	private static Venda v;
	private static Cliente c = new Cliente();
	private static Funcionario f = new Funcionario();
	private static Produto p = new Produto();
	private static ItemVenda iv = new ItemVenda();

	public static void renderizar() {

		v = new Venda();
		c = new Cliente();
		f = new Funcionario();

		System.out.println("\n -- CADASTRAR VENDA --\n ");

		// Cliente
		c.setCpf(Console.readString("Digite o CPF do cliente: "));
		c = ClienteDAO.buscarClientePorCpf(c.getCpf());
		if (c != null) {
			v.setCliente(c);

			// Funcionário
			f.setCpf(Console.readString("Digite o CPF do funcionário: "));
			f = FuncionarioDAO.buscarFuncionarioPorCpf(f.getCpf());
			if (f != null) {
				v.setFuncionario(f);

				// Produto
				do {
					
					p = new Produto();
					iv = new ItemVenda();
					
					System.out.println("\n -- ADICIONAR PRODUTO NA VENDA --\n ");
					p.setNome(Console.readString("\nDigite o nome do produto: "));
					p = ProdutoDAO.buscarProdutoPorNome(p.getNome());
					if (p != null) {
						iv.setProduto(p);
						iv.setQuantidade(Console.readInt("Digite a quantidade do produto: "));
						iv.setPreco(p.getPreco());
						if (iv.getQuantidade() <= p.getQuantidade()) {
							v.getItensVenda().add(iv);
						} else {
							System.out.println("\nA quantidade está acima do nosso estoque!");
						}
					} else {
						System.out.println("\nEsse produto não existe!");
					}
				} while (Console.readString("\nDeseja adicionar um novo produto? S|N: ").equals("S"));
				
				VendaDAO.cadastrarVenda(v);
				System.out.println("\nVenda cadastrada!");
			} else {
				System.out.println("\nEsse funcionário não existe!");
			}
		} else {
			System.out.println("\nEsse cliente não existe!");
		}
	}
}