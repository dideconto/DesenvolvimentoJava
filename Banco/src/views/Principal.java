package views;

import dao.FuncionarioDAO;
import models.Funcionario;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Diogo");
		funcionario.setCpf("123456789");
		funcionario.setSalario(123456.45);
		
		FuncionarioDAO.cadastrar(funcionario);
		
		System.out.println("Funcionário cadastrado!");
	}

}
