package Metier;

import java.io.Serializable;

public class Module {
	private int idModule;
	private String idSemestre;
	private String libelle;
	private int idNiveau;
	private int nhCours;
	private int nhTD;
	private int nhTP;
	private int coeff;
	private Professeur respoModule;

	public Module() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Module(int idModule, String idSemestre, String libelle, int idNiveau, int nhCours, int nhTD, int nhTP,
			int coeff, Professeur respoModule) {
		super();
		this.idModule = idModule;
		this.idSemestre = idSemestre;
		this.libelle = libelle;
		this.idNiveau = idNiveau;
		this.nhCours = nhCours;
		this.nhTD = nhTD;
		this.nhTP = nhTP;
		this.coeff = coeff;
		this.respoModule = respoModule;
	}



	public int getIdModule() {
		return idModule;
	}



	public void setIdModule(int idModule) {
		this.idModule = idModule;
	}



	public String getIdSemestre() {
		return idSemestre;
	}



	public void setIdSemestre(String idSemestre) {
		this.idSemestre = idSemestre;
	}



	public String getLibelle() {
		return libelle;
	}



	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}



	public int getIdNiveau() {
		return idNiveau;
	}



	public void setIdNiveau(int idNiveau) {
		this.idNiveau = idNiveau;
	}



	public int getNhCours() {
		return nhCours;
	}



	public void setNhCours(int nhCours) {
		this.nhCours = nhCours;
	}



	public int getNhTD() {
		return nhTD;
	}



	public void setNhTD(int nhTD) {
		this.nhTD = nhTD;
	}



	public int getNhTP() {
		return nhTP;
	}



	public void setNhTP(int nhTP) {
		this.nhTP = nhTP;
	}



	public int getCoeff() {
		return coeff;
	}



	public void setCoeff(int coeff) {
		this.coeff = coeff;
	}



	public Professeur getRespoModule() {
		return respoModule;
	}



	public void setRespoModule(Professeur respoModule) {
		this.respoModule = respoModule;
	}



	@Override
	public String toString() {
		return "Module [idModule=" + idModule + ", idSemestre=" + idSemestre + ", libelle=" + libelle + ", idNiveau="
				+ idNiveau + ", nhCours=" + nhCours + ", nhTD=" + nhTD + ", nhTP=" + nhTP + ", coeff=" + coeff
				+ ", respoModule=" + respoModule + "]";
	}



	public void afficher() {
		System.out.println(this.toString());
	}

//	public double getChargeHoraireModule() {
//	return  this.getNbrHeuresCours()*0.5 + this.getNbrHeuresTD() + this.getNbrHeuresTP()*0.75;
//	
//	}
//	public Module getModuleById(String label) {
//		Module module = null;
//		if (this.libellé==label) {
//			return module;
//		}else {
//			return null;
//		}
//	}

}
