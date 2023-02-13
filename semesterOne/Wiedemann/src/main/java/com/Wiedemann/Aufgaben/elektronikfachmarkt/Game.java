package elektronikfachmarkt;

public class Game extends Artikel {

	public int usk;
	
	public Game() {
		
	}
	
	public void setArtikel(String name , String beschreibung, double preis, int lagerbestand, int usk) {
		super.setArtikel(name, beschreibung, preis, lagerbestand);
		this.usk = usk;
	}
	
	public void array() {
		super.array();
		preisschild[getX()] = preisschild[getX()] + String.format(" USK: %d\n", usk);
	}
}