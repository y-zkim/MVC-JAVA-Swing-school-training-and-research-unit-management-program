package Metier;

import Persistance.DaoFormation;

import java.util.ArrayList;


public class GestionnaireFormation {
    static DaoFormation formation;
    
    public GestionnaireFormation() {
        formation = new DaoFormation();
    }
    
	public static boolean delete(Formation table) {
		return formation.delete(table);
	}
	
	public static boolean add(Formation table)
	{
		return formation.add(table);
	}

	public static boolean isExist(Formation table) {
		return formation.isExiste(table);
	}

	public static Formation searchById(String o) {
		return (Formation) formation.searchById(o);
	}

	public static ArrayList<Formation> getAll() {
		return formation.getAll();
	}

	public static Boolean update(Formation table) {
		return formation.update(table);
	}
	
	
}
