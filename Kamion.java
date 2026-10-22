package JavaNedelja6;

public class Kamion extends Vozilo {
	
	public int nosivost;

	public int getNosivost() {
		return nosivost;
	}

	public void setNosivost(int nosivost) {
		if(nosivost >= 0)
		this.nosivost = nosivost;
	}
	
	public Kamion () {
		this(null, null, 0, 1945, 0);
	}

	public Kamion(String marka, String model, int kubikaza, int godiste, int nosivost) {
		super(marka, model, kubikaza, godiste);
		this.nosivost = nosivost;
	}

	@Override
	public String toString() {
		return "Kamion [nosivost=" + nosivost + ", Marka=" + getMarka() + ", Model=" + getModel()
				+ ", Kubikaza=" + getKubikaza() + ", Godiste=" + getGodiste() + "]";
	}

	@Override
	public float dajCijenuRegistracije() {
		float cijena;
		
		cijena = ((float)this.getKubikaza()/10 + (2026 - this.getGodiste()) * 10) * Vozilo.getOsnovicaZaRegistaciju() + 30 * this.getNosivost();
		
		return cijena;
	}
	
	
	
	
	
	

}
