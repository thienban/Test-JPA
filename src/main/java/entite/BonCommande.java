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

}
