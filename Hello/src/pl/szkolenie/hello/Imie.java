package pl.szkolenie.hello;

import java.util.Scanner;

public class Imie {

	public static void main(String[] args) {
		String imie;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Podaj swoje imi�: ");
		imie = scanner.nextLine();
		
		System.out.println("Witaj, "+imie+"!");
		scanner.close();
		
		if(imie.equals("Wojtek")) {
			System.out.println("Uwielbiam Ci�!");
		} else {
			System.out.println("I �egnam...");
		}
		
	}


}
