package pl.expose.baza.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "osoby" )
public class Osoba {

	public enum Plec { K, M }
	
	@Id
	private long id;
	
	private String nazwa;
	
	private Integer wiek;
	
	@Enumerated(EnumType.STRING)
	private Plec plec;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public int getWiek() {
		return wiek;
	}

	public void setWiek(int wiek) {
		this.wiek = wiek;
	}

	public Plec getPlec() {
		return plec;
	}

	public void setPlec(Plec plec) {
		this.plec = plec;
	}

	@Override
	public String toString() {
		return "Osoba [id=" + id + ", nazwa=" + nazwa + ", wiek=" + wiek + ", plec=" + plec + "]";
	}

}
