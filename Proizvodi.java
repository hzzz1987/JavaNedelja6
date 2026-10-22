package JavaNedelja6;

public class Proizvodi {
	
	private String opisProizvoda;
	private String barkod;
	private String zemljaProizvodnje;
	private int godinaProizvodnje;
	protected double uvoznaCijena;
	
	
	public String getOpisProizvoda() {
		return opisProizvoda;
	}
	public void setOpisProizvoda(String opisProizvoda) {
		this.opisProizvoda = opisProizvoda;
	}
	public String getBarkod() {
		return barkod;
	}
	public void setBarkod(String barkod) {
		this.barkod = barkod;
	}
	public String getZemljaproizvodnje() {
		return zemljaProizvodnje;
	}
	public void setZemljaproizvodnje(String zemljaproizvodnje) {
		this.zemljaProizvodnje = zemljaproizvodnje;
	}
	public int getGodinaproizvodnje() {
		return godinaProizvodnje;
	}
	public void setGodinaproizvodnje(int godinaproizvodnje) {
		this.godinaProizvodnje = godinaproizvodnje;
	}
	public double getUvoznacijena() {
		return uvoznaCijena;
	}
	public void setUvoznacijena(double uvoznacijena) {
		this.uvoznaCijena = uvoznacijena;
	}
	
	public void izracunajCijenu() {
		
	}
	
	public Proizvodi(String opisProizvoda, String barkod, String zemljaProizvodnje, int godinaProizvodnje,
			double uvoznaCijena) {
		
		this.opisProizvoda = opisProizvoda;
		this.barkod = barkod;
		this.zemljaProizvodnje = zemljaProizvodnje;
		this.godinaProizvodnje = godinaProizvodnje;
		this.uvoznaCijena = uvoznaCijena;
	}
	
	

}
