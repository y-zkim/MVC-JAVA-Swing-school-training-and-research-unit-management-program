package Metier;

import java.util.ArrayList;

public class Niveau {
	
	    private int idNiveau ;
	    private String libelle ;
	    private Formation f;
	    private ArrayList<Module> lesModules;
	    
		public Niveau(int idNiveau, String libelle, Formation f, ArrayList<Module> lesModules) {
			super();
			this.idNiveau = idNiveau;
			this.libelle = libelle;
			this.f = f;
			this.lesModules = lesModules;
		}

		public void afficher() {
			System.out.println(this.toString());
	}
	    
}