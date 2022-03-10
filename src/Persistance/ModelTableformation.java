package Persistance;

import java.sql.Date;
import java.util.ArrayList;
import Metier.Doctorant;
import Metier.Formation;
import Metier.Professeur;

import javax.swing.table.AbstractTableModel;



public class ModelTableformation extends AbstractTableModel {
	
	private ArrayList<Formation> mesFormations;
	
	public ModelTableformation(ArrayList<Formation> mesFormations) {
		super();
		this.mesFormations = mesFormations;
		
		
	}
	
	@Override
	public Class getColumnClass(int columnIndex ) { //libelle, description, responsable, Modules
		switch(columnIndex) {
		case 0 : return String.class; 
		case 1 : return String.class; 
		case 2 : return Professeur.class;
		default : return Object.class;
		}
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return this.mesFormations.size();
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 3;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		Formation fr = mesFormations.get(rowIndex);
		switch(columnIndex)
		{
		case 0 : return fr.getLibelle();
		case 1 : return fr.getDescription();
		case 2 : return fr.getP().getNom().toString();
			default : return null;
		}
	}
	
	@Override
	public String getColumnName(int columnIndex ) {//libelle, description, responsable, Modules
		switch(columnIndex) {
		case 0 : return "Libelle";
		case 1 : return "Description";
		case 2 : return "Responsable";
		default : return null;
		}
	}
	
	public void supprimerEtudiant(int rowIndex) {
		mesFormations.remove(rowIndex);
		fireTableRowsDeleted(rowIndex, rowIndex);
	}
	
	public void ajouterEtudiant(Formation doctorant) {
		mesFormations.add(doctorant);
		fireTableRowsInserted(mesFormations.size(), mesFormations.size());
	}

}

