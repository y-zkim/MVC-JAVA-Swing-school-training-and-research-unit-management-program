package Persistance;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Iterator;

import Metier.Doctorant;
import Metier.Soutenance;
import Metier.Professeur;

import javax.swing.table.AbstractTableModel;



public class ModelTableSoutenances extends AbstractTableModel {
	
	private ArrayList<Soutenance> mesSoutenances;
	
	public ModelTableSoutenances(ArrayList<Soutenance> mesSoutenances) {
		super();
		this.mesSoutenances = mesSoutenances;
		
		
	}
	
	@Override
	public Class getColumnClass(int columnIndex ) { //id_doc, nom_doc, jury, sujet_these, date_sout
		switch(columnIndex) {
		case 0 : return Integer.class;  //id_sout
		//case 1 : return String.class;   //
		case 1 : return String.class;   //nom_doc
		case 3 : return Professeur.class;   //jury
		case 4 : return Date.class;     //date_sout
		default : return Object.class;
		}
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return this.mesSoutenances.size();
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 4;
	}

	public String getJury(ArrayList<Professeur> jury) {
		Iterator<Professeur> it = jury.iterator();String s = null;
		while (it.hasNext()) {
			s = s + it.next().getNom()+" , ";
		}
		return s;
	}
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		Soutenance fr = mesSoutenances.get(rowIndex);
		switch(columnIndex)
		{
			case 0 : return fr.getIdSoutenance();
			case 1 : return fr.getDoc().getNom();
			case 2 : return getJury(fr.getJury());
			case 3 : return fr.getDateSoutenance();
			default : return null;
		}
	}
	
	@Override
	public String getColumnName(int columnIndex ) {//libelle, description, responsable, Modules
		switch(columnIndex) {
		case 0 : return "ID Soutenances";
		case 1 : return "Nom Doctorant";
		case 2 : return "Jury";
		case 3 : return "Date soutenance";
		default : return null;
		}
	}
	
	public void supprimerEtudiant(int rowIndex) {
		mesSoutenances.remove(rowIndex);
		fireTableRowsDeleted(rowIndex, rowIndex);
	}
	
	public void ajouterEtudiant(Soutenance doctorant) {
		mesSoutenances.add(doctorant);
		fireTableRowsInserted(mesSoutenances.size(), mesSoutenances.size());
	}

}

