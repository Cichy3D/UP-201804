package pl.szkolenie.dane.model;

public class Encja {
	
	private Long id;

	public Encja(Long id) {
		this.id = id;
	}

	public Encja() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String toString() {
		return "id=" + id;
	}

}
