package JavaNedelja6;

public class Konobar extends Zaposleni {

	private int prekovremeniSati;

	public int getPrekovremeniSati() {
		return prekovremeniSati;
	}

	public void setPrekovremeniSati(int prekovremeniSati) {
		this.prekovremeniSati = prekovremeniSati;
	}

	public Konobar(int iD, String ime, String prezime, float plataPoSatu, int brojSati, int prekovremeniSati, double plata) {
		super(iD, ime, prezime, plataPoSatu, brojSati, plata);
		this.prekovremeniSati = prekovremeniSati;
	}
	
	public void izracunajPlatu() {
		
		if(this.prekovremeniSati > 0) {
			this.setPlataPoSatu(getPlataPoSatu() * getBrojSati() + getPlataPoSatu() * getPrekovremeniSati() * 1.2f);
		}
		
	}
	
}
