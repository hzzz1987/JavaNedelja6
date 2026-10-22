package JavaNedelja6;

public class Motocikl extends Vozilo {
	
	private float kilometraza;

	public float getKilometraza() {
		return kilometraza;
	}

	public void setKilometraza(float kilometraza) {
		if(kilometraza >= 0)
		this.kilometraza = kilometraza;
	}
	
	public Motocikl() {
		this(null, null, 0, 1945, 0);
	}

	public Motocikl(String marka, String model, int kubikaza, int godiste, float kilometraza) {
		super(marka, model, kubikaza, godiste);
		this.setKilometraza(kilometraza);
	}

	@Override
	public String toString() {
		return "Motocikl [kilometraza=" + kilometraza + ", Marka=" + getMarka() + ", Model=" + getModel()
				+ ", Kubikaza=" + getKubikaza() + ", Godiste=" + getGodiste() + "]";
	}

	
	
	
	
	
	
	

}
