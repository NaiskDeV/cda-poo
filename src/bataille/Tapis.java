package bataille;

public class Tapis {

	public static void main(String[] args) {
		
		Joueur joueur1 = new Joueur("toto");
		Joueur joueur2 = new Joueur("mimi");
		
		
		
		Partie partie1 = new Partie(joueur1, joueur2);
		partie1.creerPaquet();
		partie1.distribuerCarte();
		/*
		Joueur joueurGagnant = partie1.unTourDeJeu();
		joueur1.transfertTapis(joueurGagnant);
		joueur2.transfertTapis(joueurGagnant);
		
		System.out.println(joueur1.toString());
		System.out.println(joueur2.toString());
		*/
		
		
		
		int compteur = 50000;
		
		while(joueur1.peutJouer()==true && joueur2.peutJouer()==true &&compteur>0) {
		Joueur joueurGagnant = partie1.unTourDeJeu();
		joueur1.transfertTapis(joueurGagnant);
		joueur2.transfertTapis(joueurGagnant);
		
		System.out.println(joueur1.toString());
		System.out.println(joueur2.toString());
		compteur--;
		System.out.println(compteur);
		
		}
		
		System.out.println("terminé");
		
	}

}
