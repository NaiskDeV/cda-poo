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
		this.paquet = new ArrayList<Carte>();
	}
	
	public void creerPaquet() {
		String valeurs [] = {"2","3","4","5","6","7","8","9","10","Valet","Dame","Roi","As"};
		String couleurs[] = {"Coeur", "Carreau", "Pique", "Trèfle"};
		int powers[] = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
		

		//Remplissage paquet
		for (int i =0; i<valeurs.length; i++) {
			for (int j=0; j<couleurs.length; j++) {
				Carte carte = new Carte(valeurs[i], couleurs[j], powers[i]);
				this.paquet.add(carte);
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
		System.out.println(paquet);
		//Distribution de la première moitié du paquet à joueur1
		for (int i =0; i<paquet.size()/2; i++) {
			joueur1.ajouterCarte(paquet.get(i));
		}
		
		//Distribution de la deuxième moitié du paquet à joueur2
		for (int j=paquet.size()/2; j<paquet.size(); j++) {
			joueur2.ajouterCarte(paquet.get(j));
		}
		
	}
}
