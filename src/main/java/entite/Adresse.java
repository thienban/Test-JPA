package entite;

import javax.persistence.Embeddable;

@Embeddable
public class Adresse {
	
	private Integer numero;
	private String rue;
	private Integer codePostale;
	private String ville;

	public Adresse(int i, String string, int j, String string2) {
		this.numero = i;
		this.rue = string;
		this.codePostale = j;
		this.ville = string2;
	}
	
	public Adresse() {
		
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public Integer getCodePostale() {
		return codePostale;
	}
	public void setCodePostale(Integer codePostale) {
		this.codePostale = codePostale;
	}
	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}

}
