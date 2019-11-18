package tp2_poo;

public class C_POSITION {
	protected int x, y;
	
	public C_POSITION (int px, int py) {
		this.x = px;
		this.y = py;
	}
	
	public void deplace (int dx, int dy) {
		this.x += dx;
		this.y += dy;
	}
	
	public void affiche() {
		System.out.println("Position : x= "+x+", y = "+y);
	}
	
}
