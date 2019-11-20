package tp7;

public class C_PRINCIPALE {
	public static void main(String[] args) {
		
		try {
		C_POINT a = new C_POINT (5,2);
		a.affiche();
		C_POINT b = new C_POINT (110, -1);
		b.affiche();
		} catch (DepasseException e) {
			
		}
		System.out.println("Fin du progamme");
		
		
	}
}
