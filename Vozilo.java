package JavaNedelja6;
/* kreirati klasu vozilo ...... iz klase vozilo izvesti klasu automobil koja ce kao dodatne clanove
 * imati broj vrata i broj osoba izvesti i klasu motocikl koja ima kilometrazu i 3. klasa Kamion */

public class Vozilo {
	
	private String marka;
	private String model;
	private int kubikaza;
	private int godiste;
	
	public static float osnovicaZaRegistaciju;
	
		
	public static float getOsnovicaZaRegistaciju() {
		return osnovicaZaRegistaciju;
	}
	public static void setOsnovicaZaRegistaciju(float osnovicaZaRegistaciju) {
		Vozilo.osnovicaZaRegistaciju = osnovicaZaRegistaciju;
	}
	public Vozilo() {
		this(null , null, 0, 1945);
	}
	public Vozilo(String marka, String model, int kubikaza, int godiste) {
		super();
		this.setMarka(marka);
		this.setModel(model);
		this.setKubikaza (kubikaza);
		this.setGodiste(godiste);
	}
	
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getKubikaza() {
		return kubikaza;
	}
	public void setKubikaza(int kubikaza) {
		if(kubikaza >= 0)
		this.kubikaza = kubikaza;
	}
	public int getGodiste() {
		return godiste;
	}
	public void setGodiste(int godiste) {
		if(godiste >= 1945)
		this.godiste = godiste;
	}
	
	public float dajCijenuRegistracije() {
		return 0;
	}
	@Override
	public String toString() {
		return "Vozilo [marka=" + marka + ", model=" + model + ", kubikaza=" + kubikaza + ", godiste=" + godiste + "]";
	}
	
	
	
	
	
	
}
