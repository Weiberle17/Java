package aufgaben;

import java.util.Scanner;

public class Aufgabe_4 {

	public static void main(String[] args) {
		
	double K, Z, p = 0; 			//K = Kapital, Z = Zins, p = Zinssatz
	int T;			//T = Tage
	String j;		//j = Abfrage ja nein
	
	Scanner in = new Scanner (System.in);
	System.out.println("Geben Sie ihr Kapital ein: ");
	K = in.nextDouble();
	
	do {
		
		System.out.println("Wollen Sie ihren Zinssatz in Prozent angeben? ");
//		System.out.println("Ja = 1");
//		System.out.println("Nein = 2");
		j = in.next();
		
	} while (!j.equalsIgnoreCase("ja") && !j.equalsIgnoreCase("nein"));
	
		if (j.equalsIgnoreCase("ja")) {
		
			System.out.println("Geben Sie ihren Zinssatz in Prozent an ( mit , ) : ");
			p = in.nextDouble();
			p = p / 100;
	
			} else if (j.equalsIgnoreCase("nein")) {
		
				System.out.println("Geben Sie ihren Zinssatz als Dezimalzahl an ( mit , ): ");
				p = in.nextDouble();
		
			}
	
	System.out.println("Geben Sie an, f�r wie viele Tage Sie den Zins berechnet haben wollen (360 entsprechen einem Jahr): ");
	T = in.nextInt();
	
	Z = ((K * p) / 360) * T;
	
	System.out.println("Ihr Zins betr�gt: "+ Z);
	
	
	}

}
