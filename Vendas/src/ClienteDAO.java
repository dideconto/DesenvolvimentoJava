import java.util.ArrayList;

public class ClienteDAO {

	//DAO - Data Access Object
	private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	
	public static void cadastrarCliente(Cliente c) {
		clientes.add(c);		
	}
	
	public static ArrayList<Cliente> retonarClientes(){
		return clientes;
	}
	
	
}
