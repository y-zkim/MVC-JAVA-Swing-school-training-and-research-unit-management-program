package Presentation;

import java.util.ArrayList;

import Metier.*;
import Metier.Module;
import Persistance.DaoEtudiant;

public class Controleur {
	private ArrayList<Etudiant> etudiants;
	private ArrayList<Professeur> professeurs;
	private ArrayList<Formation> formations;
	private ArrayList<Doctorant> doctorants;
	private ArrayList<Professeur> encadrants;
	private ArrayList<Soutenance> soutenances;
	private ArrayList<Module> modules;
	
	private Login login;
	private HomeWindow homeUFR;
	private FenetreEtudiants fenEtud;
	private FenetreFormations fenForm;
	private FenetreDoctorant fenDoc;
	private FenetreModules fenMod;
	private FenetreSoutenances fenSout;

	public Controleur() {
		super();
		// TODO Auto-generated constructor stub
		this.etudiants = etudiants;
		login = new Login();
		login.c = this;
		login.setVisible(true);
	}

//	public void supprimerEtudiant(int rowIndex) {
//		etudiants.remove(rowIndex);
//		listeEtudiant.etudiants.fireTableDataChanged();
//	}
	
	public void lancerHomeUFR() {
		login.setVisible(false);
		homeUFR =  new HomeWindow();
		homeUFR.c = this;
		homeUFR.setVisible(true);
	}

//	public void ajouterEtudiant(Etudiant etudAjouter) {
//		// TODO Auto-generated method stub
//		etudiants.add(etudAjouter);
//		listeEtudiant.setVisible(true);
//		listeEtudiant.etudiants.fireTableDataChanged();
//		
//	}

	public void etudCompte(Etudiant etudiant) {
		// TODO Auto-generated method stub
		GestionnaireEtudiant gest = new GestionnaireEtudiant();
		//DaoEtudiant e = new DaoEtudiant();
		if ((gest.isExist(etudiant)) == true) {
			System.out.println("yeeeeees");
			this.lancerHomeUFR();
		}
		else {
			System.out.println("Not Connected");
		}
	}
	
	public void profCompte(Professeur prof) {
		// TODO Auto-generated method stub
		GestionnaireProfesseur gest = new GestionnaireProfesseur();
		if ((gest.isExist(prof)) == true) {
			System.out.println("yeeeeees");
			this.lancerHomeUFR();
		}
		else {
			System.out.println("Not Connected");
		}
	}
	
	public void ufrCompte(Professeur prof) {
		// TODO Auto-generated method stub
		GestionnaireProfesseur gest = new GestionnaireProfesseur();
		if ((gest.isExist(prof)) == true) {
			System.out.println("Connected");
			this.lancerHomeUFR();
		}
		else {
			System.out.println("Not Connected");
		}
	}

//	public void lancerFenForm() {
//		// TODO Auto-generated method stub
//		homeUFR.setVisible(false);
//		fenForm =  new FenetreFormations();
//		homeUFR.c = this;
//		homeUFR.setVisible(true);
//		
//	}

	public void lancerFenMod() {
		
	}
	public void supprimerModule(int row) {
		// TODO Auto-generated method stub
		modules.remove(row);
		fenMod.mods.fireTableDataChanged();
	}
	
//	public void etudCompte(Etudiant etudiant) {
//		// TODO Auto-generated method stub
//		GestionnaireEtudiant gest = new GestionnaireEtudiant();
//		//DaoEtudiant e = new DaoEtudiant();
//		if ((gest.isExist(etudiant)) == true) {
//			System.out.println("yeeeeees");
//			this.lancerHomeUFR();
//		}
//		else {
//			System.out.println("Not Connected");
//		}
//		//gest.isExist
//	}
}
