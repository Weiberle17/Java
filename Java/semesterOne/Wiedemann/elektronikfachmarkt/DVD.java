package elektronikfachmarkt;

public class DVD extends Artikel {

	public int usk;
	
	public DVD() {
		
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