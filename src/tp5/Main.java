package tp5;

public class Main {
	
	public static void main(String[] args) {
		
		//Exo1
		Service service1 = new Service(10);
		Service service2 = new Service(20);
		Service service3 = new Service(30);
		
		Boisson boisson1 = new Boisson(1);
		Boisson boisson2 = new Boisson(2);
		Boisson boisson3 = new Boisson(3);
		
		Payant ligne_prix[] = new Payant [6];
		ligne_prix[0] = service1;
		ligne_prix[1] = service2;
		ligne_prix[2] = service3;
		ligne_prix[3] = boisson1;
		ligne_prix[4] = boisson2;
		ligne_prix[5] = boisson3;
	
		float somme = 0;
		for (int i = 0; i < ligne_prix.length ; i++){
	        somme += ligne_prix[i].getPrix();
	    }
	    
	    System.out.println("Somme des prix : "+somme);

	}
	
	
	
    
}
