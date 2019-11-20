package tp2;

public class C_POINT extends C_POSITION {

	char nom;
	
	//Constructeur par défaut
	public C_POINT() {
		super(0, 0);
	}
	
	//Constructeur d'initialisation
	public C_POINT(int px, int py, char nom) {
		super(px, py);
		this.nom = nom;
	}
	
	//Constructeur de recopie
	public C_POINT (C_POINT point) {
		super(point.x, point.y);
		nom = point.nom;
	}
	
	public void aff() {
		System.out.println(nom+"("+x+","+y+")");
	}
	
	
}
