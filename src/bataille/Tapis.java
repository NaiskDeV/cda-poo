package bataille;

public class Tapis {

	public static void main(String[] args) {
		
		Joueur joueur1 = new Joueur("toto");
		Joueur joueur2 = new Joueur("mimi");
		
		System.out.println(joueur1);
		
		Partie partie1 = new Partie(joueur1, joueur2);
		partie1.creerPaquet();
		partie1.distribuerCarte();
	}

}
