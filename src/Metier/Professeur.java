package Metier;
import java.util.ArrayList;
import java.util.HashMap;

//implements Enseignent
public class Professeur {
    private int nummerSomme ;
    private String grade ;
    private String nom ;
    private String email;
    private ArrayList<Module> modules;
	
	public Professeur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Professeur(int nummerSomme, String grade, String nom, String email, ArrayList<Module> modules) {
		super();
		this.nummerSomme = nummerSomme;
		this.grade = grade;
		this.nom = nom;
		this.email = email;
		this.modules = modules;
	}



	public Professeur(String string, String text) {
		// TODO Auto-generated constructor stub
		this.nom = string;
		this.email = text;
	}

	public int getNummerSomme() {
		return nummerSomme;
	}

	public void setNummerSomme(int nummerSomme) {
		this.nummerSomme = nummerSomme;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
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

	public ArrayList<Module> getModules() {
		return modules;
	}

	public void setModules(ArrayList<Module> modules) {
		this.modules = modules;
	}
	
	@Override
	public String toString() {
		return "Professeur [nummerSomme=" + nummerSomme + ", grade=" + grade + ", nom=" + nom + ", email=" + email
				+ ", modules=" + modules + "]";
	}

	public void afficher() {
		System.out.println(this.toString());
	}
	
//	public boolean addChargeHoraire(String Date, ArrayList<Module> charge) {
//		if(this.chargeHoraire.containsKey(Date)) return false;
//		this.chargeHoraire.put(Date, charge);
//		return true;
//	}
//	public boolean updateChargeHoraire(String date, ArrayList<Module> charge) {
//		if(!this.chargeHoraire.containsKey(date)) {
//			return false;
//		}
//		this.chargeHoraire.put(date, charge);
//		return true;
//	}
//	public double getChargeAnuelle(String année) {
//		double charge = 0;
//		for( int j = 0; j < this.chargeHoraire.get(année).size(); j ++) {
//				charge = charge + this.chargeHoraire.get(année).get(j).getChargeHoraireModule();
//			}
//		return charge;
//	}
//	
//	public Double getVacationsAnulle(String année) {
//		double somme = 0;
//		int charge ;
//		if(this.grade.equals("PA")) {
//			charge = 320;
//		}
//		else {
//			if(this.grade.equals("PH")){
//				charge = 300;;
//			}
//			else {
//				charge = 280;
//			}
//		}
//		if(this.getChargeAnuelle(année) > charge ) {
//			somme = 32*400*0.66 + (this.getChargeHoraire() - charge ) *600*0.83;
//		}
//		else {
//			somme = this.getChargeHoraire()*400*0.66;
//		}
//		return somme +5000;
//	}
//	
//	@Override
//	public Double getChargeHoraire() {
//		double charge = 0;
//		ArrayList<ArrayList<Module>> list = new ArrayList<>( this.chargeHoraire.values());
//		for(int i = 0; i < list.size(); i ++) {
//			for( int j = 0; j < list.get(i).size(); j++) {
//				charge = charge + list.get(i).get(j).getChargeHoraireModule();
//			}
//		}
//		return charge;
//	}
//	@Override
//	public Double getVacations() {
//		double somme = 0;
//		int charge ;
//		if(this.grade.equals("PA")) {
//			charge = 320;
//		}
//		else {
//			if(this.grade.equals("PH")){
//				charge = 300;;
//			}
//			else {
//				charge = 280;
//			}
//		}
//		if(this.getChargeHoraire() > charge ) {
//			somme = 32*400*0.66 + (this.getChargeHoraire() - charge ) *600*0.83;
//		}
//		else {
//			somme = this.getChargeHoraire()*400*0.66;
//		}
//		return somme +5000*this.chargeHoraire.size();
//	}
//	public Professeur getProf(String name) {
//		
//		if (this.getNom()==name) {
//			return this;
//		}
//		else {
//			return null;
//		}
//	}
}
