package entite;

import java.time.LocalDate;

import javax.persistence.Entity;

@Entity
public class AssuranceVie extends Compte{

	public AssuranceVie(String string, double d) {
		super(string, d);
		// TODO Auto-generated constructor stub
	}
	private double taux;
	private LocalDate dateFin;
}
