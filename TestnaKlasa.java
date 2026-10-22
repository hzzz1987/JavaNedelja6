package JavaNedelja6;

import java.time.LocalDate;
import java.util.ArrayList;

public class TestnaKlasa {

	public static void main(String[] args) {
		
	 Garderoba g1 = new Garderoba("majica","3847947", "Crna Gora", 2026, 2.5, "Kasmir", "zimska");
	 HemijskiProizvodi h1 = new HemijskiProizvodi("prasak", "395873953957", "Amerika", 2026, 9.5, 23.4f, false);
	 Hrana h2 = new Hrana("Pica", "3498358", "Italija", 2026, 11, 600,LocalDate.of(2026, 10, 22));
	 
	 ArrayList <Proizvodi>lista = new ArrayList<>();
	 lista.add(g1);
	 lista.add(h1);
	 lista.add(h2);
	 
	 for(Proizvodi p: lista) {
		 System.out.println(p);
	 }
	 
	 for (Proizvodi p:lista) {
		 p.izracunajCijenu();
		 System.out.println(p);
	 }
	 System.out.println("******************************");
	 

	}

}
