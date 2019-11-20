package livre;

public class Main {

	public static void main(String[] args) {
		Livre roman = new Livre("Terry Pratchet", "Le disque monde");
		
		System.out.println(roman);
		roman.emprunter();
		System.out.println(roman);
		
		BD asterix = new BD("Goscinny", "Asterix et Cléopatre", "Uderzo"); 
		System.out.println(asterix);

	}

}
