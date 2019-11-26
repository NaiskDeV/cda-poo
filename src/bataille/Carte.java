package bataille;

public class Carte {
	private String valeur;
	private String couleur;
	private int power;
	
	
	public void setValeur (String valeur) {
		this.valeur = valeur;
	}
	
	public void setCouleur (String couleur) {
		this.couleur = couleur;
	}
	
	public void setPower (int power) {
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
		return "La carte retournée est : "+this.valeur+" de "+this.couleur;
	}
	
	}
