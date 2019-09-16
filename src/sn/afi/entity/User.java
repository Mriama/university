package sn.afi.entity;

public abstract class User {
	protected String code;
	protected String prenom;
	protected String nom;
	
	
	
	public User(String code, String prenom, String nom) {
		super();
		this.code = code;
		this.prenom = prenom;
		this.nom = nom;
	}
	
	public User() {
		super();
	}

	public String getCode() {
		return code;
	}
	public User(String code) {
		super();
		this.code = code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
}
