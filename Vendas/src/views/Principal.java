package views;
//MVC - Separa��o do projeto em camadas
//Model - Camada das classes de modelo
//View - Camada de visualiza��o - Classes que interagem com o usu�rio
//Controller - 

import dao.Dados;
import dao.VendaDAO;
import models.Cliente;
import models.Venda;
import utils.Console;

public class Principal {

	public static void main(String[] args) {
		
		Dados.inicializar();
		
		int opcao;
		do {
			System.out.println("\n -- PROJETO DE VENDAS --\n ");
			System.out.println("1 - Cadastrar cliente");
			System.out.println("2 - Listar clientes");
			System.out.println("3 - Cadastrar funcion�rio");
			System.out.println("4 - Listar funcion�rios");
			System.out.println("5 - Cadastrar produto");
			System.out.println("6 - Listar produtos");
			System.out.println("7 - Cadastrar venda");
			System.out.println("8 - Lista vendas");
			System.out.println("9 - Listar vendas por Cliente");
			System.out.println("0 - Sair");
			opcao = Console.readInt("\nDigite a op��o escolhida: ");
			
			switch (opcao) {
			case 1:		
				CadastrarCliente.renderizar();
				break;
			case 2:
				ListarClientes.renderizar();
				break;
			case 3:		
				CadastrarFuncionario.renderizar();
				break;
			case 4:
				ListarFuncionarios.renderizar();
				break;
			case 5:		
				CadastrarProduto.renderizar();
				break;
			case 6:
				ListarProdutos.renderizar();
				break;
			case 7:
				CadastrarVenda.renderizar();
				break;
			case 8:
				ListarVendas.renderizar(VendaDAO.retornarVendas());
				break;
			case 9:
				String cpf = Console.readString("Digite o CPF do cliente: ");
				ListarVendas.renderizar(VendaDAO.retornarVendasPorCliente(cpf));
				break;
			case 0:
				System.out.println("\nSaindo...");
				break;
			default:
				System.out.println("\n -- OP��O INV�LIDA!!! --\n ");
				break;
			}
			
		} while (opcao != 0);
	}
}









