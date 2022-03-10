package Persistance;

import java.sql.Date;
import java.util.ArrayList;
import Metier.Doctorant;

import javax.swing.table.AbstractTableModel;



public class ModelTable extends AbstractTableModel {
	
	private ArrayList<Doctorant> mesDoctorants;
	
	public ModelTable(ArrayList<Doctorant> mesDoctorant) {
		super();
		this.mesDoctorants = mesDoctorant;
	}
	
	@Override
	public Class getColumnClass(int columnIndex ) {
		switch(columnIndex) {
		case 0 : return String.class; //nom
		case 1 : return String.class; //email
		case 2 : return Date.class;	  //date_inscription
		case 3 : return String.class; //encadrant
		case 4 : return String.class; //sujet de thèse
		default : return Object.class;
		}
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		//return this.mesDoctorants.size();
		return 0;
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		Doctorant d = mesDoctorants.get(rowIndex);
		switch(columnIndex)
		{
			case 0 : return d.getNom();
			case 1 : return d.getEmail();
			case 2 : return d.getDateInscription();
			//case 3 : return d.getProfesseur(columnIndex).toString();
			case 4 : return d.getSujetThese();
			default : return null;
		}
	}
	
	@Override
	public String getColumnName(int columnIndex ) {
		switch(columnIndex) {
		case 0 : return "Nom";
		case 1 : return "Email";
		case 2 : return "Date d'inscription";
		//case 3 : return "Professeur encadrant";
		case 3 : return "Sujet de thèse";
		default : return null;
		}
	}
	
	public void supprimerEtudiant(int rowIndex) {
		mesDoctorants.remove(rowIndex);
		fireTableRowsDeleted(rowIndex, rowIndex);
	}
	
	public void ajouterEtudiant(Doctorant doctorant) {
		mesDoctorants.add(doctorant);
		fireTableRowsInserted(mesDoctorants.size(), mesDoctorants.size());
	}

}

