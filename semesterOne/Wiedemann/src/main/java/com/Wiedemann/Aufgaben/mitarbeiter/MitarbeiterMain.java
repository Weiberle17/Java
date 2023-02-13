package mitarbeiter;

public class MitarbeiterMain {
	
	public static void main(String[] args) {
		Mitarbeiter A1 = new Azubi("Serkan", "Arslan", 900);
		Mitarbeiter A2 = new Angestellter("Max", "Weiberle", 2000);
		
		A1.zeigeDaten();
		A2.zeigeDaten();
		
		((Azubi) A1).setPruefungen(4);
		((Angestellter) A2).befoerdere();
		
		A1.zeigeDaten();
		A2.zeigeDaten();
	}
}