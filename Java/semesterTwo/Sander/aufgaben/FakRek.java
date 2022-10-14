package aufgaben;

public class FakRek {
	public static long fak(long x) {
		if (x > 1) {
			return (x * fak(x - 1));
		} else {
			return 1;
		}
	}
	public static void main(String[] args) {
		System.out.println(fak(7));
	}
}
