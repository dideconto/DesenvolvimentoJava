import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		//Vetor
		String[] vetorStrings = new String[4];
		
		vetorStrings[0] = "Diogo Deconto";
		vetorStrings[1] = "Jos� Pereira";
		vetorStrings[2] = "Maria da Silva";
		//vetorStrings[3] = "Felipe Ribeiro";
		
		for(int i = 0; i < vetorStrings.length; i++) {
			System.out.println(vetorStrings[i]);
		}
		
		System.out.println();
		
		for(String posicao : vetorStrings) {
			System.out.println(posicao);
		}
		
		System.out.println();
		
		//Cole��o
		ArrayList<String> colecaoStrings = new ArrayList<String>(); 
		
		colecaoStrings.add("Futebol");
		colecaoStrings.add("Basquete");
		colecaoStrings.add("Volei");
		
		for(String posicao : colecaoStrings) {
			System.out.println(posicao);
		}
		
		System.out.println("Vetor: " + vetorStrings.length);
		System.out.println("Cole��o: " + colecaoStrings.size());
		

	}

}
//RAFAEL DUBIELA
//contato@luminostechnology.com
//www.luminostechnology.com
//41 98842-3123








