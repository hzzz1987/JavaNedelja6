package JavaNedelja6;

import java.time.LocalDate;

public class Hrana extends Proizvodi {
	
	private int brojKalorija;
	private LocalDate rokTrajanja;
	public int getBrojKalorija() {
		return brojKalorija;
	}
	public void setBrojKalorija(int brojKalorija) {
		if(brojKalorija > 0)
		this.brojKalorija = brojKalorija;
	}
	public LocalDate getRokTrajanja() {
		return rokTrajanja;
	}
	public void setRokTrajanja(LocalDate rokTrajanja) {
		this.rokTrajanja = rokTrajanja;
	}
	public Hrana(String opisProizvoda, String barkod, String zemljaProizvodnje, int godinaProizvodnje,
			double uvoznaCijena, int brojKalorija, LocalDate rokTrajanja) {
		super(opisProizvoda, barkod, zemljaProizvodnje, godinaProizvodnje, uvoznaCijena);
		this.setBrojKalorija(brojKalorija);
		this.setRokTrajanja(rokTrajanja);
	}
	
/*	public void izracunajCijenu() {
		LocalDate danas = LocalDate.now();
		if(danas.minusMonths(6).isAfter(rokTrajanja)) {
			this.setUvoznacijena(getUvoznacijena() * 1.05);
		}  */
	
	public void izracunajCijenu() {
		if(rokTrajanja.isBefore(LocalDate.now().plusMonths(6))) {
			this.setUvoznacijena(getUvoznacijena() * 1.05);
		}else {
			this.setUvoznacijena(getUvoznacijena() * 1.1);
		}
		
		
	
	}
	@Override
	public String toString() {
		return "Hrana [brojKalorija=" + brojKalorija + ", rokTrajanja=" + rokTrajanja + ", OpisProizvoda="
				+ getOpisProizvoda() + ", Barkod=" + getBarkod() + ", Zemljaproizvodnje="
				+ getZemljaproizvodnje() + ", Godinaproizvodnje=" + getGodinaproizvodnje() + ", Uvoznacijena="
				+ getUvoznacijena() + "]";
	}
	
	
	
	
	
	

}
