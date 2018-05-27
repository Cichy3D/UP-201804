package pl.szkolenie.dane.model;

import java.util.Date;

public class Osoba extends Encja {

	private String nazwa;
	private Date dataUrodzenia;
	private Boolean admin;
	
	public Osoba(Long id, String nazwa, Date dataUrodzenia) {
		super(id);
		this.nazwa = nazwa;
		this.dataUrodzenia = dataUrodzenia;
		admin = false;
	}
	
	
	
	public Osoba() { }

	public String getNazwa() {
		return nazwa;
	}
	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	public Date getDataUrodzenia() {
		return dataUrodzenia;
	}
	public void setDataUrodzenia(Date dataUrodzenia) {
		this.dataUrodzenia = dataUrodzenia;
	}
	public Boolean getAdmin() {
		return admin;
	}
	public void setAdmin(Boolean admin) {
		this.admin = admin;
	}

	public String toString() {
		return "Dane osoby: \n" 
				+ super.toString() + "\n"
				+ "nazwa: " + nazwa + "\n"
				+ "dataUrodzenia: " + dataUrodzenia + "\n"
				+ "admin: " + admin;
	}
	
	
	
}
