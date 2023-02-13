package elektronikfachmarkt;

public class Artikelverwaltung {
	
	public static void main(String[] args) {
		Waschmaschine w1 = new Waschmaschine();
		Waschmaschine w2 = new Waschmaschine();
		Kaffeemaschine k1 = new Kaffeemaschine();
		k1.setArtikel("Manni", "kocht Kaffee", 180, 5, 5.2);
		w1.setArtikel("Dieter", "wäscht Wäsche", 130, 25, 40);
		w2.setArtikel("Herbert", "kocht Kaffee", 150, 3, 3.2);
		k1.array();
		w1.array();
		System.out.println(w1.getPrizeTag());
		System.out.println(k1.getPrizeTag());
		System.out.println(w2.getPrizeTag());
//		ausgabe();
		
	}
	
//	public static void ausgabe() {
//		for (int i = 0; i < Artikel.preisschild.length; i++) {
//		System.out.println(Artikel.preisschild[i]);
//		}
//	}
}