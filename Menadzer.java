package JavaNedelja6;

public class Menadzer extends Zaposleni {
	
	private double osnovica;
	private double bonus;
	
	public double getOsnovica() {
		return osnovica;
	}
	public void setOsnovica(double osnovica) {
		this.osnovica = osnovica;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public Menadzer(int iD, String ime, String prezime, float plataPoSatu, int brojSati, double plata, double osnovica,
			double bonus) {
		super(iD, ime, prezime, plataPoSatu, brojSati, plata);
		this.osnovica = osnovica;
		this.bonus = bonus;
	}
	
	public void izracunajPlatu() {
		this.setPlata(this.getOsnovica() + 4 * this.getBrojSati() * this.getPlataPoSatu() + this.getBonus());
	}
	
	

}
