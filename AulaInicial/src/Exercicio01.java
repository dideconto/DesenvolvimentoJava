
public class Exercicio01 {

	public static void main(String[] args) {
		// Exerc�cio 01
		int n1, n2;		
		
		n1 = Console.readInt("Digite o n�mero 1: ");
		n2 = Console.readInt("Digite o n�mero 2: ");
		
		if(n1 > n2) {
			//N�mero � maior
			System.out.println("N�mero um � maior");
		}else{
			if(n1 < n2) {
				//N�mero � menor
				System.out.println("N�mero um � menor");
			}else {
				//N�mero � igual
				System.out.println("N�mero um � igual");
			}
		}
	}
}







