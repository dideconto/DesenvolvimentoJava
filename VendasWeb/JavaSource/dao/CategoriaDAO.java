package dao;

import java.util.List;

import javax.persistence.EntityManager;

import models.Categoria;
import models.Produto;
import utils.JPAUtils;

public class CategoriaDAO {
	
	public static List<Categoria> listar(){
		EntityManager em = JPAUtils.getInstance();
		List<Categoria> categorias = 
				em.createQuery("SELECT c FROM Categoria c", Categoria.class).getResultList();
		return categorias;
	}
	
	public static Categoria buscarPorId(int id) {
		EntityManager em = JPAUtils.getInstance();
		return em.find(Categoria.class, id);
	}
}
