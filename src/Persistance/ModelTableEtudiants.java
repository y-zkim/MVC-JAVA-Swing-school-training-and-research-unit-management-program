package Persistance;

import java.sql.Date;
import java.util.ArrayList;
import Metier.Doctorant;
import Metier.Etudiant;
import Metier.Professeur;
import Metier.Module;

import javax.swing.table.AbstractTableModel;



public class ModelTableEtudiants extends AbstractTableModel {
	
	private ArrayList<Etudiant> mesEtudiants;
	
	public ModelTableEtudiants(ArrayList<Etudiant> mesEtudiants) {
		super();
		this.mesEtudiants = mesEtudiants;
	}
	
	@Override
	public Class getColumnClass(int columnIndex ) {
		switch(columnIndex) {

		
		case 0 : return Integer.class; //nummerEtudiant
		case 1 : return String.class; //nom
		case 2 : return String.class;  //email
		case 3 : return Integer.class; //idNiveau
		default : return Object.class;
		}
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return this.mesEtudiants.size();
		//return 0;
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		Etudiant d = mesEtudiants.get(rowIndex);
		switch(columnIndex)
		{
		case 0 : return d.getNummerEtudiant() ; //libellé
		case 1 : return d.getNom(); //coef
		case 2 : return d.getEmail();	  //h cours
		case 3 : return d.getIdNiveau(); //h td

			default : return null;
		}
	}
	
	@Override
	public String getColumnName(int columnIndex ) {
		switch(columnIndex) {
		case 0 : return "N° Etud" ; 
		case 1 : return "Nom"; 
		case 2 : return "Email";	
		case 3 : return "Niveau"; 
		default : return null;
		}
	}
	
	public void supprimerEtudiant(int rowIndex) {
		mesEtudiants.remove(rowIndex);
		fireTableRowsDeleted(rowIndex, rowIndex);
	}
	
	public void ajouterEtudiant(Etudiant etudiant) {
		mesEtudiants.add(etudiant);
		fireTableRowsInserted(mesEtudiants.size(), mesEtudiants.size());
	}

}

