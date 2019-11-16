package towers;

import java.util.Scanner;

public class Ennemi {
	
	float posX;
	float posY;
	int pv;
	int rapidite;
	public static int compteur=0;
	
	public Ennemi(int p, int r) {
		this.posX = 0;
		this.posY = 0;
		this.pv = p;
		this.rapidite = r;
		compteur++;
	}
	
	public static Ennemi creationEnnemi() {
		Scanner clavier = new Scanner(System.in);
		System.out.println("Création d'un ennemi");
		System.out.println("Indiquez le nombre de pv : ");
		int pv= clavier.nextInt();
		
		System.out.println("Indiquez la rapidité : ");
		int rapidite = clavier.nextInt();
		
		Ennemi monEnnemi = new Ennemi(pv, rapidite);
		clavier.close();
		return monEnnemi;
		
	}
	
	public void recevoirDegats(int deg) {
		this.pv=this.pv-deg;
	}
	
	public void seDeplace(float nouveauX, float nouveauY) {
		posX = nouveauX;
		posY = nouveauY;
	}
	
	public void affiche() {
		System.out.println("X :"+this.posX);
		System.out.println("Y :"+this.posY);
		System.out.println("PV :"+this.pv);
		System.out.println("Rapidité :"+this.rapidite);
	}
	
	public boolean estVivant() {
		if (this.pv>0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String toString() {
		return "PV : "+this.pv+", Rapidité : "+this.rapidite+", X: "+this.posX+", Y: "+this.posY;
	}
	
	
}
