package Persistance;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Metier.*;

public class DaoFormation implements InterfaceDaoTable<Formation> {

	Connection conn;

	public DaoFormation() {
		super();
		this.conn = Connexion.getConnexion();
	}

	@Override
	public boolean add(Formation formation) {
		try {
			PreparedStatement ps = conn.prepareStatement(
					"insert into formation(idFormation,idRespoFormation, libelle,description) values ( ?, ?, ?, ?)");
			ps.setInt(1, formation.getIdFormation());
			ps.setInt(2, formation.getP().getNummerSomme());
			ps.setString(3, formation.getLibelle());
			ps.setString(4, formation.getDescription());
			boolean rs = ps.execute();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete(Formation formation) {
		try {
			PreparedStatement ps = conn.prepareStatement("DELETE FROM formation WHERE idFormation = ?");
			ps.setInt(1, formation.getIdFormation());
			boolean rs = ps.execute();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean isExiste(Formation formation) {
		// TODO Auto-generated method stub
		PreparedStatement preparedStmt;
		ResultSet rs = null;
		try {
			preparedStmt = conn.prepareStatement("SELECT * FROM formation WHERE idFormation= ?");
			preparedStmt.setInt(1, formation.getIdFormation());

			rs = preparedStmt.executeQuery();

			if (rs.next()) {
				System.out.println("formation  exiiiste !!");
				return true;
			} else {
				System.out.println("formation  n'exiiiste pas !!");
				return false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("il exiiiste PAAS!!");
		return false;
	}

	@Override
	public Formation searchById(String id) {
		try {
			PreparedStatement ps = conn.prepareStatement("select * from formation where idFormation = ?");
			ps.setString(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				return (Formation) rs;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ArrayList<Formation> getAll() {
		ArrayList<Formation> formations = new ArrayList<Formation>();
		Professeur respoFormation = new Professeur();
		try {
			PreparedStatement ps = conn.prepareStatement("select * from formation");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Formation f = new Formation();
				f.setIdFormation(rs.getInt("IdFormation"));
				f.setDescription(rs.getString("description"));
				f.setLibelle(rs.getString("libelle"));
				f.getP().setNummerSomme(rs.getInt("idRespoFormation"));
				formations.add(f);
			}
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return formations;
	}

	@Override
	public Boolean update(Formation formation) {
		try {
			PreparedStatement ps = conn.prepareStatement

			("UPDATE formation SET idFormation=? , idRespoFormation=? , libelle=?, description=? WHERE idFormation = ?");

			ps.setInt(1, formation.getIdFormation());
			ps.setInt(2, formation.getP().getNummerSomme());
			ps.setString(3, formation.getLibelle());
			ps.setString(2, formation.getDescription());

			ps.execute();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
