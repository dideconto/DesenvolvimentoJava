package dao;

import java.util.ArrayList;

import models.Aluno;

public class AlunoDAO implements Idao<Aluno>{
	
	private static ArrayList<Aluno> alunos = new ArrayList<Aluno>() ;
	
	public void cadastrar(Aluno a) {
		alunos.add(a);
	}
	
	public ArrayList<Aluno> listarTodos(){
		throw new UnsupportedOperationException();
	}
}
