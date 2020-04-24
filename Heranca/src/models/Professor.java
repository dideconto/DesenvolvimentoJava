package models;

public class Professor extends Pessoa{
	
	public double salario;	

	public Professor(String nome, String sexo, double salario) {
		super(nome, sexo);
		this.salario = salario;
	}

	public Professor(String nome, String sexo) {
		super(nome, sexo);
		// TODO Auto-generated constructor stub
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	@Override
	public String toString() {
		return  "Nome: " + getNome() + 
				" | Sexo: " + getSexo() + 			
				" | Salário: " + getSalario();
	}
	
	@Override
	public String darBomDia() {
		return "Bom dia aluno!";
	}
}



















