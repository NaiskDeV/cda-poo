package tp7;

public class DepasseException extends Exception {
	public DepasseException() {
		System.out.println("Les coordonn�es doivent �tre inf�rieures ou �gales � 100");
	}
}
