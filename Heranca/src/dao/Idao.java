package dao;

import java.util.ArrayList;

public interface Idao <T> {
	
	void cadastrar(T objeto);
	
	ArrayList<T> listarTodos();
	
//	ArrayList<T> listarTodos(String parteNome);

}
