package dao;

import java.util.List;

import javax.persistence.EntityManager;

import models.Produto;
import utils.JPAUtils;

public class ProdutoDAO {
	
	public static void cadastrar(Produto produto) {
		EntityManager em = JPAUtils.getInstance();
		em.getTransaction().begin();
		em.persist(produto);
		em.getTransaction().commit();
	}
	
	public static List<Produto> listar(){
		EntityManager em = JPAUtils.getInstance();
		List<Produto> produtos = 
				em.createQuery("SELECT p FROM Produto p", Produto.class).getResultList();
		return produtos;
	}
	
	public static void remover(Produto produto) {
		EntityManager em = JPAUtils.getInstance();
		em.getTransaction().begin();
		em.remove(em.merge(produto));
		em.getTransaction().commit();
	}

}











