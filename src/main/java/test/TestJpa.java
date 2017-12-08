package test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class TestJpa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu_essai");
		EntityManager em = entityManagerFactory.createEntityManager();
		
		
		TypedQuery<Article> query2 = em.createQuery("select a from article", Article.class);
		if (query2 != null) {
			List<Article> articles = query2.getResultList();
		}
		
		em.close();
		entityManagerFactory.close();
		
		
	}
	
}
