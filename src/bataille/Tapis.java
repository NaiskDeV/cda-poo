package bataille;

import java.util.Scanner;

public class Tapis {

	public static void main(String[] args) {
		
		Scanner clavier = new Scanner (System.in);
		System.out.println("Quel est le nom du joueur?");
		String nom = clavier.nextLine();
		Joueur joueur1 = new Joueur(nom);
		System.out.println("Quel est le nom du joueur?");
		nom = clavier.nextLine();
		Joueur joueur2 = new Joueur(nom);
		clavier.close();
		
		Partie partie1 = new Partie(joueur1, joueur2);
		partie1.creerPaquet();
		partie1.distribuerCarte();
		
		partie1.go();
		joueur1.gagner();
		joueur2.gagner();
		
	}

}
