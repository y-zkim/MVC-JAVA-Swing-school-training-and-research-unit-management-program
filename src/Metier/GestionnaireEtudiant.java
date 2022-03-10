package Metier;
import Persistance.DaoEtudiant;


import java.util.ArrayList;


public class GestionnaireEtudiant {
    static DaoEtudiant etudiant;
    
    public GestionnaireEtudiant() {
        etudiant = new DaoEtudiant();
    }
    
	public static boolean delete(Etudiant table) {
		return etudiant.delete(table);
	}
	
	public static boolean add(Etudiant table)
	{
		return etudiant.add(table);
	}

	public static boolean isExist(Etudiant table) {
		return etudiant.isExiste(table);
	}

	public static Etudiant searchById(String o) {
		return (Etudiant) etudiant.searchById(o);
	}

	public static ArrayList<Etudiant> getAll() {
		return etudiant.getAll();
	}

	public static Boolean update(Etudiant table) {
		return etudiant.update(table);
	}
	
	
}
