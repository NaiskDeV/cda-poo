package tp5_poo;

class Boisson implements Payant {
	 
	float prix; 
	
	public Boisson(float prix) {
		this.prix = prix;
	}
	
	public float getPrix() {
		return prix; // prix étant un attribut de la classe Boisson
	 }
	
	}
