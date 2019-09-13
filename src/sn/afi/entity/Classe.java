package sn.afi.entity;

import java.util.Date;
import java.util.List;

public class Classe {
	private String code;
	private Date dateOuverture;
	private Date dateFermeture;
	private Boolean ouverte;
	private List<Inscription> inscriptions;
	private List<Professeur> professeurs;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Date getDateOuverture() {
		return dateOuverture;
	}
	public void setDateOuverture(Date dateOuverture) {
		this.dateOuverture = dateOuverture;
	}
	public Date getDateFermeture() {
		return dateFermeture;
	}
	public void setDateFermeture(Date dateFermeture) {
		this.dateFermeture = dateFermeture;
	}
	public Boolean getOuverte() {
		return ouverte;
	}
	public void setOuverte(Boolean ouverte) {
		this.ouverte = ouverte;
	}
	public List<Inscription> getInscriptions() {
		return inscriptions;
	}
	public void setInscriptions(List<Inscription> inscriptions) {
		this.inscriptions = inscriptions;
	}
	
	public List<Professeur> getProfesseurs() {
		return professeurs;
	}
	public void setProfesseurs(List<Professeur> professeurs) {
		this.professeurs = professeurs;
	}
}
