package pl.szkolenie.dane;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Dane {
	
	final static DateFormat df = new SimpleDateFormat("yyyy.MM.dd");

	public static void main(String[] args) {
		Osoba osoba = new Osoba("Ala", new Date(), "K");

		System.out.println("Nazwa:    " + osoba.getNazwa());
		System.out.println("Data ur:  " + df.format(osoba.getDataUrodzenia()));
		System.out.println("Plec:     " + osoba.getPlec());
		System.out.println("Czy ¿yje: " + (osoba.isCzyZyle() ? "Tak" : "Nie") );
	}

}
