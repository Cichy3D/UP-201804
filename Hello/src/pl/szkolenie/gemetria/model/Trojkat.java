package pl.szkolenie.gemetria.model;

public class Trojkat extends Figura {

	private Punkt a;
	private Punkt b;
	private Punkt c;
	
	public Trojkat() {
	}
	public Trojkat(Punkt a, Punkt b, Punkt c) {
		this.a = a;
		this.b = b;
		this.c = c;
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
	public Punkt getC() {
		return c;
	}
	public void setC(Punkt c) {
		this.c = c;
	}
	
	public double getPole() {
		return Math.abs(
				 a.getX()*b.getY()
				+b.getX()*c.getY()
				+c.getX()*a.getY()
				-c.getX()*b.getY()
				-a.getX()*c.getY()
				-b.getX()*c.getY()
			)/2;
	}
	
	@Override
	public String toString() {
		return super.toString()+"Trojkat [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
	
	
}
