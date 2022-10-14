package elektronikfachmarkt;

public class Spielkonsole extends Artikel {

	public String hersteller;

	public Spielkonsole() {

	}

	public void setArtikel(String name, String beschreibung, double preis, int lagerbestand, String hersteller) {
		super.setArtikel(name, beschreibung, preis, lagerbestand);
		this.hersteller = hersteller;
	}

	public void array() {
		super.array();
		preisschild[getX()] = preisschild[getX()] + String.format(" Hersteller: %s\n", hersteller);
	}
}