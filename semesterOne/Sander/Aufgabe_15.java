package aufgaben;

import java.util.*;

public class Aufgabe_15 {

	public static double K, Z, R, z, r;	//Kredithoehe, Zinssat, monatliche Rate, Laufzeit des Kredits, Zinsen, Tilgung
	public static int i, L;
	
	public static void main(String[] args) {
		
		Eingabe();
		
		while (i < L && K >= 0) {
		
			i++;
			Rechner();
			Ausgabe();
						
		}

	}
	
	public static void Eingabe() {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Geben Sie die Kredithoehe ein: ");
		K = in.nextDouble();
		
		System.out.println("Geben Sie den Zinssatz in Prozent ein: ");
		Z = in.nextDouble();
		
		System.out.println("Geben Sie die monatliche Rate ein: ");
		R = in.nextDouble();
		
		System.out.println("Geben Sie die Laufzeit des Kredits in Jahren ein: ");
		L = in.nextInt();
				
	}
	
	public static void Rechner() {
		
		z = K * (Z / 100);
		
		r = R * 12;
		
		K = K + z - r;
		
	}

	public static void Ausgabe() {
		
		if (K >= 0) {
		
			System.out.println("Fuer das " + i + ". Jahr fallen " + z + " $ Zinsen an");
			System.out.println("Im " + i + ". Jahr werden " + r + " $  abbezahlt");
			
			if (i == 1) {
			
				System.out.println("Nach einem Jahr bleiben " + K + " $ Schulden uebrig");
		
			}else {
				
				System.out.println("Nach " + i + " Jahren bleiben " + K + " $ Schulden uebrig");
			}
		} else {
			
			if (i == 1) {
			
				System.out.println("Das Darlehen ist bereits nach einem Jahr abbezahlt");
				
			}else {
			
				System.out.println("Das Darlehen ist bereits nach " + i + " Jahren abbezahlt.");
			
			}
		}
	}
}
