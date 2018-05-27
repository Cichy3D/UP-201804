package pl.szkolenie.dane;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import pl.szkolenie.dane.model.Osoba;

public class Dane {

	public final static DateFormat df = new SimpleDateFormat("yyyy.MM.dd");
	public final static List<Osoba> osoby = new ArrayList<>();
	
	public static void main(String[] args) {

		System.out.println("Start");

		osoby.add( new Osoba(101L, "Ala", new Date()) );
		osoby.add( new Osoba(102L, "Ela", new Date()) );
		osoby.add( new Osoba(103L, "Adam", new Date()) );
		
		
		
		for(Osoba osoba : osoby) {
			System.out.println( osoba );
		}
		
		
	}

}
