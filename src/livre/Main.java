package livre;

public class Main {

	public static void main(String[] args) {
		Livre roman = new Livre("Terry Pratchet", "Le disque monde");
		
		System.out.println(roman);
		roman.emprunter();
		System.out.println(roman);
		
		BD asterix = new BD("Goscinny", "Asterix et Cléopatre", "Uderzo"); 
		System.out.println(asterix);
		
		LivreEmpruntable exemple = new LivreEmpruntable("Auteur1","Auteur2");
		System.out.println(exemple);
		exemple.emprunter();
		System.out.println(exemple);
		
		Livre biblio[] = new Livre [5];
		biblio[0]=roman;
		biblio[1]=asterix;
		biblio[2]=exemple;
		
		for (int i=0; i<biblio.length; i++) {
			System.out.println(biblio[i]);
		}
	}

}
