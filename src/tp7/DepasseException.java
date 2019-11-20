package tp7;

public class DepasseException extends Exception {
	public DepasseException() {
		System.out.println("Les coordonnées doivent être inférieures ou égales à 100");
	}
}
