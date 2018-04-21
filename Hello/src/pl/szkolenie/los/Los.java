package pl.szkolenie.los;

import java.util.Random;
import java.util.Scanner;

public class Los {

	public static void main(String[] args) {
		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);
		int los = rnd.nextInt(1000) + 1;
		int ileProb = 0;		
		System.out.println("Wylosowa�em liczb� w granicach [1; 1000], zgadnij j�.");
		
		while (true) {
			if(ileProb > 0) {
				System.out.println("Pr�ba " + ileProb +".");
			}
			ileProb++;
			System.out.print("Podaj liczb�: ");
			String odp = scan.nextLine();
			int x = Integer.parseInt(odp);
			
			if(x == los) {
				break;
			} else {
				System.out.println("Nici, bo wylosowa�em " + ( x<los ? "wi�ksz�" : "mniejsz�" ) + " liczb�.");
			}
		}
		System.out.println("Zgad�e� za " + ileProb + " razem.");
		scan.close();
	}

}
