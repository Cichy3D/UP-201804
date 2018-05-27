package pl.szkolenie.gemetria.model;

public class Prostokat extends Figura {

	private Punkt a;
	private Punkt b;

	public Prostokat() {
		super();
	}

	public Prostokat(Punkt a, Punkt b) {
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
		return Math.abs(
				(b.getX()-a.getX()) * (b.getY()-a.getY())
		);
	}

	@Override
	public String toString() {
		return "Prostokat [a=" + a + ", b=" + b + "]";
	}

}
