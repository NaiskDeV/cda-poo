package tp3_poo;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		C_FIGURE Tab[] = new C_FIGURE [100];
		
		for (int i=0; i<Tab.length; i++) {
			Random alea = new Random();
			int nbre_random = alea.nextInt(4);
			
			//Création random de carrés et de cercles
			//si nbre_random = 0 ou 1 => carré
			//si nbre_random = 2 ou 3 => rond
			if (nbre_random<2) {
				C_CARRE carre = new C_CARRE(i,i,i);
				Tab[i] = carre;
			}
			else {
				C_CERCLE rond = new C_CERCLE(i,i,i);
				Tab[i] = rond;
			}
		}
		
		System.out.println("Aire totale : "+Aire_totale(Tab));
		
	}
		
	public static double Aire_totale(C_FIGURE Tab[]) {
			double aire_totale=0;
			for (int i =0; i<Tab.length; i++) {
				double aire = Tab[i].Aire();
				aire_totale+= aire;
			}
			return aire_totale;
		}

	

}
