package aufgaben;


import java.util.Scanner;

public class Aufgabe_2_2 {
	
	public static int n, x, Gros, Schock, Dutzend, Stück;
	
	public static void main(String[] args) {
		
		Eingabe();
		Rechner();
		Ausgabe();
		
	}
	
	public static void Eingabe() {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Bitte geben Sie eine beliebige natürliche Zahl ein: ");
		n = in.nextInt();
		
	}
	
	public static void Rechner() {
		
		x = n;
		
		Gros = n / 144;
		n = n % 144;
		
		Schock = n / 60;
		n = n% 60;
		
		Dutzend = n / 12;
		n = n % 12;
		
		Stück = n;
		
	}
	
	public static void Ausgabe() {
		
		System.out.println("Ausgangszahl: " + x);
		System.out.println("Gros: " + Gros);
		System.out.println("Schock: " + Schock);
		System.out.println("Dutzend: " + Dutzend);
		System.out.println("Stück: " + Stück);
		
	}
}
