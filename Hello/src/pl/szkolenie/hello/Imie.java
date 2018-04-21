package pl.szkolenie.hello;

import java.util.Scanner;

public class Imie {

	public static void main(String[] args) {
		String imie;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Podaj swoje imiê: ");
		imie = scanner.nextLine();
		
		System.out.println("Witaj, "+imie+"!");
		scanner.close();
		
		if(imie.equals("Wojtek")) {
			System.out.println("Uwielbiam Ciê!");
		} else {
			System.out.println("I ¿egnam...");
		}
		
	}


}
