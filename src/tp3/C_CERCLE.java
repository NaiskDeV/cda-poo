package tp3_poo;

public class C_CERCLE extends C_FIGURE {
	
	double surface;
	
	//Constructeur par défaut
	public C_CERCLE(int abs, int ord) {
		super(abs, ord);
	}

	int rayon;
	
	public C_CERCLE(int abs, int ord, int r) {
		super(abs, ord);
		this.rayon = r;
	}
	
	public void affiche() {
		super.affiche();
		System.out.println(" et le rayon est : "+rayon);
	}
	
	public double Aire() {
		surface = rayon*rayon*Math.PI;
		return surface;
	}
}
