package views;
//MVC - Separação do projeto em camadas
//Model - Camada das classes de modelo
//View - Camada de visualização - Classes que interagem com o usuário
//Controller - 

import utils.Console;

public class Principal {

	public static void main(String[] args) {
		
		int opcao;
		do {
			System.out.println("\n -- PROJETO DE VENDAS --\n ");
			System.out.println("1 - Cadastrar cliente");
			System.out.println("2 - Listar clientes");
			System.out.println("0 - Sair");
			opcao = Console.readInt("\nDigite a opção escolhida: ");
			
			switch (opcao) {
			case 1:		
				CadastrarCliente.renderizar();
				break;
			case 2:
				ListarClientes.renderizar();
				break;
			case 0:
				System.out.println("\nSaindo...");
				break;
			default:
				System.out.println("\n -- OPÇÃO INVÁLIDA!!! --\n ");
				break;
			}
			
		} while (opcao != 0);
	}
}









