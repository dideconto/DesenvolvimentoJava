
public class Exercicio06 {

	public static void main(String[] args) {
		// Exerc�cio 06
		
		int par = 0, impar = 0, n;
		
		for(int i = 0; i <= 9; i++) {
			n = Console.readInt("Digite um n�mero: ");
			if(n % 2 == 0) {
				//Par
				par++;
				//par += 1;
				//par = par + 1;
			}else {
				//�mpar
				impar++;
			}
		}
		System.out.println("Pares: " + par);
		System.out.println("�mpares: " + impar);

	}

}
