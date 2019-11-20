package livre;

public class BD extends Livre {
	
	String dessinateur;
	
	//Constructeur par d�faut
	public BD(String auteur, String titre) {
		super(auteur, titre);
	}
	
	public BD(String auteur, String titre, String pDessinateur) {
		super(auteur, titre);
		this.dessinateur = pDessinateur;
	}
	
	public String toString() {
		return "La bande dessin�e "+this.titre+" �crit par "+this.auteur+" et dessin� par "+this.dessinateur+" est "+this.isEmprunter();
	}
}
