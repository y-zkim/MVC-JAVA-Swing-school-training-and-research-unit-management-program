package Metier;

import java.util.ArrayList;

public class Etudiant {
	private Integer nummerEtudiant;
	private Integer idNiveau;
	private String nom;
	private String email;
	
	public Etudiant() {
		super();
	}

	public Etudiant(String nom, String email) {
		super();
		this.nom = nom;
		this.email = email;
	}
	
	public Etudiant(Integer nummerEtudiant, Integer idNiveau, String nom, String email) {
		super();
		this.nummerEtudiant = nummerEtudiant;
		this.idNiveau = idNiveau;
		this.nom = nom;
		this.email = email;
	}

	public Integer getNummerEtudiant() {
		return nummerEtudiant;
	}

	public void setNummerEtudiant(Integer nummerEtudiant) {
		this.nummerEtudiant = nummerEtudiant;
	}

	public Integer getIdNiveau() {
		return idNiveau;
	}

	public void setIdNiveau(Integer idNiveau) {
		this.idNiveau = idNiveau;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Etudiant [nummerEtudiant=" + nummerEtudiant + ", idNiveau=" + idNiveau + ", nom=" + nom + ", email="
				+ email + "]";
	}
	
	public void afficher() {
		System.out.println(this.toString());
	}

//	public boolean addModule(Module module) {
//		UniteEnseignement U = new UniteEnseignement();
//		int semestre = module.getSemestre();
//		if (semestre > 0)
//			semestre--;
//
//		for (int i = 0; i < this.modules.size(); i++) {
//			if (modules.get(i).getModule().getSemestre() == semestre) {
//				if (!modules.get(i).isValide()) {
//					return false;
//				}
//			}
//		}
//		U.setModule(module);
//		modules.add(U);
//		return true;
//	}

}
