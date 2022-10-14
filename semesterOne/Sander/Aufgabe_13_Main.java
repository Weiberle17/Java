package aufgaben;

public class Aufgabe_13_Main {

	public static void main(String[] args) {
	
		Aufgabe_13 Auto1 = new Aufgabe_13();
		Aufgabe_13 Auto2 = new Aufgabe_13();
		Aufgabe_13 Auto3 = new Aufgabe_13();
		
		Auto1.Eingabe();
		//Auto2.Eingabe();
		//Auto3.Eingabe();
		
		Auto1.Anzeige();
		
		boolean k = Auto1.ausleihbar();
		System.out.println("Verfügbarkeit: " + k);
		System.out.println();
		
		Auto1.ausleihen();
		
	}
}
