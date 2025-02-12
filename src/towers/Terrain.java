package towers;

public class Terrain {

	public static void main(String[] args) {
		
		Ennemi grosMechant = new Ennemi(100,2);
		Ennemi unAutreEnnemi = new Ennemi(50,4);
		
		grosMechant.affiche();
		unAutreEnnemi.affiche();
		
		grosMechant.seDeplace(5, 8);
		
		grosMechant.affiche();
		
		grosMechant.recevoirDegats(50);
		unAutreEnnemi.recevoirDegats(10);
		
		grosMechant.affiche();
		unAutreEnnemi.affiche();
		
		System.out.println(grosMechant);
		grosMechant.toString();
		System.out.println(Ennemi.compteur);
		
		Ennemi nouvelEnnemi = Ennemi.creationEnnemi();
		nouvelEnnemi.toString();
		System.out.println(Ennemi.compteur);
	}

}
