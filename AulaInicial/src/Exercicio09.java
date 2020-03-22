
public class Exercicio09 {

	public static void main(String[] args) {
		// Exercício 09

		int n, cont = 0, soma = 0, media;

		do {
			n = Console.readInt("Digite um número: ");
			if (n >= 0) {
				soma += n;
				cont++;
			}
		} while (n >= 0);
		media = soma / cont;
		System.out.println("Média: " + media);

	}

}
