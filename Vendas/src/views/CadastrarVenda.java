package views;
import dao.ClienteDAO;
import models.Cliente;
import models.Venda;
import utils.Console;
import utils.Validacao;

public class CadastrarVenda {

	private static Venda v = new Venda();

	public static void renderizar() {

		v = new Venda();

		System.out.println("\n -- CADASTRAR VENDA --\n ");
		
		String cpf = Console.readString("Digite o CPF do cliente: ");
		
		if(ClienteDAO.buscarClientePorCpf(cpf) != null){
			//Colocar o objeto de cliente dentro da venda
			//Colocar o objeto de vendedor dentro da venda
			//Colocar o objeto de produto dentro da venda
			//Colocar a quantidade do produto vendido dentro venda
			//Cadastrar a venda no VendaDAO
			//Listar todas as vendas
		}else {
			System.out.println("\nEsse cliente não existe!");
		}

	}

}