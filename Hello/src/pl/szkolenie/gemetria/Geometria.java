package pl.szkolenie.gemetria;

import java.util.ArrayList;
import java.util.List;

import pl.szkolenie.gemetria.model.Figura;
import pl.szkolenie.gemetria.model.Kolo;
import pl.szkolenie.gemetria.model.Prostokat;
import pl.szkolenie.gemetria.model.Punkt;
import pl.szkolenie.gemetria.model.Trojkat;

public class Geometria {

	public static void main(String[] args) {
		System.out.println("Geometria");
		
		Punkt a = new Punkt(10, 0);
		Punkt b = new Punkt(0, 10);
		Punkt c = new Punkt(0, 0);
		
		List<Figura> figury = new ArrayList<>();
		figury.add(new Trojkat(a, b, c));
		figury.add(new Prostokat(a, b));
		figury.add(new Kolo(a, c));
		
		for(Figura f : figury) {
			System.out.println(f);
			System.out.println(f.getPole());
		}
		
	}
	
}
