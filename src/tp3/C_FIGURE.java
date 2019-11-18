package tp3_poo;

abstract public class C_FIGURE {
	int x, y;
	double surface;
	
	public C_FIGURE(int abs, int ord) {
		this.x = abs;
		this.y = ord;
	}
	
	public void affiche() {
		System.out.println("Coordonnées : x= "+x+", y= "+y);
	}
	
	abstract double Aire();
	
}

