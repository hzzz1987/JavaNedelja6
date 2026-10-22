package JavaNedelja6;

public class HemijskiProizvodi extends Proizvodi {
	
	private float temperaturaSkladistenja;
	private boolean zapaljivo;
	public float getTemperaturaSkladistenja() {
		return temperaturaSkladistenja;
	}
	public void setTemperaturaSkladistenja(float temperaturaSkladistenja) {
		this.temperaturaSkladistenja = temperaturaSkladistenja;
	}
	public boolean isZapaljivo() {
		return zapaljivo;
	}
	public void setZapaljivo(boolean zapaljivo) {
		this.zapaljivo = zapaljivo;
	}
	public HemijskiProizvodi(String opisProizvoda, String barkod, String zemljaProizvodnje, int godinaProizvodnje,
			double uvoznaCijena, float temperaturaSkladistenja, boolean zapaljivo) {
		super(opisProizvoda, barkod, zemljaProizvodnje, godinaProizvodnje, uvoznaCijena);
		this.temperaturaSkladistenja = temperaturaSkladistenja;
		this.zapaljivo = zapaljivo;
	}
	
	public void uvecajCijenu() {
		if(zapaljivo) {
			this.setUvoznacijena(getUvoznacijena() * 1.125);
		}else {
			this.setUvoznacijena(getUvoznacijena() * 1.1);
		}
	}
	@Override
	public String toString() {
		return "HemijskiProizvodi [temperaturaSkladistenja=" + temperaturaSkladistenja + ", zapaljivo=" + zapaljivo
				+ ", OpisProizvoda=" + getOpisProizvoda() + ", Barkod=" + getBarkod()
				+ ", Zemljaproizvodnje=" + getZemljaproizvodnje() + ", Godinaproizvodnje="
				+ getGodinaproizvodnje() + ", Uvoznacijena=" + getUvoznacijena() + "]";
	}
	
	

}
