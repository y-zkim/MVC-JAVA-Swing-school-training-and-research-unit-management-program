package Metier;

import java.util.ArrayList;
import java.util.Arrays;

public class Semestre {

    private String idSemestre ;
    private ArrayList<Module> modules;


	public Semestre() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Semestre(String idSemestre) {
		super();
		this.idSemestre = idSemestre;
	}


	public String getIdSemestre() {
		return idSemestre;
	}


	public void setIdSemestre(String idSemestre) {
		this.idSemestre = idSemestre;
	}


	@Override
	public String toString() {
		return "Semestre [idSemestre=" + idSemestre + "]";
	}

	public void afficher() {
		System.out.println(this.toString());
}

	
//	public void afficher() {
//		
//		for(Module M: modules) {
//			System.out.println(M.toString());
//		}
//	
//	}

//	public double getChargeHoraireSemestre() {
//		double CH=0;
//		for(Module M: modules) {
//			CH+=M.getChargeHoraireModule();
//		}
//		return CH;
//	}


}
