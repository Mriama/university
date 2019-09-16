package sn.afi.entity;

import java.util.Date;
import java.util.List;

public class Etudiant extends User{
	
	
	public Etudiant(String code, String prenom, String nom, Date dateNaissance) {
		super(code, prenom, nom);
		this.dateNaissance = dateNaissance;
	}
	public Etudiant(String code, String prenom, String nom) {
		super(code, prenom, nom);
	}
	public Etudiant(String code) {
		super(code);
		// TODO Auto-generated constructor stub
	}
	public Etudiant() {
		// TODO Auto-generated constructor stub
	}
	
	private Date dateNaissance;
	//private Inscription [] inscriptions;
	private List <Inscription> inscriptions;
	
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	
	public List<Inscription> getInscriptions() {
		return inscriptions;
	}
	public void setInscriptions(List<Inscription> inscriptions) {
		this.inscriptions = inscriptions;
	}
	
}
