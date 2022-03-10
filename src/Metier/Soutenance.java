package Metier;

import java.util.ArrayList;
import java.util.Date;

public class Soutenance {
	private int idSoutenance;
	private Doctorant doc;
	private ArrayList<Professeur> jury;
	private Date dateSoutenance;

	public Soutenance() {
		// TODO Auto-generated constructor stub
		jury = new ArrayList<Professeur>(3);
	}

	public Soutenance(int idSoutenance, Doctorant doc, ArrayList<Professeur> jury, Date dateSoutenance) {
		super();
		this.idSoutenance = idSoutenance;
		this.doc = doc;
		this.jury = jury;
		this.dateSoutenance = dateSoutenance;
	}

	public int getIdSoutenance() {
		return idSoutenance;
	}

	public void setIdSoutenance(int idSoutenance) {
		this.idSoutenance = idSoutenance;
	}

	public Doctorant getDoc() {
		return doc;
	}

	public void setDoc(Doctorant doc) {
		this.doc = doc;
	}

	public ArrayList<Professeur> getJury() {
		return jury;
	}

	public void setJury(ArrayList<Professeur> jury) {
		this.jury = jury;
	}

	public Date getDateSoutenance() {
		return dateSoutenance;
	}

	public void setDateSoutenance(Date dateSoutenance) {
		this.dateSoutenance = dateSoutenance;
	}

	@Override
	public String toString() {
		return "Soutenance [idSoutenance=" + idSoutenance + ", doc=" + doc + ", jury=" + jury + ", dateSoutenance="
				+ dateSoutenance + "]";
	}

	
}
