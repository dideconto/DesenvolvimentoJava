package views;
import dao.ClienteDAO;
import models.Cliente;
import utils.Console;
import utils.Validacao;

public class CadastrarCliente {

	private static Cliente c = new Cliente();

	public static void renderizar() {

		c = new Cliente();

		System.out.println("\n -- CADASTRAR CLIENTE --\n ");

		// Preenchendo o objeto de cliente
		c.setNome(Console.readString("Digite o nome: "));
		c.setCpf(Console.readString("Digite o CPF: "));

		// Cadastrar o objeto de cliente na lista de clientes
		// Verificar CPF aqui
		
		if (Validacao.validarCpf(c.getCpf())) {
			if (ClienteDAO.cadastrarCliente(c)) {
				System.out.println("\nCLIENTE CADASTRADO!!!\n");
			} else {
				System.out.println("\nESSE CLIENTE J� EXISTE!!!\n");
			}
		}else {
			System.out.println("\nCPF inv�lido!");
		}

	}

}