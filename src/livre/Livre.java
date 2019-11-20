package livre;

public class Livre {
	
	String titre;
	String auteur;
	boolean emprunte = false;
	
	public Livre(String pAuteur, String pTitre) {
		this.auteur = pAuteur;
		this.titre = pTitre;
	}
	
	public String getTitre() {
		return "Titre : "+this.titre;
	}
	
	public String getAuteur() {
		return "Auteur : "+this.auteur;
	}
	
	public void emprunter() {
		this.emprunte = true;
	}
	
	public void rendre() {
		this.emprunte = false;
	}
	
	public String isEmprunter() {
		String status;
		if (this.emprunte==true) {
			status = "emprunté";
		}
		else {
			status = "disponible";
		}
		
		return status ;
	}
	
	public String toString() {
		return "Le livre "+this.titre+" écrit par "+this.auteur+" est "+this.isEmprunter();
	}
}