package sn.afi.entity;

import java.util.List;

public class Professeur extends User {
	private String grade;
	private List<Classe> classes;
	
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public List<Classe> getClasses() {
		return classes;
	}
	
	public void setClasses(List<Classe> classes) {
		this.classes = classes;
	}
	
}
