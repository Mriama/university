package sn.afi.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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
}
