package bataille;

import java.util.ArrayList;
import java.util.Scanner;



public class Joueur {
	private String nom;
	private ArrayList <Carte> main;
	private ArrayList <Carte> tapis;
	
	//Constructeur
	public Joueur(String pNom, ArrayList <Carte> pMain, ArrayList <Carte> pTapis) {
		this.nom = pNom;
		this.main = pMain;
		this.tapis = pTapis;
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
	
	public void poserCarte() {
		//La carte est retirée de main en pop front 
		Carte carte = this.main.remove(0);
		
		//et ajoutée à tapis en push back
		this.tapis.add(tapis.size()-1, carte);
	}
	
	public void ajouterCarte(Carte pcarte) {
		//ajouté à la main en push back
		this.main.add(main.size()-1, pcarte);
	}
	
	
	public void setNom() {
		Scanner clavier = new Scanner (System.in);
		System.out.println("Quel est le nom du joueur?");
		this.nom = clavier.nextLine();
		clavier.close();
	}
	
	public void transferTapis(Joueur joueurGagnant) {
		for (int i=0; i<this.tapis.size(); i++) {
			joueurGagnant.main.add(main.size()-1, tapis.get(i));
		}
		this.tapis.clear();
	}
}
