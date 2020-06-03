package dao;

import java.util.List;

import javax.persistence.EntityManager;

import models.Produto;

public class ProdutoDAO {

	public static void cadastrar(Produto produto) {
		EntityManager em = JPAUtils.getInstance();
		em.getTransaction().begin();
		em.persist(produto);
		em.getTransaction().commit();
	}
	
	public static Produto buscarPorId(int id) {	
		return JPAUtils.getInstance().find(Produto.class, id);
	}
	
	public static List<Produto> listar(){
		EntityManager em = JPAUtils.getInstance();
		List<Produto> produtos = 
				em.createQuery("SELECT p FROM Produto p", Produto.class).getResultList();
		return produtos;
	}
	
	public static void remover(Produto p) {
		EntityManager em = JPAUtils.getInstance();
		em.getTransaction().begin();
		em.remove(em.merge(p));
		em.getTransaction().commit();
	}
	
	public static void editar(Produto p) {
		EntityManager em = JPAUtils.getInstance();
		em.getTransaction().begin();
		em.merge(p);
		em.getTransaction().commit();
	}
	
}













