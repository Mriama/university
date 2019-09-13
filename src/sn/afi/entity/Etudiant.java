package sn.afi.entity;

import java.util.Date;
import java.util.List;

public class Etudiant extends User{
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
