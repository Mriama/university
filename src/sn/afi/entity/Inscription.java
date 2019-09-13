package sn.afi.entity;

import java.util.Date;

public class Inscription {
	private int id;
	private Date dateIns;
	private Etudiant etudiant;
	private Classe classe;
	public int getId() {
		return id;
	}
	
	public Date getDateIns() {
		return dateIns;
	}
	public void setDateIns(Date dateIns) {
		this.dateIns = dateIns;
	}
	public Etudiant getEtudiant() {
		return etudiant;
	}
	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}
	public Classe getClasse() {
		return classe;
	}
	public void setClasse(Classe classe) {
		this.classe = classe;
	}
	
	
}
