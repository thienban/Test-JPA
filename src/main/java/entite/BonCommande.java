package entite;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "bon")
public class BonCommande {
	@ManyToMany
	@JoinTable(name="compo",
	joinColumns=
	@JoinColumn(name="ID_BON", referencedColumnName="ID"),
	inverseJoinColumns=
	@JoinColumn(name="ID_ART", referencedColumnName="ID")
	)
	private Set<Article> articles;

	@Id
	private Integer id;
	@Column(name = "NUMERO", length = 30, nullable = false, unique = true)
	private Integer nunmero;
	@Column(name = "DATE_CMDE", length = 30, nullable = false)
	private LocalDate date_cmde;
	@Column(name = "DELAI", nullable = false)
	private Integer delai;
	@ManyToOne
	@JoinColumn(name = "ID_FOU")
	private Fournisseur fournisseur ;

	public BonCommande() {
		
	}

	public Set<Article> getArticles() {
		return articles;
	}

	public void setArticles(Set<Article> articles) {
		this.articles = articles;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNunmero() {
		return nunmero;
	}

	public void setNunmero(Integer nunmero) {
		this.nunmero = nunmero;
	}

	public LocalDate getDate_cmde() {
		return date_cmde;
	}

	public void setDate_cmde(LocalDate date_cmde) {
		this.date_cmde = date_cmde;
	}

	public Integer getDelai() {
		return delai;
	}

	public void setDelai(Integer delai) {
		this.delai = delai;
	}

	public Fournisseur getFournisseur() {
		return fournisseur;
	}

	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}

}
