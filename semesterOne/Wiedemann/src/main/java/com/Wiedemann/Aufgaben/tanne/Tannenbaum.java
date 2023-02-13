package tanne;

import java.util.*;

public class Tannenbaum {
	
	public static String[] tanneL, tanneR;
	public static int h, s, t, d;
	public static String a = "*", b = "";

	public static void main(String[] args) {
		Eingabe();
		Tanne();
		Stamm();
		Ausgabe();
	}

	public static void Eingabe() {
		Scanner in = new Scanner(System.in);
		do {
			System.out.println("Geben Sie die Höhe des Baumes ein: ");
			h = in.nextInt();
			System.out.println("Geben Sie die Höhe des Stammes ein: ");
			s = in.nextInt();
		} while (h < s || (h - s) < 2);
		do {
			System.out.println("Gebe Sie die Breite des Stammes ein (Nur ungerade Zahlen): ");
			d = in.nextInt();
		} while (d > (h - s) || d % 2 == 0);
		in.close();
		tanneL = new String[h];
		tanneR = new String[h];
	}
	
	public static void Tanne() {	
		t = h - s;
		for (int i = 0; i < t; i++) {
			tanneL[i] = a;
			tanneR[i] = b;
//			System.out.printf("%50s%s\n", a, b);
			a = a + "*";
			b = b + "*";
			}		
		}
	
	public static void Stamm() {	
		a = "*";
		b = "";
		for (int j = 0; j < (d/2); j++) {
			a = a + "*";
			b = b + "*";
		}
		for (int i = 0; i < s; i++) {
			tanneL[t] = a;
			tanneR[t] = b;
			t++;
//			System.out.printf("%50s%s\n", a, b);
		}
	}
	
	public static void Ausgabe() {
		for ( int i = 0; i < tanneL.length; i++) {
			System.out.print(String.format("%50s%s\n", tanneL[i], tanneR[i]));
		}
	}
}