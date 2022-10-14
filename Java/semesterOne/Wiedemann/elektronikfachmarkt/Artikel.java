package elektronikfachmarkt;

public class Artikel {

	public String name, beschreibung;
	public double preis;
	public int lagerbestand;
	public boolean verfügbar;
	public static String[] preisschild = new String[25];
	public int x = 0;
	public int i = 0;
	
	public Artikel() {
		
	}
	
	public void setArtikel(String name, String beschreibung, double preis, int lagerbestand) {
		this.name = name;
		this.beschreibung = beschreibung;
		this.preis = preis;
		this.lagerbestand = lagerbestand;
	}
	
	public int getX() {
//		System.out.println(x);
		return x;
	}
	
	public void array() {
		preisschild[getX()] = String.format(" Name: %s\n Beschreibung: %s\n Preis: %.2f\n Lagerbestand: %d\n", name, beschreibung, preis, lagerbestand);
//		System.out.println(preisschild[getX()]);
	}
	
	public String getPrizeTag() {
		array();
		return preisschild[getX()];
	}
	
//	public void ausgabe() {
//		for (int i = 0; i < x; i++) {
//		System.out.println(preisschild[i]);
//		}
//	}
}