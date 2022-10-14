package aufgaben;

import java.util.Scanner;

public class Aufgabe_5 {

	public static void main(String[] args) {
		
		double x, y, z;
		
		Scanner in = new Scanner (System.in);
		
		System.out.println("Dies ist ein Median berechner für drei Zahlen.");
		System.out.println("Geben Sie die erste beliebige Zahl an: ");
		x = in.nextDouble();
		
		System.out.println("Geben Sie die zweite Zahl ein: ");
		y = in.nextDouble();
		
		System.out.println("Geben Sie die dritte beliebige Zahl an: ");
		z = in.nextDouble();
		
		if ( x < y & y < z || z < y & y < x){
			
			System.out.println("Ihr Median ist: " + y); 
		
		} else if (y < x & x < z || z < x & x < y)	{
			
			System.out.println("Ihr Median ist: " + x);
			
		} else if (x < z & z < y || y < z & z < x) {
			
			System.out.println("Ihr Median ist: " + z);
			
		}
	}

}
