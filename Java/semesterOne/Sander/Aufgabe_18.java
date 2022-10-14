package aufgaben;

import java.util.*;

public class Aufgabe_18 {
	
	public static int h, s, t;
	public static String a = "*", b = "";

	public static void main(String[] args) {
		
		Eingabe();
		Tanne();
		Stamm();

	}

	public static void Eingabe() {
		
		Scanner in = new Scanner(System.in);
		
		do {
		
			System.out.println("Geben Sie die Höhe des Baumes ein: ");
			h = in.nextInt();
		
			System.out.println("Geben Sie die Höhe des Stammes ein: ");
			s = in.nextInt();
			
		} while (h < s || h - s < 2);
		
		in.close();
		
	}
	
	public static void Tanne() {
		
		t = h - s;
		
		for (int i = 0; i < t; i++) {
		
			System.out.printf("%50s%s\n", a, b);
			
			a = a + "*";
			b = b + "*";
			}		
		}
	
	public static void Stamm() {
		
		for (int i =0; i < s; i++) {
			
			a = "*";
			System.out.printf("%50s\n", a);
			
		}
	}
}
