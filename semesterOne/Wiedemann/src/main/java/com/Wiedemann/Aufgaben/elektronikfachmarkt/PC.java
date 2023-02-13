package elektronikfachmarkt;

public class PC extends Artikel {

	public int ram, speicher;
	
	public PC() {
		
	}
	
	public void setArtikel(String name , String beschreibung, double preis, int lagerbestand, int ram, int speicher) {
		super.setArtikel(name, beschreibung, preis, lagerbestand);
		this.ram = ram;
		this.speicher = speicher;
	}
	
	public void array() {
		super.array();
		preisschild[getX()] = preisschild[getX()] + String.format(" RAM: %d\n Festplattenspeicher: %d\n", ram, speicher);
	}
}