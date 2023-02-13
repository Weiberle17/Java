package elektronikfachmarkt;

public class Waschmaschine extends Artikel {
	
	public double gewicht;
	
	public Waschmaschine() {
		
	}
	
	public void setArtikel(String name , String beschreibung, double preis, int lagerbestand, double gewicht) {
		super.setArtikel(name, beschreibung, preis, lagerbestand);
		this.gewicht = gewicht;
	}
	
	public void array() {
		super.array();
		preisschild[getX()] = preisschild[getX()] + String.format(" Gewicht: %.2f\n", gewicht);
//		System.out.println(preisschild[getX()]);
	}
}