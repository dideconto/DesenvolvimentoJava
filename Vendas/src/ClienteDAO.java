import java.util.ArrayList;

public class ClienteDAO {

	//DAO - Data Access Object
	private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	
	public static Boolean cadastrarCliente(Cliente c) {		
		for (Cliente clienteCadastrado : clientes) {
			if(clienteCadastrado.getCpf().equals(c.getCpf())) {
				return false;
			}
		}		
		clientes.add(c);	
		return true;
	}
	
	public static ArrayList<Cliente> retonarClientes(){
		return clientes;
	}
	
	
}
