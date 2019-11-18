package tp2_poo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner clavier = new Scanner(System.in);
		System.out.println("Nom?");
		char nom = clavier.next().charAt(0); 
		System.out.println("Abscisse?");
		int x = clavier.nextInt();
		System.out.println("Ordonnée?");
		int y = clavier.nextInt();
		
		C_POINT point1 = new C_POINT(x, y, nom);
		point1.aff();
		
		clavier.close();
	}

}
