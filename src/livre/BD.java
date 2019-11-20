package livre;

public class BD extends Livre {
	
	String dessinateur;
	
	//Constructeur par défaut
	public BD(String auteur, String titre) {
		super(auteur, titre);
	}
	
	public BD(String auteur, String titre, String pDessinateur) {
		super(auteur, titre);
		this.dessinateur = pDessinateur;
	}
	
	public String toString() {
		return "La bande dessinée "+this.titre+" écrit par "+this.auteur+" et dessiné par "+this.dessinateur+" est "+this.isEmprunter();
	}
}
