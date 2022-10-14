package aufgaben;

public class Aufgabe_8_O {

	public static void main(String[] args) {
		
		int e = 0;
		double z = Math.random();
		int x = (int) (z * 6 + 1);
		z = Math.random();
		int y = (int) (z * 6 + 1);
		
		if ( x < y ) {
			e = y * 10 + x;
		} else if ( x > y ) {
			e = x * 10 + y;
		} else if ( x == y ) {
			e = (x * 10 + y) * 10;
		}
		
		if ( e == 21 ) {
			e = 1000;
		}
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(e);

	}

}
