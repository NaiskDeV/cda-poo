package towers;

public class Ennemi {
	
	float posX;
	float posY;
	int pv;
	int rapidite;
	
	public Ennemi(int p, int r) {
		this.posX = 0;
		this.posY = 0;
		this.pv = p;
		this.rapidite = r;
	}
	
	public void recevoirDegats(int deg) {
		this.pv=this.pv-deg;
	}
	
	public void seDeplace(float nouveauX, float nouveauY) {
		posX = nouveauX;
		posY = nouveauY;
	}
	
	public void affiche() {
		System.out.println("X :"+this.posX);
		System.out.println("Y :"+this.posY);
		System.out.println("PV :"+this.pv);
		System.out.println("Rapidité :"+this.rapidite);
	}
	
	public boolean estVivant() {
		if (this.pv>0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String toString() {
		return this.pv;
	}
	
}
