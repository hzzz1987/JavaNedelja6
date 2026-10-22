package JavaNedelja6;

public class Automobil extends Vozilo {
	
	private int brojVrata;
	private int brojOsoba;
	
	
	public int getBrojVrata() {
		return brojVrata;
	}
	public void setBrojVrata(int brojVrata) {
		if(brojVrata >= 3)
		this.brojVrata = brojVrata;
	}
	public int getBrojOsoba() {
		return brojOsoba;
	}
	public void setBrojOsoba(int brojOsoba) {
		if(brojOsoba >= 2)
		this.brojOsoba = brojOsoba;
	}
	
	public Automobil() {
		this(null, null, 0, 1945, 3, 2);
	}
	
	public Automobil(String marka, String model, int kubikaza, int godiste, int brojVrata, int brojOsoba) {
		super(marka, model, kubikaza, godiste);
		this.setBrojVrata(brojVrata);
		this.setBrojOsoba(brojOsoba);
	}
	@Override
	public String toString() {
		return "Automobil [brojVrata=" + brojVrata + ", brojOsoba=" + brojOsoba + ", Marka()=" + getMarka()
				+ ", Model()=" + getModel() + ", Kubikaza()=" + getKubikaza() + ", Godiste()=" + getGodiste()
				+ "]";
	}
	@Override
	public float dajCijenuRegistracije() {
		float cijena;
		
		cijena = ((float)this.getKubikaza()/10+(2026 - this.getGodiste()) * 10) * Vozilo.getOsnovicaZaRegistaciju();
		return cijena;
	}
	
	
	
	
	
	
	
	

}
