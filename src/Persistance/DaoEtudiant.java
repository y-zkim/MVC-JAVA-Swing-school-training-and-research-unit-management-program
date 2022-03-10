package Persistance;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Metier.Etudiant;

public class DaoEtudiant implements InterfaceDaoTable<Etudiant> {
	
	Connection conn;
	
	public DaoEtudiant() {
		super();
		this.conn = Connexion.getConnexion();
		
	}

	@Override
	public boolean add(Etudiant etudiant) {
		try {
			PreparedStatement ps = conn.prepareStatement
					("insert into etudiant( nummerEtudiant, idNiveau, nom, email) values ( ?, ?, ?, ?)");
			ps.setInt(1, etudiant.getNummerEtudiant());
			ps.setInt(2, etudiant.getIdNiveau());
			ps.setString(3, etudiant.getNom());
			ps.setString(4, etudiant.getEmail());
			boolean rs = ps.execute();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete(Etudiant etudiant) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement ps = conn.prepareStatement
					("DELETE FROM etudiant WHERE Nom = ?");
			ps.setString(1, etudiant.getNom());
			boolean rs = ps.execute();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public Etudiant comparer( ResultSet resultSet ) throws SQLException {
	    Etudiant etudiant = new Etudiant();
	    etudiant.setNom( resultSet.getString( "nom" ) );

	    etudiant.setEmail( resultSet.getString( "email" ) );

	    return etudiant;
	}
	
	@Override
	public boolean isExiste(Etudiant etudiant) {
		// TODO Auto-generated method stub
		PreparedStatement preparedStmt;
		ResultSet rs = null;
			   try {
				preparedStmt = conn.prepareStatement("SELECT * FROM etudiant WHERE nom = ? AND email = ? ");
     			preparedStmt.setString (1, etudiant.getNom());
			    preparedStmt.setString(2, etudiant.getEmail());
			    rs = preparedStmt.executeQuery();

					if(rs.next())
					{
						System.out.println("il exiiiste !!");
						return true;
					}
					else {
						System.out.println("111");
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
	public Etudiant searchById(String id) {
		try {
			PreparedStatement ps = conn.prepareStatement
					("select * from etudiant where nummerEtudiant = ?");
			ps.setString(1, id);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				return (Etudiant) rs; 
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ArrayList<Etudiant> getAll() {
		ArrayList<Etudiant> etudiants = new ArrayList<Etudiant>();
		try {
			PreparedStatement ps = conn.prepareStatement
					("select * from etudiant");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Etudiant etudiant = new Etudiant();
				etudiant.setNummerEtudiant(rs.getInt("nummerEtudiant"));
				etudiant.setIdNiveau(rs.getInt("idNiveau"));
				etudiant.setNom(rs.getString("Nom"));
				etudiant.setEmail((rs.getString("email")));
				etudiants.add(etudiant);
			}
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return etudiants;
	}

	@Override
	public Boolean update(Etudiant etudiant) {
		try {
			PreparedStatement ps = conn.prepareStatement
					("UPDATE etudiant SET nummerEtudiant=? , idNiveau=? , nom=?, email=? WHERE Nom=?");
			
			ps.setInt(1, etudiant.getNummerEtudiant());
			ps.setInt(2, etudiant.getIdNiveau());
			ps.setString(3, etudiant.getNom());
			ps.setString(4, etudiant.getEmail());
	
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
