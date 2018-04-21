package pl.szkolenie.los;

import java.util.Random;
import java.util.Scanner;

public class Los {

	public static void main(String[] args) {
		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);
		int los = rnd.nextInt(1000) + 1;
		int ileProb = 0;		
		System.out.println("Wylosowa³em liczbê w granicach [1; 1000], zgadnij j¹.");
		
		while (true) {
			if(ileProb > 0) {
				System.out.println("Próba " + ileProb +".");
			}
			ileProb++;
			System.out.print("Podaj liczbê: ");
			String odp = scan.nextLine();
			int x = Integer.parseInt(odp);
			
			if(x == los) {
				break;
			} else {
				System.out.println("Nici, bo wylosowa³em " + ( x<los ? "wiêksz¹" : "mniejsz¹" ) + " liczbê.");
			}
		}
		System.out.println("Zgad³eœ za " + ileProb + " razem.");
		scan.close();
	}

}
