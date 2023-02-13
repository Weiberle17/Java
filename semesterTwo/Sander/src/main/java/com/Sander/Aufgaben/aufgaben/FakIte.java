package aufgaben;

public class FakIte {
	private static long erg = 1;
	
	private static long fak(long x) {
		for (int i = 1; i <= x; i++) {
			erg *= i;
		}
		return erg;
	}
	public static void main(String[] args) {
		System.out.println(fak(7));
	}
}
