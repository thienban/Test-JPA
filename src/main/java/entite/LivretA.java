package entite;

import javax.persistence.Entity;

@Entity
public class LivretA extends Compte{
	public LivretA(String string, double d) {
		super(string, d);
		// TODO Auto-generated constructor stub
	}

	private double taux;

	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}

}
