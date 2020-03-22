
public class Exercicio10 {

	public static void main(String[] args) {
		// Exercício 10
		
		int[] vetor = new int[10];
//		int[][] vetor = new int[10][10];
//		int[] teste = {1, 2, 3, 4};
		
		for(int i = 0; i <= 9; i++) {
			vetor[i] = Console.readInt("Digite um valor: ");
		}
		for (int i = 0; i <= 9; i++) {
			System.out.println("Posição " + i + ": " + vetor[i]);
		}

	}

}









