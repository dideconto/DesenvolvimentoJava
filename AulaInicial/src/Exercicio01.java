
public class Exercicio01 {

	public static void main(String[] args) {
		// Exercício 01
		int n1, n2;		
		
		n1 = Console.readInt("Digite o número 1: ");
		n2 = Console.readInt("Digite o número 2: ");
		
		if(n1 > n2) {
			//Número é maior
			System.out.println("Número um é maior");
		}else{
			if(n1 < n2) {
				//Número é menor
				System.out.println("Número um é menor");
			}else {
				//Número é igual
				System.out.println("Número um é igual");
			}
		}
	}
}







