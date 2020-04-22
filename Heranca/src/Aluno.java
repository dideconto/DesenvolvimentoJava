
public class Aluno extends Pessoa{
	
	private String matricula;	
	
	public Aluno(String nome, String sexo, String matricula) {
		super(nome, sexo);
		this.matricula = matricula;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}	
	
	@Override
	public String toString() {
		return  "Nome: " + getNome() + 
				" | Sexo: " + getSexo() + 
				" | Matrícula: " + getMatricula();
	}

	@Override
	public String darBomDia() {
		return "Bom dia professor!";
	}
	
	
	
	
	
	
	
	
	
	
}
