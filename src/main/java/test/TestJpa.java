package test;

import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import entite.Article;
import entite.BonCommande;

public class TestJpa {
	private static final Logger LOG = LoggerFactory.getLogger(TestJpa.class);
	 public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu_essai");
		EntityManager em = entityManagerFactory.createEntityManager();
		
		
		TypedQuery<Article> query = em.createQuery("select a from Article a", Article.class);
		if (query != null) {
			List<Article> articles = query.getResultList();
			LOG.info("le nombre article est"+articles.size());
		}
		
		TypedQuery<BonCommande> query1 = em.createQuery("FROM BonCommande b WHERE numero =2", BonCommande.class);
		BonCommande bon = query1.getResultList().get(0);
		Set<Article> articles = bon.getArticles();
		for(Article article : articles) {
			LOG.info(article.getDesignation());
		}
		
		
		em.close();
		entityManagerFactory.close();
		
		
	}
	
}
