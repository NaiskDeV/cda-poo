package bataille;

public class Carte {
	private String valeur;
	private String couleur;
	private int power;
	
	
	public Carte(String valeur, String couleur, int power) {
		this.valeur = valeur;
		this.couleur = couleur;
		this.power = power;	
	}
	


	
	public boolean superieurA(Carte pCarte) {
		boolean flag = false;
		if (this.power > pCarte.power) {
			flag = true;
		}
		return flag;
	}
	
	public boolean memeValeur(Carte pCarte) {
		boolean flag = false;
		if (this.power == pCarte.power) {
			flag = true;
		}
		return flag;
	}
	
		
	public String toString() {
		return this.valeur+" de "+this.couleur;
	}
	
	}
