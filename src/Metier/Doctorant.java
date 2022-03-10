package Metier;

import java.sql.Date;
import java.util.ArrayList;

public class Doctorant extends Etudiant  {

	private int idDoc;
	private Professeur encadrant;
	private String sujetThese;
	private Date dateInscription;

	public Doctorant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Doctorant(int idDoc, Professeur encadrant, String sujetThese, Date dateInscription) {
		super();
		this.idDoc = idDoc;
		this.encadrant = encadrant;
		this.sujetThese = sujetThese;
		this.dateInscription = dateInscription;
	}

	public int getIdDoc() {
		return idDoc;
	}

	public void setIdDoc(int idDoc) {
		this.idDoc = idDoc;
	}

	public Professeur getEncadrant() {
		return encadrant;
	}

	public void setEncadrant(Professeur encadrant) {
		this.encadrant = encadrant;
	}

	public String getSujetThese() {
		return sujetThese;
	}

	public void setSujetThese(String sujetThese) {
		this.sujetThese = sujetThese;
	}

	public Date getDateInscription() {
		return dateInscription;
	}

	public void setDateInscription(Date dateInscription) {
		this.dateInscription = dateInscription;
	}

	@Override
	public String toString() {
		return "Doctorant [idDoc=" + idDoc + ", encadrant=" + encadrant + ", sujetThese=" + sujetThese
				+ ", dateInscription=" + dateInscription + "]";
	}

	public void afficher() {
		System.out.println(this.toString());
	}

//	@Override
//	public Double getChargeHoraire() {
//		double charge = 0;
//		ArrayList<ArrayList<Module>> list = new ArrayList<>(this.chargeHoraire.values());
//		for (int i = 0; i < list.size(); i++) {
//			for (int j = 0; j < list.get(i).size(); j++) {
//				charge = charge + list.get(i).get(j).getChargeHoraireModule();
//			}
//		}
//		return charge;
//	}
//
//	public double getChargeAnuelle(String année) {
//		if (Integer.parseInt(année) > Integer.parseInt(DateInscription)) {
//			double charge = 0;
//			for (int j = 0; j < this.chargeHoraire.get(année).size(); j++) {
//				charge = charge + this.chargeHoraire.get(année).get(j).getChargeHoraireModule();
//			}
//			return charge;
//		} else {
//			return 0;
//		}
//	}
//
//	
//	@Override
//	public Double getVacations() {
//		double somme = 0;
//		int charge = 32;
//		if (this.getChargeHoraire() > charge) {
//			somme = 32 * 400 * 0.66 + (this.getChargeHoraire() - charge) * 600 * 0.83;
//		} else {
//			somme = this.getChargeHoraire() * 400 * 0.66;
//		}
//		return somme;
//	}
//
//	public double getVacationsAnulle(String année) {
//		if (Integer.parseInt(année) > Integer.parseInt(DateInscription)) {
//			double somme = 0;
//			int charge = 32;
//
//			if (this.getChargeAnuelle(année) > charge) {
//				somme = 32 * 400 * 0.66 + (this.getChargeHoraire() - charge) * 600 * 0.83;
//			} else {
//				somme = this.getChargeHoraire() * 400 * 0.66;
//			}
//			return somme;
//		} else
//			return 0;
//
//	}
//
//	public boolean addChargeHoraire(String Date, ArrayList<Module> charge) {
//		if (this.chargeHoraire.containsKey(Date))
//			return false;
//		this.chargeHoraire.put(Date, charge);
//		return true;
//	}
//
//	public boolean updateChargeHoraire(String date, ArrayList<Module> charge) {
//		if (!this.chargeHoraire.containsKey(date)) {
//			return false;
//		}
//		this.chargeHoraire.put(date, charge);
//		return true;
//	}

}
