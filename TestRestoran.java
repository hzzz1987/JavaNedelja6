package JavaNedelja6;

import java.util.ArrayList;

public class TestRestoran {

	public static void main(String[] args) {
		ArrayList <Zaposleni> zaposleni = new ArrayList<>();
		
		Konobar konobar1 = new Konobar(1, "Marko", "Markovic", 40, 40, 0, 15);
		Kuvar kuvar1 = new Kuvar(2, "Marko", "Ivanovic", 40, 40, 0 , 1500);
		
		
		Restoran r1 = new Restoran("Astorija", "City kvart", 123, zaposleni);

		r1.dodajZaposlenog(konobar1);
	}

}
