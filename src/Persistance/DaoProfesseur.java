package Persistance;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Metier.Formation;
import Metier.Professeur;

public class DaoProfesseur implements InterfaceDaoTable<Professeur> {
	
	
	Connection conn;
	
	
	public DaoProfesseur() {
		super();
		this.conn = Connexion.getConnexion();
	}

	@Override
	public boolean add(Professeur prof) {
		try {
			PreparedStatement ps = conn.prepareStatement
					("insert into professeur(nummerSomme,grade, nom,email\r\n" + 
							") values ( ?, ?, ?, ?)");
			ps.setInt(1, prof.getNummerSomme());
			ps.setString(2,  prof.getGrade());
			ps.setString(3, prof.getNom());
			ps.setString(4,  prof.getEmail());
			boolean rs = ps.execute();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete(Professeur  prof) {
		try {
			PreparedStatement ps = conn.prepareStatement
					("DELETE FROM professeur WHERE nummerSomme = ?");
			ps.setInt(1,prof.getNummerSomme());
			boolean rs = ps.execute();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean isExiste(Professeur  prof) {
		// TODO Auto-generated method stub
		PreparedStatement preparedStmt;
		ResultSet rs = null;
			   try {
				preparedStmt = conn.prepareStatement("SELECT * FROM professeur  WHERE nummerSomme= ?");
     			preparedStmt.setInt (1, prof.getNummerSomme());
		
			    rs = preparedStmt.executeQuery();
			 
					if(rs.next())
					{
						System.out.println("professeur  exiiiste !!");
						return true;
					}
					else {
						System.out.println("professeur  n'exiiiste pas !!");
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
	public Professeur searchById(String id) {
		try {
			PreparedStatement ps = conn.prepareStatement
					("select * from professeur where nummerSomme = ?");
			ps.setString(1, id);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				return (Professeur) rs; 
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ArrayList<Professeur> getAll() {
		ArrayList<Professeur> Professeur = new ArrayList<Professeur>();
		Professeur respoFormation = new Professeur();
		try {
			PreparedStatement ps = conn.prepareStatement
					("select * from professeur");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				
				Professeur p = new Professeur();
				p.setNummerSomme(rs.getInt("nummerSomme"));
				p.setEmail(rs.getString("email"));
				p.setGrade(rs.getString("grade"));
				p.setNom(rs.getString("nom"));
			
				Professeur.add(p);
			}
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return Professeur;
	}
	

	@Override
	public Boolean update(Professeur prof) {
		try {
			PreparedStatement ps = conn.prepareStatement
					
					("UPDATE personne SET nummerSomme=? , grade=? , nom=?, email=? WHERE idFormation = ?");
			
			ps.setInt(1, prof.getNummerSomme());
			ps.setString(2, prof.getGrade());
			ps.setString(3, prof.getNom());
			ps.setString(2, prof.getEmail());
			
	
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	

}
