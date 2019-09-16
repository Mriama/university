package sn.afi.services;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import sn.afi.db.ConnexionDb;
import sn.afi.entity.Etudiant;

public class IEtudiantImpl implements IEtudiant{
	private Connection cnx ;
	

	public IEtudiantImpl() {
		cnx = ConnexionDb.getCnx("university");
		// TODO Auto-generated constructor stub
	}

	@Override
	public ArrayList<Etudiant> getEtudiants() {
		// TODO Auto-generated method stub
		List<Etudiant> etudiants = new ArrayList<Etudiant>();
		String listQuery = "Select * from etudiant";
		
		try {
			
			PreparedStatement listEtudiantsStatement = cnx.prepareStatement(listQuery);
			ResultSet rs = listEtudiantsStatement.executeQuery();
			while(rs.next()) {
				Etudiant e = new Etudiant();
				e.setCode(rs.getNString("matricule"));
				e.setPrenom(rs.getNString("prenom"));
				e.setNom(rs.getNString("nom"));
				e.setDateNaissance(rs.getDate("date_naissance"));
				
				etudiants.add(e);
			};
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Aucune donnée n'a étè retrouvé");
			e.printStackTrace();
		}
		return (ArrayList<Etudiant>) etudiants;
	}
	

	@Override
	public Etudiant getEtudiantByMat(String matricule) {
		Etudiant etudiant = new Etudiant();
		String Query = "Select * from etudiant where matricule=?";
		
		try {
			PreparedStatement etudiantStatement = cnx.prepareStatement(Query);
			etudiantStatement.setNString(1,matricule);
			ResultSet rs = etudiantStatement.executeQuery();
			while(rs.next()) {
				etudiant.setCode(rs.getNString("matricule"));
				etudiant.setPrenom(rs.getNString("prenom"));
				etudiant.setNom(rs.getNString("nom"));
				etudiant.setDateNaissance(rs.getDate("date_naissance"));
			};
			etudiantStatement.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Aucune donnée n'a étè retrouvé");
			e.printStackTrace();
		}
		return (Etudiant) etudiant;
	}

	@Override
	public void addEtudiant(Etudiant e) {
		// TODO Auto-generated method stu		
		String query = "INSERT INTO etudiant(matricule,prenom,nom,date_naissance) VALUES (?,?,?,?)";
		try {
			PreparedStatement etudiantStatement = cnx.prepareStatement(query);
			etudiantStatement.setString(1, e.getCode());
			etudiantStatement.setString(2, e.getPrenom());
			etudiantStatement.setString(3, e.getNom());
			etudiantStatement.setDate(4,(Date) e.getDateNaissance());
			
			etudiantStatement.executeUpdate();
			System.out.println("Insertion réussie");
			etudiantStatement.close();
			
		} catch (SQLException exception) {
			// TODO Auto-generated catch block
			System.out.println("Aucune donnée n'a étè retrouvé");
			exception.printStackTrace();
		}
	}

	@Override
	public void updateEtudiant(Etudiant e, String matricule) {
		// TODO Auto-generated method stu	
		String query = "UPDATE etudiant SET matricule=?, nom=?, prenom=?, date_naissance=? where matricule=?";
		try {
			Etudiant updated = this.getEtudiantByMat(matricule);
			PreparedStatement updateStatement = cnx.prepareStatement(query);
			updateStatement.setString(1, e.getCode());
			updateStatement.setString(2, e.getPrenom());
			updateStatement.setString(3, e.getNom());
			updateStatement.setDate(4,(Date) e.getDateNaissance());
			updateStatement.setString(5, updated.getCode());
			
			updateStatement.executeUpdate();
			System.out.println("Update réussie");
			updateStatement.close();
			
		} catch (SQLException exception) {
			// TODO Auto-generated catch block
			System.out.println("Aucune donnée n'a mise à jour");
			exception.printStackTrace();
		}
		
		
	}

	@Override
	public void deleteEtudiant(Etudiant e) {
		// TODO Auto-generated method stub
		String query = "DELETE from etudiant where matricule=?";
			Etudiant deleted = this.getEtudiantByMat(e.getCode());
			try {
				PreparedStatement deleteStatement = cnx.prepareStatement(query);
				deleteStatement.setString(1, deleted.getCode());
				System.out.println("Suppression effectuée");
				deleteStatement.executeUpdate();
				deleteStatement.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
			

		
	}

}
