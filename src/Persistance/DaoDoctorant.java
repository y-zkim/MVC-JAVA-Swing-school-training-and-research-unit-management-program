package Persistance;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Connection;

import Metier.Doctorant;
import Metier.Professeur;

public class DaoDoctorant  implements InterfaceDaoTable<Doctorant>{
	
	Connection conn;

	public DaoDoctorant() {
		super();
		this.conn = Connexion.getConnexion();
	}

	@Override
	public boolean add(Doctorant Doc) {
		try {
			PreparedStatement ps = conn.prepareStatement
					("insert into doctorant(idDoc,nummerEtudiant,idEncadrant,sujetThese,dateInscription) values ( ?, ?, ?, ?, ?)");
			ps.setInt(1, Doc.getIdDoc());
			ps.setInt(2,  Doc.getNummerEtudiant());
			ps.setInt(3, Doc.getEncadrant().getNummerSomme());
			ps.setString(4,  Doc.getSujetThese());
			ps.setDate(5, Doc.getDateInscription());
			boolean rs = ps.execute();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete(Doctorant Doc) {
		try {
			PreparedStatement ps = conn.prepareStatement
					("DELETE FROM doctorant WHERE idDoc = ?");
			ps.setInt(1,Doc.getIdDoc());
			boolean rs = ps.execute();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean isExiste(Doctorant Doc) {
		PreparedStatement preparedStmt;
		ResultSet rs = null;
			   try {
				preparedStmt = conn.prepareStatement("SELECT * FROM doctorant  WHERE idDoc = ?");
     			preparedStmt.setInt (1, Doc.getIdDoc());
		
			    rs = preparedStmt.executeQuery();
			 
					if(rs.next())
					{
						System.out.println("doctorant  exiiiste !!");
						return true;
					}
					else {
						System.out.println("doctorant  n'exiiiste pas !!");
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
	public Doctorant searchById(String id) {
		
		try {
			PreparedStatement ps = conn.prepareStatement
					("select * from doctorant where idDoc = ?");
			ps.setString(1, id);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				return (Doctorant) rs; 
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ArrayList<Doctorant> getAll() {
		ArrayList<Doctorant> Doctorant = new ArrayList<Doctorant>();
		try {
			PreparedStatement ps = conn.prepareStatement
					("select * from doctorant");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {

				Doctorant d = new Doctorant();
				Professeur p = new Professeur();
				d.setIdDoc(rs.getInt("idDoc"));
				d.setNummerEtudiant(rs.getInt("nummerEtudiant"));
				d.setDateInscription(rs.getDate("dateInscription"));
				d.setSujetThese(rs.getString("sujetThese"));
				d.getEncadrant().setNummerSomme(rs.getInt("idEncadrant"));;
				Doctorant.add(d);
			}
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return Doctorant;
	}

	@Override
	public Boolean update(Doctorant Doc) {
		try {
			PreparedStatement ps = conn.prepareStatement
					("UPDATE doctorant SET idDoc=? , nummerEtudiant=? , idEncadrant=?, sujetThese=? dateInscription=? WHERE idDoc = ?");
			
			ps.setInt(1, Doc.getIdDoc());
			ps.setInt(2, Doc.getNummerEtudiant());
			ps.setInt(3, Doc.getEncadrant().getNummerSomme());
			ps.setString(4, Doc.getSujetThese());
			ps.setDate(4, Doc.getDateInscription());
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
