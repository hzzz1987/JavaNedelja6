package JavaNedelja6;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class Fajlovi {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner s = new Scanner (new File("Vozila.txt"));

		while(s.hasNext())
			System.out.println(s.nextLine());
		
		s.close();
	}

}
