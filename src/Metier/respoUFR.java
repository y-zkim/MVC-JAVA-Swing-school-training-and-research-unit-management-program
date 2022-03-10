package Metier;

public class respoUFR extends Professeur{
	
	private int idResspoUFR ;
	
	public respoUFR() {
		super();
	}

	public respoUFR(int idResspoUFR) {
		super();
		this.idResspoUFR = idResspoUFR;
	}

	public int getIdResspoUFR() {
		return idResspoUFR;
	}

	public void setIdResspoUFR(int idResspoUFR) {
		this.idResspoUFR = idResspoUFR;
	}

	@Override
	public String toString() {
		return "respoUFR [idResspoUFR=" + idResspoUFR + "]";
	}
	
		
	

}
