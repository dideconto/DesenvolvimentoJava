package views;
import dao.ClienteDAO;
import dao.FuncionarioDAO;
import models.Funcionario;
import utils.Console;
import utils.Validacao;

public class CadastrarFuncionario {

	private static Funcionario f = new Funcionario();

	public static void renderizar() {

		f = new Funcionario();

		System.out.println("\n -- CADASTRAR FUNCION�RIO --\n ");

		f.setNome(Console.readString("Digite o nome: "));
		f.setCpf(Console.readString("Digite o CPF: "));

		// Verificar CPF aqui
		
		if (Validacao.validarCpf(f.getCpf())) {
			if (FuncionarioDAO.cadastrarFuncionario(f)) {
				System.out.println("\nFUNCION�RIO CADASTRADO!!!\n");
			} else {
				System.out.println("\nESSE FUNCION�RIO J� EXISTE!!!\n");
			}
		}else {
			System.out.println("\nCPF inv�lido!");
		}

	}

}