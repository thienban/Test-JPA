package entite;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="client")
public class Client {
	
		@Id
		@Column(name = "ID")
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer id;
		
		@Column(name = "NOM", length = 30)
		private String nom;
		
		@Column(name = "PRENOM", length = 30)
		private String prenom;
		
		@Column(name = "DATENAISSANCE")
		private LocalDate datenaissance;
		
		@Embedded
		private Adresse adresse;
		
		@ManyToMany
		@JoinTable(name="CLI_COMPTE",
		joinColumns = @JoinColumn(name="ID_CLIENT", referencedColumnName="ID"),
		inverseJoinColumns = @JoinColumn(name="ID_COMPTE", referencedColumnName="ID")
		)
		private Set<Compte> comptes ;
	
		@ManyToOne
		@JoinColumn(name = "ID_BANQUE")
		private Banque banque ;

		public Client(String nom, String prenom, LocalDate datenaissance, Adresse adresse, Banque banque) {
			this.nom = nom;
			this.prenom = prenom;
			this.datenaissance = datenaissance;
			this.adresse = adresse;
			this.comptes = new HashSet<Compte>();
			this.banque = banque;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getNom() {
			return nom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}

		public String getPrenom() {
			return prenom;
		}

		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}

		public LocalDate getDatenaissance() {
			return datenaissance;
		}

		public void setDatenaissance(LocalDate datenaissance) {
			this.datenaissance = datenaissance;
		}

		public Banque getBanque() {
			return banque;
		}

		public void setBanque(Banque banque) {
			this.banque = banque;
		}

		public Adresse getAdresse() {
			return adresse;
		}

		public void setAdresse(Adresse adresse) {
			this.adresse = adresse;
		}

		public Set<Compte> getComptes() {
			return comptes;
		}

		public void setComptes(Set<Compte> comptes) {
			this.comptes = comptes;
		}
}
