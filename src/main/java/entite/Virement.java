package entite;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("V")
public class Virement extends Operation{

	private String Beneficiare;

	public String getBeneficiare() {
		return Beneficiare;
	}

	public void setBeneficiare(String beneficiare) {
		Beneficiare = beneficiare;
	} 
}
