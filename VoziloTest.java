package JavaNedelja6;

import java.time.LocalDate;
import java.util.ArrayList;


public class VoziloTest {

	public static void main(String[] args) {
		
		LocalDate dd = LocalDate.now();
		
		System.out.println(dd.getYear());
		
		Automobil.setOsnovicaZaRegistaciju((float)1.5);
		
		/*Automobil a = new Automobil("VW", "Golf", 1496, 2007, 5, 5);
		
		System.out.println(a.dajCijenuRegistracije());*/
		
		
		ArrayList <Vozilo> vozniPark = new ArrayList <Vozilo>();
		
		vozniPark.add(new Automobil("VW","Golf",1496,2007,5,5));
		vozniPark.add(new Automobil("BMW","M3",3000,2017,5,5));
		vozniPark.add(new Motocikl("Suzuki","xxxx",3000,2017,0));
		vozniPark.add(new Kamion("MAN", "999", 6000, 2017, 10));
		
		
		float ukupnaCijena = 0;
		for(Vozilo aa : vozniPark)
		ukupnaCijena += aa.dajCijenuRegistracije();
		System.out.printf("Ukupno za registraciju %.2f EUR", ukupnaCijena);
	}
	
}
