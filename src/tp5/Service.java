package tp5;


class Service implements Payant {
	
	float prix; 
	
	 public Service(float prix){
		 this.prix = prix;
	 }
	 
	 public float getPrix() {
		 return prix; // prix étant un attribut de la classe Service
	 }
	}
