package aufgaben;

import java.util.*;

public class Aufgabe_13 {

	public static String Typ, v, Sitze; 			//Typ , H�chstgeschwindigkeit, Sitze
	public static int Pk, Pp;						//Leistung in kW, Leistung in PS
	public static int j;							//Verf�gbarkeit
	public static boolean k;						//Verf�gbarkeit
	
	public static void Eingabe() {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Typ des Fahrzeugs: ");
		Typ = in.nextLine();
		System.out.println("H�chstgeschwindigkeit des Fahrzeugs: ");
		v = in.next();
		System.out.println("Leistung in kW: ");
		Pk = in.nextInt();
		Pp = (int) (Pk * 1.36);
		System.out.println("Anzahl der Sitzpl�tze: ");
		Sitze = in.next();
		System.out.println("1 = Fahrzeug verf�gbar");
		System.out.println("2 = Fahrzeug nicht verf�gbar");
		j = in.nextInt();
		
		if (j == 1) { 
			
			k = true;
			
		} else if (j == 2) {
			
			k = false;
			
		}
		
	}
	
	public static void Anzeige() {
		
		System.out.println("Typ des Fahrzeugs: " + Typ);
		System.out.println("H�chstgeschwindigkeit des Fahrzeugs: " + v);
		System.out.println("Leistung in kW und PS: " + Pk + "kW/" + Pp + "PS");
		System.out.println("Anzahl der Sitzpl�tze: " + Sitze);
		System.out.println("Verf�gbarkeit: " + k);
		System.out.println();
		
	}
	
	public static boolean ausleihbar() {
		
		return k;
		
	}
	
	public static void ausleihen() {
		
		if (k == false) {
			
			System.out.println("Das Fahrzeug " + Typ + " ist bereits verliehen.");
			System.out.println();
			
			
		} else {
			
			k = false;
			System.out.println("Das Fahrzeug " + Typ + " wurde verliehen.");
			System.out.println();
			
		}
	}
}
