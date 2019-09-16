package sn.afi.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

public class ConnexionDb {

	public static Connection getCnx(String db) {
		Connection cnx= null;
		try {
			//chargement du driver 
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("classe driver chargé avec succés");
	
			//etablir connexion
			cnx=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/" +db, "mariama", "diallo");
			System.out.println("connexion effectuée avec succés");
			
			
		}
		catch(SQLException se) {
			System.out.println("serveur de base de données injoignable : "+ se.getMessage());
		}
		catch(ClassNotFoundException cnfe) {
			System.out.println("classe driver introuvable");
		}
		return cnx;
	}
	
	public static void main(String[] args) 
	{
		ConnexionDb.getCnx("university");
	}
	
	public static void post(String db) throws Exception {
		final  String var1 = "2109M";
		final  String var2 = "mariama";
		final  String var3 = "diallo";
		try {
			Connection con = getCnx(db);
			PreparedStatement posted = con.prepareStatement("INSERT INTO Etudiant(matricule,prenom,nom,dateNiassance) VALUES ('"+var1+"','"+var2+"','"+var3+"')");
			System.out.println("pas inseré");
			posted.executeUpdate();
		}
		catch(Exception e) {
			System.out.println("insertion reussi"+ e.getMessage());
		}
		finally {
			System.out.println("insertion reussi");
		}
	}
}
