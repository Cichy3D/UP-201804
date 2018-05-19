package pl.szkolenie.dane;

import java.util.Date;

public class Osoba {

	private Long id;
	private String name;
	private Date birth;
	private Boolean alife = true;
	
	public Osoba(Long id, String name, Date birth) {
		this.id = id;
		this.name = name;
		this.birth = birth;
		alife = true;
	}

	public Osoba() { 
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public Boolean getAlife() {
		return alife;
	}
	public void setAlife(Boolean alife) {
		this.alife = alife;
	}

	@Override
	public String toString() {
		return "Osoba [id=" + id + ", name=" + name + ", birth=" + Dane.df.format(birth) + ", alife=" + alife + "]";
	}
	
	
	
}
