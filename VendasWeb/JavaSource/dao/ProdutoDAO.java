package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import models.Produto;
import utils.JPAUtils;

public class ProdutoDAO {
	
	public static boolean cadastrar(Produto produto) {
//		EntityManager em = JPAUtils.getInstance();
//		em.getTransaction().begin();
//		em.persist(produto);
//		em.getTransaction().commit();
		Produto p = buscarPorNome(produto.getNome());
		if(p != null) {
			System.out.println("********Quantidade do produto: " + p.getQuantidade());
			return false;
		}else {
			System.out.println("********Objeto não encontrado!");
			return true;
		}
	}
	
	public static Produto buscarPorNome(String nome) {
		//JPQL
		EntityManager em = JPAUtils.getInstance();
		TypedQuery<Produto> produto =
				em.createQuery("SELECT p FROM Produto p WHERE p.nome = :nome", Produto.class);
		produto.setParameter("nome", nome);		
		try {
			return produto.getSingleResult();
		} catch (NoResultException e) {
			return null;
		} 
//		catch (Exception e) {
//			// TODO: handle exception
//		} finally {
//			
//		}
	}
	
	public static List<Produto> listar(){
		EntityManager em = JPAUtils.getInstance();
		return em.createQuery("SELECT p FROM Produto p", Produto.class).getResultList();
	}
	
	public static void remover(Produto produto) {
		EntityManager em = JPAUtils.getInstance();
		em.getTransaction().begin();
		em.remove(em.merge(produto));
		em.getTransaction().commit();
	}
	
	public static void alterar(Produto produto) {
		EntityManager em = JPAUtils.getInstance();
		em.getTransaction().begin();
		em.merge(produto);
		em.getTransaction().commit();
	}
	
	public static Produto buscarPorId(int id) {
		EntityManager em = JPAUtils.getInstance();
		return em.find(Produto.class, id);
	}

}











