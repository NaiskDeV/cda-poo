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
		String couleurs[] = {"Coeur", "Carreau", "Pique", "Tr�fle"};
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

	public Joueur unTourDeJeu() {
		Carte carte1 = joueur1.poserCarte();
		Carte carte2 = joueur2.poserCarte();
		Joueur joueurGagnant = new Joueur();
		
		//Comparaison de la valeur des cartes pos�es
		if (carte1.memeValeur(carte2)==false) {
			//pas m�me valeur
			
			if (carte1.superieurA(carte2)==true) {
				joueurGagnant = joueur1;
			}
			else {
				joueurGagnant = joueur2;
			}
		
			System.out.println("Gagnant : "+joueurGagnant);
			return joueurGagnant;
		}
		else {
			//m�me valeur
			//joueur1.poserCarte();
			//joueur2.poserCarte();
			return this.unTourDeJeu();
		}
		
		
	}

	public void etatBataille() {
		
	}
	
	public void resolutionTour() {
		
	}
	
	public void distribuerCarte() {
		//M�lange du paquet
		Collections.shuffle(paquet);
		System.out.println(paquet);
		//Distribution de la premi�re moiti� du paquet � joueur1
		for (int i =0; i<paquet.size()/2; i++) {
			joueur1.ajouterCarte(paquet.get(i));
		}
		
		//Distribution de la deuxi�me moiti� du paquet � joueur2
		for (int j=paquet.size()/2; j<paquet.size(); j++) {
			joueur2.ajouterCarte(paquet.get(j));
		}
		
		System.out.println(joueur1);
		System.out.println(joueur2);
	}
}
