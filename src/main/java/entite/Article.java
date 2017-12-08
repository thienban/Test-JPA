package entite;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
	@Column(name = "ID_FOU", nullable = false)
	private Integer id_fou;
	public Article() {
	}

}
