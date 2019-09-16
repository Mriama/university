package sn.afi.test;

import java.sql.Date;
import java.util.ArrayList;
import sn.afi.entity.Etudiant;
import sn.afi.services.IEtudiantImpl;

public class Test {

	public static void main(String args[]) {
		
		
/******************Tests Etudiant****************************/
		IEtudiantImpl eImpl = new IEtudiantImpl();
		
//Appel de la methode getListEtudiants()		
		/*ArrayList<Etudiant> etudiants = eImpl.getEtudiants();
		for(Etudiant e :etudiants) {
			System.out.println(e.getCode()+" "+e.getPrenom()+" "+e.getNom()+" "+e.getDateNaissance());
		}*/
		
//Appel de la methode getEtudiantByMat()
		
		/*Etudiant e = eImpl.getEtudiantByMat("diallo21");
		System.out.println(e.getPrenom()+" "+e.getNom());*/
		
//Appel methode addEtudiant() 
		
		/*Etudiant etudiant = new Etudiant("00009","Faky","Ndao",new Date(0));
		eImpl.addEtudiant(etudiant);*/
		
//Appel de la methode updateEtudiant()
		/*Etudiant etudiant = new Etudiant("00010","Faky","Beuleup",new Date(0));
		eImpl.updateEtudiant(etudiant,"00010");*/
		
//Appel de la methode delete
		/*Etudiant eDeleted = new Etudiant("diallo21");
		eImpl.deleteEtudiant(eDeleted);*/
		
		
/******************Fin Tests Etudiant****************************/
		
	}
	
	
}
