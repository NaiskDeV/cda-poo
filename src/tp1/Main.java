package tp1_poo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Exo1
		C_CERCLE cercle1 = new C_CERCLE(0, 0, 3);
		C_CERCLE cercle2 = new C_CERCLE(0, 0, 5);
		C_CERCLE cercle3 = new C_CERCLE(0, 0, 3);
		
		cercle1.deplace(1, 1);
		cercle2.deplace(3, 3); 
		
		cercle1.affiche();
		cercle2.affiche();
		cercle3.affiche();
		
		System.out.println("cercle1/cercle2 : "+cercle1.compare(cercle1, cercle2));
		System.out.println("cercle1/cercle3 : "+cercle1.compare(cercle1, cercle3));
		
		System.out.println(cercle1.surface());
		
		//Exo2
		C_CERCLE Tab[] = new C_CERCLE [3];
		
		Tab[0]=cercle1;
		Tab[1]=cercle2;
		Tab[2]=cercle3;
		
		for(int i=0; i<Tab.length; i++) {
			Tab[i].affiche();
		}

		//Exo3
		Scanner clavier = new Scanner(System.in);
		System.out.println("Combien de cercle?");
		int nbre_cercle = clavier.nextInt();
		
		C_CERCLE Tableau[] = new C_CERCLE [nbre_cercle];
		
		for (int i=0; i<Tableau.length; i++) {
			System.out.println("Cercle n°"+(i+1));
			System.out.println("Rayon?");
			float rayon = clavier.nextFloat();
			System.out.println("Abscisse?");
			float abs = clavier.nextFloat();
			System.out.println("Ordonnée?");
			float ord = clavier.nextFloat();
			
			C_CERCLE cercle = new C_CERCLE(abs, ord, rayon);
			Tableau[i]= cercle;
			Tableau[i].affiche();
		}
		
		
		
		clavier.close();
	}

}
