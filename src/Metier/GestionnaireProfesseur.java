package Metier;

import Persistance.DaoProfesseur;

import java.util.ArrayList;


public class GestionnaireProfesseur {

    static DaoProfesseur professeur;
    
    public GestionnaireProfesseur() {
        professeur = new DaoProfesseur();
    }
    
	public static boolean delete(Professeur table) {
		return professeur.delete(table);
	}
	
	public static boolean add(Professeur table)
	{
		return professeur.add(table);
	}

	public static boolean isExist(Professeur table) {
		return professeur.isExiste(table);
	}

	public static Professeur searchById(String o) {
		return (Professeur) professeur.searchById(o);
	}

	public static ArrayList<Professeur> getAll() {
		return professeur.getAll();
	}

	public static Boolean update(Professeur table) {
		return professeur.update(table);
	}

}
