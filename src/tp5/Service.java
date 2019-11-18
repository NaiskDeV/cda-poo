package tp5_poo;


class Service implements Payant {
	
	float prix; 
	
	 public Service(float prix){
		 this.prix = prix;
	 }
	 
	 public float getPrix() {
		 return prix; // prix étant un attribut de la classe Service
	 }
	}
