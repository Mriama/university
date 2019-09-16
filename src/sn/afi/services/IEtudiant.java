package sn.afi.services;

import java.util.ArrayList;
import sn.afi.entity.*;

public interface IEtudiant {
	public ArrayList<Etudiant> getEtudiants();
	public Etudiant getEtudiantByMat(String matricule);
	public void addEtudiant(Etudiant e);
	public void updateEtudiant(Etudiant e,String matricule);
	public void deleteEtudiant(Etudiant e);
	//public Arraylist<>
}
