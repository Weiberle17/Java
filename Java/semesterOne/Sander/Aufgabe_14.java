package aufgaben;

import java.util.*;

public class Aufgabe_14 {
	
	public static int x;
	public static boolean y;

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Dies ist ein Schaltjahrbestimmer.");
		System.out.println("Geben Sie eine beliebige Jahreszahl ein: ");
		x = in.nextInt();
		
		if (x % 4 == 0) {
			
			y = true;
			
		}
		
		if (x % 100 == 0) {
			
			y = false;
			
		}
		if (x % 400 == 0) {
			
			y = true;
			
		}
		
		if ( y == true ) {
		
			System.out.println("Das Jahr " + x + " ist ein Schaltjahr.");
		
		} else {
			
			System.out.println("Das Jahr " + x + " ist kein Schaltjahr.");
			
		}
	}
}
