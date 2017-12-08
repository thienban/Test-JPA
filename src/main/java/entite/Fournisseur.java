package entite;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "fournisseur")
public class Fournisseur {
	@Id
	private Integer id;
	@Column(name = "NOM", length = 30, nullable = false, unique = true)
	private String nom;
	@OneToMany(mappedBy="fournisseur")
	private Set<BonCommande> bons;
	@OneToMany(mappedBy="fournisseur")
	private Set<Article> articles;
	
	public Fournisseur() {
		bons = new HashSet<BonCommande>();
		articles = new HashSet<Article>();
	}

}
