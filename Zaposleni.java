package JavaNedelja6;

public class Zaposleni {
	
	private int ID;
	private String ime;
	private String prezime;
	private float plataPoSatu;
	private int brojSati;
	protected double plata;
	
	
	public double getPlata() {
		return plata;
	}
	public void setPlata(double plata) {
		this.plata = plata;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public float getPlataPoSatu() {
		return plataPoSatu;
	}
	public void setPlataPoSatu(float plataPoSatu) {
		this.plataPoSatu = plataPoSatu;
	}
	public int getBrojSati() {
		return brojSati;
	}
	public void setBrojSati(int brojSati) {
		this.brojSati = brojSati;
	}
	public Zaposleni(int iD, String ime, String prezime, float plataPoSatu, int brojSati, double plata) {
		super();
		ID = iD;
		this.ime = ime;
		this.prezime = prezime;
		this.plataPoSatu = plataPoSatu;
		this.brojSati = brojSati;
		this.plata = plata;
	}
	
	
	
	

}
