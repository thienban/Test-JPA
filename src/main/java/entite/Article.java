package entite;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="article")
public class Article {
	@Id
	private Integer id;
	@Column(name = "REF", length = 30, nullable = false, unique = true)
	private String ref;
	@Column(name = "DESIGNATION", length = 30, nullable = false)
	private String designation;
	@Column(name = "Prix", nullable = false)
	private float prix;
	
	@ManyToOne
	@JoinColumn(name = "ID_FOU")
	private Fournisseur fournisseur ;
	
	public Article() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	public Fournisseur getFournisseur() {
		return fournisseur;
	}

	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}

}
