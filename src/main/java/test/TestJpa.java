package test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import entite.Article;

public class TestJpa {
	private static final Logger LOG = LoggerFactory.getLogger(TestJpa.class);
	 public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu_essai");
		EntityManager em = entityManagerFactory.createEntityManager();
		
		
		TypedQuery<Article> query2 = em.createQuery("select a from Article a", Article.class);
		if (query2 != null) {
			List<Article> articles = query2.getResultList();
			LOG.info("le nombre article est"+articles.size());
			
			
		}
		
		em.close();
		entityManagerFactory.close();
		
		
	}
	
}
