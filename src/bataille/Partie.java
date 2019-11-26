package bataille;

import java.util.ArrayList;
import java.util.Collections;

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
				Carte carte = new Carte();
				carte.setValeur(valeurs[i]);
				carte.setCouleur(couleurs[j]);
				carte.setPower(power[i]);
				paquet.add(carte);
			}
		}
	}
	
	public void creerJeu() {
		
	}
	
	public void go() {
		
	}

	public void unTourDeJeu() {
		Carte carte1 = joueur1.poserCarte();
		
	}

	public void bataille() {
		
	}

	public void etatBataille() {
		
	}
	
	public void resolutionTour() {
		
	}
	
	public void distribuerCarte() {
		//Mélange du paquet
		Collections.shuffle(paquet);
		
		//Distribution de la première moitié du paquet à joueur1
		for (int i =0; i<paquet.size()/2; i++) {
			joueur1.ajouterCarte(paquet.get(i));
		}
		
		//Distribution de la première moitié du paquet à joueur2
		for (int j =paquet.size()/2; j<paquet.size()/2; j++) {
			joueur2.ajouterCarte(paquet.get(j));
		}
	}
}
