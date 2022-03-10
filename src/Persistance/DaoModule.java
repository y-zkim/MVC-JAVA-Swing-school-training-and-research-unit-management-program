package Persistance;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Metier.Formation;
import Metier.Module;
import Metier.Professeur;

public class DaoModule  implements InterfaceDaoTable<Module>{
	
	Connection conn;
	
	

	public DaoModule() {
		super();
		this.conn = Connexion.getConnexion();
	}

	@Override
	public boolean add(Module mod) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Module mod) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isExiste(Module mod) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Module searchById(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ArrayList<Module> getAll() {
		ArrayList<Module> modules = new ArrayList<Module>();
		Professeur p = new Professeur();
		try {
			PreparedStatement ps = conn.prepareStatement
					("select * from module");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Module m = new Module();
				m.setIdModule(rs.getInt("idModule"));
				m.setIdSemestre(rs.getString("idSemestre"));
				m.getRespoModule().setNummerSomme(rs.getInt("idProf"));
				m.setIdNiveau(rs.getInt("idNiveau"));
				m.setLibelle(rs.getString("libelle"));
				m.setNhCours(rs.getInt("nhCours"));
				m.setNhTD(rs.getInt("nhTD"));
				m.setNhTP(rs.getInt("nhTP"));
				m.setCoeff(rs.getInt("coeff"));
				
				modules.add(m);
			}
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return modules;
	}

	@Override
	public Boolean update(Module mod) {
		// TODO Auto-generated method stub
		return null;
	}

}
