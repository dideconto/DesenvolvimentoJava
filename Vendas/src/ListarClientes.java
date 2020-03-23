import java.util.ArrayList;

public class ListarClientes {	
	
	public static void renderizar() {
		System.out.println("\n -- LISTAR CLIENTES --\n ");	
		
		for(Cliente clienteCadastrado : ClienteDAO.retonarClientes()) {
			System.out.println(clienteCadastrado);
		}
	}
}
