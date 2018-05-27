package pl.szkolenie.gemetria.model;

public class Kolo extends Figura {

	private Punkt a;
	private Punkt b;

	public Kolo() {
		super();
	}

	public Kolo(Punkt a, Punkt b) {
		super();
		this.a = a;
		this.b = b;
	}

	public Punkt getA() {
		return a;
	}

	public void setA(Punkt a) {
		this.a = a;
	}

	public Punkt getB() {
		return b;
	}

	public void setB(Punkt b) {
		this.b = b;
	}
	
	@Override
	public double getPole() {
		double dl = new Wektor(b.getX()-a.getX(), b.getY()-a.getY()).getDlugosc();
		
		return dl*dl*Math.PI;
	}

	@Override
	public String toString() {
		return "Kolo [a=" + a + ", b=" + b + "]";
	}

}
