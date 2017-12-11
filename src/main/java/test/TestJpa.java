package test;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import entite.Adresse;
import entite.Banque;
import entite.Client;
import entite.Compte;


public class TestJpa {
	private static final Logger LOG = LoggerFactory.getLogger(TestJpa.class);
	 public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu_essai");
		EntityManager em = entityManagerFactory.createEntityManager();
		
		
		EntityTransaction et = em.getTransaction();
		et.begin();
		
		Banque banque = new Banque("Société Générale");
		Adresse adresse1 = new Adresse(20, "boulevard de la Pinède", 13011, "Marseille");
		Adresse adresse2 = new Adresse(39, "avenue Marcelin Berthelot", 92320, "Chatillon");
		Client client1 = new Client ("DUMA", "Bomay", LocalDate.of(1991, 8, 25), adresse1, banque);
		Client client2 = new Client ("BUI", "Binh Thoai", LocalDate.of(1960,5,2), adresse2, banque);
		banque.getClients().add(client1);
		banque.getClients().add(client2);
		
		/*Adresse adresse1 = new Adresse(20, "boulevard de la Pinède", 13011, "Marseille");
		em.persist(adresse1);
		
		Adresse adresse2 = new Adresse(39, "avenue Marcelin Berthelot", 92320, "Chatillon");
		em.persist(adresse1);
		
		Compte compte1 = new Compte("NDE123",1988.57);
		em.persist(compte1);		
		
		Compte compte2 = new Compte("NOE123",1500.17);
		em.persist(compte2);	

		Client client1 = new Client ("DUMA", "Bomay", LocalDate.of(1991, 8, 25), adresse1, banque1);
		em.persist(client1);
		
		Client client2 = new Client ("BUI", "Binh Thoai", LocalDate.of(1960,5,2), adresse2, banque2);
		em.persist(client2);*/
		
		em.persist(banque);// ajouter à la base
		em.persist(client1);
		em.persist(client2);
		
		et.commit();
		
		em.close();
		entityManagerFactory.close();
		
		
	}
	
}
