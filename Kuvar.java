package JavaNedelja6;

public class Kuvar extends Zaposleni {
	
	private int iznos;

	public int getIznos() {
		return iznos;
	}

	public void setIznos(int iznos) {
		this.iznos = iznos;
	}

	public Kuvar(int iD, String ime, String prezime, float plataPoSatu, int brojSati, double plata, int iznos) {
		super(iD, ime, prezime, plataPoSatu, brojSati, plata);
		this.iznos = 1500;
	}
	
	public void izracunajPlatu() {
		this.setPlata(iznos + 4 * getBrojSati() * getPlataPoSatu()); 
	
	}
	

}
