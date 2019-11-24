package tp8;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Tp8Exo1 {

	public static void main(String[] args) throws IOException {
		Scanner lecture_clavier = new Scanner(System.in);
		
		FileReader Flux_Fichier;
		int c;
		Flux_Fichier = new FileReader("C:\\Users\\Sylvain\\Documents\\Formation - Laure\\web\\cours\\java\\exo1.txt"); // fichier texte

		  // Lecture et affichage du fichier
		  do {
		  c = Flux_Fichier.read(); // lecture
		  // retourne -1 si fin de fichier
		  char car = (char) c;
		  if (c != -1) {
		  System.out.print(car);
		  }
		  } while (c >= 0);
		  Flux_Fichier.close();
		  lecture_clavier.close();
		  }
		 }



