package bataille;

public class Carte {
	String valeur;
	String couleur;
	
	
	public Carte (String valeur, String couleur) {
		this.valeur = valeur;
		this.couleur = couleur;
	}
	
	public void superieurA(Carte pCarte) {
		
	}
	
	public void memeValeur(Carte pCarte) {
		
	}
	
	public String toString() {
		return "La carte retourn�e est : "+this.valeur+" de "+this.couleur;
	}
	
	}
