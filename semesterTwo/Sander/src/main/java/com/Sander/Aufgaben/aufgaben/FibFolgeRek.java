package aufgaben;

public class FibFolgeRek {

	private static int fib(int i) {
		if (i > 1) {
			return (fib(i - 1) + fib(i-2));
		} else if (i == 1 ) {
			return 1;
		}else {
			return 0;
		}
	}
	public static void main(String[] args) {
		System.out.println(fib(9));
	}
}
