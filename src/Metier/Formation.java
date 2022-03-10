package Metier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class Formation {
	private int idFormation ;
	private String libelle ;
	private String description ;
	private Professeur respoFormation;
		
	public Formation() {
		super();
		// TODO Auto-generated constructor stub
		respoFormation = new Professeur();
	}

	
	public Formation(int idFormation, String libelle, String description, Professeur respoFormation) {
		super();
		this.idFormation = idFormation;
		this.libelle = libelle;
		this.description = description;
		this.respoFormation = respoFormation;
	}

	

//	public Formation(int i, int j, String string, String string2) {
//		// TODO Auto-generated constructor stub
//		this.idFormation = i;
//		this.libelle = j;
//		this.description = string;
//		this.respoFormation = respoFormation.setNom(string2);
//	}


	public int getIdFormation() {
		return idFormation;
	}


	public void setIdFormation(int idFormation) {
		this.idFormation = idFormation;
	}


	public String getLibelle() {
		return libelle;
	}


	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Professeur getP() {
		return respoFormation;
	}


	public void setP(Professeur respoFormation) {
		this.respoFormation = respoFormation;
	}


	@Override
	public String toString() {
		return "Formation [idFormation=" + idFormation + ", libelle=" + libelle + ", description=" + description
				+ ", respoFormation=" + respoFormation + "]";
	}


	public void afficher() {
		System.out.println(this.toString());
	}
}
