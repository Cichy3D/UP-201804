package pl.szkolenie.dane;

import java.util.Date;

public class Osoba {
	
	private String nazwa;
	private Date dataUrodzenia;
	private String plec;
	private boolean czyZyle = true;
	
	public Osoba() { }
	
	public Osoba(String nazwa, Date dataUrodzenia, String plec, boolean czyZyle) {
		this.nazwa = nazwa;
		this.dataUrodzenia = dataUrodzenia;
		this.plec = plec;
		this.czyZyle = czyZyle;
		System.out.println("Konstruktor klasy Osoba");
	}
	
	public Osoba(String nazwa, Date dataUrodzenia, String plec) {
		this(nazwa, dataUrodzenia, plec, true);
	}

	

	public String getNazwa() {
		return nazwa;
	}
	public void setNazwa(String n) {
		nazwa = n;
	}
	public Date getDataUrodzenia() {
		return dataUrodzenia;
	}
	public void setDataUrodzenia(Date dataUrodzenia) {
		this.dataUrodzenia = dataUrodzenia;
	}
	public String getPlec() {
		return plec;
	}
	public void setPlec(String plec) {
		this.plec = plec;
	}
	public boolean isCzyZyle() {
		return czyZyle;
	}
	public void setCzyZyle(boolean czyZyle) {
		this.czyZyle = czyZyle;
	}
	
	
	
}
