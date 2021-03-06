package dao;
import java.util.ArrayList;

import models.Cliente;
import models.Funcionario;

//MVC
public class FuncionarioDAO {

	//DAO - Data Access Object
	private static ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

	public static Funcionario buscarFuncionarioPorCpf(String cpf) {
		for (Funcionario funcionarioCadastrado : funcionarios) {
			if (funcionarioCadastrado.getCpf().equals(cpf)) {
				return funcionarioCadastrado;
			}
		}
		return null;
	}
	
	public static Boolean cadastrarFuncionario(Funcionario f) {
		if(buscarFuncionarioPorCpf(f.getCpf()) == null) {
			funcionarios.add(f);	
			return true;
		}		
		return false;
	}
	
	public static ArrayList<Funcionario> retonarFuncionarios(){
		return funcionarios;
	}
	
	
}
