package bataille;

import java.util.ArrayList;

public class Partie {
	
	private Joueur joueur1;
	private Joueur joueur2;
	private ArrayList <Carte> paquet;
	
	//Constructeur
	public Partie (Joueur pJoueur1, Joueur pJoueur2) {
		this.joueur1 = pJoueur1;
		this.joueur2 = pJoueur2;
	}
	
	public void creerPaquet() {
		String valeurs [] = {"2","3","4","5","6","7","8","9","10","Valet","Dame","Roi","As"};
		String couleurs[] = {"Coeur", "Carreau", "Pique", "Trèfle"};
		int power[] = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
		

		//Remplissage paquet
		for (int i =0; i<valeurs.length; i++) {
			for (int j=0; j<couleurs.length; i++) {
				Carte carte = new Carte
			}
		}
	}
	
	public void creerJeu() {
		
	}
	
	public void go() {
		
	}

	public void unTourDeJeu() {
		
	}

	public void bataille() {
		
	}

	public void etatBataille() {
		
	}
	
	public void resolutionTour() {
		
	}
}
