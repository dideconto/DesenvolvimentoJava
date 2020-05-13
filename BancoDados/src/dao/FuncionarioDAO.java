package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import models.Funcionario;

public class FuncionarioDAO {
	
	public static void cadastrar(Funcionario f) {
		EntityManagerFactory factory = 
				Persistence.createEntityManagerFactory("BANCO_DADOS");
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(f);
		em.getTransaction().commit();
	}

}
