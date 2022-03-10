	package Persistance;

import java.sql.Date;
import java.util.ArrayList;
import Metier.Doctorant;
import Metier.Professeur;
import Metier.Module;

import javax.swing.table.AbstractTableModel;



public class ModelTableModules extends AbstractTableModel {
	
	private ArrayList<Module> mesModules;
	
	public ModelTableModules(ArrayList<Module> mesModules) {
		super();
		this.mesModules = mesModules;
	}
	
	@Override
	public Class getColumnClass(int columnIndex ) {
		switch(columnIndex) {

		
		case 0 : return String.class; //libellé
		case 1 : return Integer.class; //coef
		case 2 : return Integer.class;	  //h cours
		case 3 : return Integer.class; //h td
		case 4 : return Integer.class; //h tp
		case 5 : return Professeur.class; // prof
		case 6 : return Integer.class; // semestre
		default : return Object.class;
		}
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return this.mesModules.size();
		//return 0;
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 7;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		Module d = mesModules.get(rowIndex);
		switch(columnIndex)
		{
		case 0 : return d.getLibelle(); 			 //libellé
		case 1 : return d.getCoeff(); 				 //coef
		case 2 : return d.getNhCours();	  			 //h cours
		case 3 : return d.getNhTD(); 				 //h td
		case 4 : return d.getNhTP();                 //h tp
		case 5 : return d.getRespoModule().getNom(); // prof
		case 6 : return d.getIdSemestre(); 			 // semestre
			default : return null;
		}
	}
	
	@Override
	public String getColumnName(int columnIndex ) {
		switch(columnIndex) {
		case 0 : return "Libellé" ; //libellé
		case 1 : return "Coefficient"; //coef
		case 2 : return "Nb Heure Cours";	  //h cours
		case 3 : return "Nb Heure TD"; //h td
		case 4 : return "Nb Heure TP"; //h tp
		case 5 : return "Professeur du module"; // prof
		case 6 : return "Semestre"; // semestre
		default : return null;
		}
	}
	
	public void supprimerEtudiant(int rowIndex) {
		mesModules.remove(rowIndex);
		fireTableRowsDeleted(rowIndex, rowIndex);
	}
	
	public void ajouterEtudiant(Module module) {
		mesModules.add(module);
		fireTableRowsInserted(mesModules.size(), mesModules.size());
	}

}

