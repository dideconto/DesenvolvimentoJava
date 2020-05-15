package dao;

import java.util.List;

import javax.persistence.EntityManager;

import models.Funcionario;

public class FuncionarioDAO {

	public static void cadastrar(Funcionario funcionario) {
		EntityManager em = JPAUtils.getInstance();
		em.getTransaction().begin();
		em.persist(funcionario);
		em.getTransaction().commit();
	}
	
	public static Funcionario buscarPorId(int id) {
//		EntityManager em = JPAUtils.getInstance();
//		Funcionario f = em.find(Funcionario.class, id);
//		return f;		
		return JPAUtils.getInstance().find(Funcionario.class, id);
	}
	
	public static List<Funcionario> listar(){
		EntityManager em = JPAUtils.getInstance();
		List<Funcionario> funcionarios = 
				em.createQuery("SELECT f FROM Funcionario f", Funcionario.class).getResultList();
		return funcionarios;
	}
	
	public static void remover(Funcionario f) {
		JPAUtils.getInstance().getTransaction().begin();
		JPAUtils.getInstance().remove(f);
		JPAUtils.getInstance().getTransaction().commit();
	}
	
	public static void alterar(Funcionario f) {
		JPAUtils.getInstance().getTransaction().begin();
		JPAUtils.getInstance().merge(f);
		JPAUtils.getInstance().getTransaction().commit();
	}
	
}













