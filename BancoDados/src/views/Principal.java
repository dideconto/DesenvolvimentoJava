package views;

import dao.FuncionarioDAO;
import models.Funcionario;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Criar um projeto Java
		//Criar pacotes models, dao, views
		//Criar no models uma classe com tr�s atributos
		//Criar um menu na classe principal com as opera��es de cadastro e listagem
		
		Funcionario funcionario = 
				new Funcionario("Diogo", "Deconto", "123456789", 12345.45);
		FuncionarioDAO.cadastrar(funcionario);
		System.out.println("Funcion�rio cadastrado!");
		
	}

}
