package views;

import dao.ClienteDAO;
import dao.FuncionarioDAO;
import dao.ProdutoDAO;
import dao.VendaDAO;
import models.Cliente;
import models.Funcionario;
import models.Produto;
import models.Venda;
import utils.Console;

public class CadastrarVenda {

	private static Venda v = new Venda();
	private static Cliente c = new Cliente();
	private static Funcionario f = new Funcionario();
	private static Produto p = new Produto();

	public static void renderizar() {

		v = new Venda();
		c = new Cliente();
		p = new Produto();
		f = new Funcionario();

		System.out.println("\n -- CADASTRAR VENDA --\n ");

		//Cliente
		c.setCpf(Console.readString("Digite o CPF do cliente: "));
		c = ClienteDAO.buscarClientePorCpf(c.getCpf());
		if (c != null) {
			v.setCliente(c);
			
			//Funcionário
			f.setCpf(Console.readString("Digite o CPF do funcionário: "));
			f = FuncionarioDAO.buscarFuncionarioPorCpf(f.getCpf());
			if (f != null) {
				v.setFuncionario(f);
				
				//Produto
				p.setNome(Console.readString("Digite o nome do produto: "));
				p = ProdutoDAO.buscarProdutoPorNome(p.getNome());
				if(p != null) {
					v.setProduto(p);
					v.setQuantidade(Console.readInt("Digite a quantidade do produto: "));
					if(v.getQuantidade() <= p.getQuantidade()) {
						VendaDAO.cadastrarVenda(v);
						System.out.println("\nVenda cadastrada!");
					}else {
						System.out.println("\nA quantidade está acima do nosso estoque!");
					}					
				}else {
					System.out.println("\nEsse produto não existe!");
				}
			} else {
				System.out.println("\nEsse funcionário não existe!");
			}
		} else {
			System.out.println("\nEsse cliente não existe!");
		}
	}
}