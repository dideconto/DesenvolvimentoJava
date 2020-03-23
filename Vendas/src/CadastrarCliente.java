import java.util.ArrayList;

public class CadastrarCliente {
	
	private static Cliente c = new Cliente();
	
	public static void renderizar() {
		System.out.println("\n -- CADASTRAR CLIENTE --\n ");
		
		//Preenchendo o objeto de cliente
		c.setNome(Console.readString("Digite o nome: "));
		c.setCpf(Console.readString("Digite o CPF: "));
		
		//Cadastrar o objeto de cliente na lista de clientes
		ClienteDAO.cadastrarCliente(c);
		
		System.out.println("\nCLIENTE CADASTRADO!!!\n");
	}
	
}