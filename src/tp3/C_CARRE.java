package tp3_poo;

public class C_CARRE extends C_FIGURE {

	public C_CARRE(int abs, int ord) {
		super(abs, ord);
	}
	
	int cote;
	double surface;
	
	public C_CARRE(int abs, int ord, int cote) {
		super(abs, ord);
		this.cote = cote;
	}
	
	public void affiche() {
		super.affiche();
		System.out.println(" et le coté est : "+cote);
	}
	
	public double Aire() {
		surface = cote*cote;
		return surface; 
	}
}
