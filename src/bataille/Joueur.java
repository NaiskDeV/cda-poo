package bataille;

import java.util.ArrayList;
import java.util.Scanner;



public class Joueur {
	private String nom;
	private ArrayList <Carte> main;
	private ArrayList <Carte> tapis;
	
	//Constructeur
	public Joueur(String pNom) {
		this.nom = pNom;
	}
	
	public boolean peutJouer() {
		if (this.main.size()>0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void derniereCartePosee() {
		
	}
	
	public boolean gagner(){
		if (this.main.size()==52) {
			return true;
		}
		else return false;
	}
	
	public void poserCarte(Carte pcarte) {
		//La carte est retirée de main en pop front 
		Carte carte = this.main.remove(0);
		
		//et ajoutée à tapis en push back
		this.tapis.add(pcarte);
	}
	
	public void ajouterCarte(Carte pcarte) {
		//ajouté à la main en push back
		this.main.add(pcarte);
	}
	
	
	public void setNom() {
		Scanner clavier = new Scanner (System.in);
		System.out.println("Quel est le nom du joueur?");
		this.nom = clavier.nextLine();
		clavier.close();
	}
	
	public void transferTapis(Joueur joueurGagnant) {
		for (int i=0; i<this.tapis.size(); i++) {
			joueurGagnant.ajouterCarte(this.tapis.get(i));
		}
		this.tapis.clear();
	}
}
