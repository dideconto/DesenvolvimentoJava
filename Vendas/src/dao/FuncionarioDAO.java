package dao;
import java.util.ArrayList;

import models.Cliente;
import models.Funcionario;

//MVC
public class FuncionarioDAO {

	//DAO - Data Access Object
	private static ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
	
	public static Boolean cadastrarFuncionario(Funcionario f) {		
		for (Funcionario funcionarioCadastrado : funcionarios) {
			if(funcionarioCadastrado.getCpf().equals(f.getCpf())) {
				return false;
			}
		}		
		funcionarios.add(f);	
		return true;
	}
	
	public static ArrayList<Funcionario> retonarFuncionarios(){
		return funcionarios;
	}
	
	
}
