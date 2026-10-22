package JavaNedelja6;

public class Garderoba extends Proizvodi {
	
	private String materijalProizvodnje;
	private String sezona;
	
	
	public Garderoba(String opisProizvoda, String barkod, String zemljaproizvodnje, int godinaproizvodnje,
			double uvoznacijena, String materijalProizvodnje, String sezona) {
		super(opisProizvoda, barkod, zemljaproizvodnje, godinaproizvodnje, uvoznacijena);
		this.materijalProizvodnje = materijalProizvodnje;
		this.sezona = sezona;
	}
	public String getMaterijalProizvodnje() {
		return materijalProizvodnje;
	}
	public void setMaterijalProizvodnje(String materijalProizvodnje) {
		this.materijalProizvodnje = materijalProizvodnje;
	}
	public String getSezona() {
		return sezona;
	}
	public void setSezona(String sezona) {
		this.sezona = sezona;
	}
	
	public void izracunajCijenu () {
		
		this.setUvoznacijena(getUvoznacijena() * 1.05);
	}
	@Override
	public String toString() {
		return "Garderoba [materijalProizvodnje=" + materijalProizvodnje + ", sezona=" + sezona
				+ ", OpisProizvoda=" + getOpisProizvoda() + ", Barkod=" + getBarkod()
				+ ", Zemljaproizvodnje()=" + getZemljaproizvodnje() + ", Godinaproizvodnje()="
				+ getGodinaproizvodnje() + ", Uvoznacijena=" + getUvoznacijena() + "]";
	}
	
	

}
