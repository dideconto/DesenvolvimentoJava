package dao;

import java.util.ArrayList;

import models.Professor;

public class ProfessorDAO implements Idao<Professor>{
	
	private static ArrayList<Professor> professores = new ArrayList<Professor>() ;
	
	@Override
	public void cadastrar(Professor p) {
		professores.add(p);
	}

	@Override
	public ArrayList<Professor> listarTodos(){
		return professores;
	}
	
}
