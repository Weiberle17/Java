package aufgaben;

public class Aufgabe_7_2 {

	public static double x;
	public static long y;
	public static int q, w, e, r, t, z;
	public static String l = "", m = "X";
	
	public static void main(String[] args) {
		
		statistik();
		output();
		graphic();
		
	}

	
	public static void randomizer() {
		
		x = Math.random();
		
	}
	
	public static void rechner() {
		
		y = (int) ( x * 6 + 1);
		
	} 
	
	
	public static void output() {
		System.out.println(q);		
		System.out.println(w);
		System.out.println(e);
		System.out.println(r);
		System.out.println(t);
		System.out.println(z);
		
		//System.out.println( q + w + e + r + t + u );
	}

	public static void statistik() {
		
		for ( int i = 0; i < 1000; i++) {
			
			randomizer();
			rechner();
			sorter();
			
			}
	}
	
	public static void sorter() {
	
		if ( y == 1 ) {
			
			q += 1;
			
		} else if ( y == 2 ) {
			
			w += 1;
			
		} else if ( y == 3 ) {
			
			e += 1;
			
		} else if ( y == 4 ) {
			
			r += 1;
			
		} else if ( y == 5 ) {
			
			t += 1;
			
		} else if ( y == 6 ) {
			
			z += 1;
			
		}
	}
	
	public static void graphic() {
		
		for ( int i = 1; i <= q / 25; i ++) {
			
			l += m;
			
		}
		System.out.println(l);
		l = "";
		
		for ( int i = 1; i <= w / 25; i ++) {
				l += m;
			
		}
		System.out.println(l);
		l = "";
		
		for ( int i = 1; i <= e / 25; i ++) {
			
				l += m;
			
		}
		System.out.println(l);
		l = "";
		
		for ( int i = 1; i <= r / 25; i ++) {
			
				l += m;
			
		}
		System.out.println(l);
		l = "";
		
		for ( int i = 1; i <= t / 25; i ++) {
			
				l += m;
			
		}
		System.out.println(l);
		l = "";
		
		for ( int i = 1; i <= z / 25; i ++) {
			
			l += m;
			
		}
		System.out.println(l);
		l = "";
	}
}