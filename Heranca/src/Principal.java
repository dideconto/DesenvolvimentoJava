
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		Pessoa pessoa = new Pessoa();
		
		Aluno a = new Aluno("Diogo","M","123456789");		
		System.out.println(a);
		System.out.println(a.darBomDia());
		
		Professor p = new Professor("Alberto","M",4251.23);		
		System.out.println(p);
		System.out.println(p.darBomDia());

	}

}
