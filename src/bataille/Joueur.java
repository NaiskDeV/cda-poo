package bataille;

import java.util.ArrayList;

public class Joueur {
	private String nom;
	private ArrayList <Carte> main;
	private ArrayList <Carte> tapis;
	
	//Constructeur
	public Joueur(String pNom) {
		this.nom = pNom;
		this.main = new ArrayList<Carte>();
		this.tapis = new ArrayList<Carte>();
	}
	
	public Joueur() {
		
	}
	
	//La main est-elle vide?
	public boolean peutJouer() {
		if (this.main.size()>0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//Message de fin
	public void gagner(){
		if (this.main.size()!=0) {
			String msg = "Félicitation à "+this.nom+"!";
			System.out.println(msg);
		}

	}
	
	//Poser 1 carte de la main vers le tapis
	public Carte poserCarte() {
		//La carte est retirée de main en pop front 
		Carte carte = this.main.remove(0);
		
		//et ajoutée à tapis en push back
		this.tapis.add(carte);
		
		System.out.println(carte);
		return carte;
	}
	
	public void ajouterCarte(Carte pcarte) {
		//ajouté à la main en push back
		this.main.add(pcarte);
	}
	

	public void transfertTapis(Joueur joueurGagnant) {
		for (int i=this.tapis.size()-1; i>=0; i--) {
			joueurGagnant.ajouterCarte(this.tapis.get(i));
		}
		this.tapis.clear();
		System.out.println(this.nom+" "+this.main.size()+" "+this.main);
	}
	
	public String toString() {
		return "Nom : "+this.nom+", main : "+this.main;
	}
	
}
