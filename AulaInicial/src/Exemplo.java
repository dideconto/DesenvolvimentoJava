
public class Exemplo {

	public static void main(String[] args) {
		String nome, teste;
		int idade;
		
		// Classe de exemplo
		
		//Imprimir uma mensagem no console
		System.out.println("Classe com exemplos em Java");
		
		//Leitura de dados do teclado
		nome = Console.readString("\nDigite o seu nome: ");		
		System.out.println("O nome digitado foi: " + nome);
		
		idade = Console.readInt("\nDigite a sua idade: ");
		System.out.println("A idade digitada foi: " + idade);
		
		if (idade >= 18) {
			System.out.println("Maior de idade!");
		}else{
			System.out.println("Menor de idade!");
		}
		
		

	}

}
