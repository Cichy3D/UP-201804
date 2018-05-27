package pl.szkolenie.gemetria.model;

public class Wektor extends Punkt {


	public Wektor(double x, double y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	public double getDlugosc(){
		return Math.sqrt(getX()*getX()+getY()*getY());
	}
	
	public double getKat(){
		return Math.atan2(getY(), getX());
	}
	
	public void setDlugosc(double len) {
		double ratio = len / getDlugosc();
		setX( getX()*ratio );
		setY( getY()*ratio );
	}
	
	public void setKat(double kat){
		double len = getDlugosc();
		setX( Math.cos(kat) * len );
		setY( Math.sin(kat) * len );
	}
}
