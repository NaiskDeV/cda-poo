package tp1_poo;

public class C_CERCLE {
	private float x, y, rayon;
	
	public C_CERCLE (float abs, float ord, float rayon) {
		this.x = abs;
		this.y = ord;
		this.rayon = rayon;
	}
	
	public void deplace (float delta_x, float delta_y) {
		this.x += delta_x;
		this.y += delta_y;
	}
	
	public void affiche() {
		System.out.println("Cercle d'un rayon de "+rayon+", a son centre en x : "+x+", et y: "+y);
	}
	
	public boolean compare (C_CERCLE cercleA, C_CERCLE cercleB) {
		if (cercleA.rayon == cercleB.rayon) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public double surface() {
		return rayon*rayon*Math.PI;
	}
	
}
