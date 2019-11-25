package bataille;

public class Carte {
	private String valeur;
	private String couleur;
	
	
	public Carte (String valeur, String couleur) {
		this.valeur = valeur;
		this.couleur = couleur;
	}
	
	public void superieurA(Carte pCarte) {
		
	}
	
	public void memeValeur(Carte pCarte) {
		
	}
	
	public String toString() {
		return "La carte retournée est : "+this.valeur+" de "+this.couleur;
	}
	
	}
