package elektronikfachmarkt;

public class Kaffeemaschine extends Artikel {
	
	public double volumen;
	
	public Kaffeemaschine() {
		
	}
	
	public void setArtikel(String name , String beschreibung, double preis, int lagerbestand, double volumen) {
		super.setArtikel(name, beschreibung, preis, lagerbestand);
		this.volumen = volumen;
	}
	
	public void array() {
		super.array();
		preisschild[getX()] = preisschild[getX()] + String.format(" Volumen: %.2f\n", volumen);
	}
}