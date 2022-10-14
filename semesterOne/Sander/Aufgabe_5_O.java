package aufgaben;

public class Aufgabe_5_O {

	public static void main(String[] args) {
		
		double x = 5, y = 7, z = 3;
		
		if ( x < y & y < z || z < y & y < x){
			
			System.out.println("Ihr Median ist: " + y); 
		
		} else if (y < x & x < z || z < x & x < y)	{
			
			System.out.println("Ihr Median ist: " + x);
			
		} else if (x < z & z < y || y < z & z < x) {
			
			System.out.println("Ihr Median ist: " + z);
			
		}
	}

}

