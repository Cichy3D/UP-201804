package pl.szkolenie.dane;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Dane {

	public final static DateFormat df = new SimpleDateFormat("yyyy.MM.dd");
	
	public static void main(String[] args) {

		System.out.println("Start");

		Osoba o = new Osoba(1L, "Elka", new Date());
//		o.setName("Ala");
//		o.setBirth(new Date());
//		o.setId(100L);
//		o.setAlife(true);
		
		System.out.println(o);
//		System.out.println("Dane osoby, id: " + o.getId());
//		System.out.println("Nazwa " + o.getName());
//		System.out.println("Ur. " + df.format(o.getBirth()));
//		System.out.println("Żywa: " + (o.getAlife() ? "Tak" : "Nie" ));
		

	}

}
