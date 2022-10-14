package aufgaben;

public class Bubblesort {

	private int[] bsort(int[] zahlen) {
		int[] ergebnis = zahlen;
		int counter;
		for (int j = 1; j < ergebnis.length; j++) {
			counter = 0;
			//Modifikation 2 (Wechsel der Sortierrichtung)
			if (j % 2 == 0) {
				for (int i = ergebnis.length - 1; i > 0; i--) {
					if (ergebnis[i] < ergebnis[i - 1]) {
						int x = ergebnis[i];
						int y = ergebnis[i - 1];
						ergebnis[i] = y;
						ergebnis[i - 1] = x;
						counter++;
					}
				}
				System.out.println(java.util.Arrays.toString(ergebnis));
			} else {
				for (int i = 0; i < ergebnis.length - 1; i++) {
					if (ergebnis[i] > ergebnis[i + 1]) {
						int x = ergebnis[i];
						int y = ergebnis[i + 1];
						ergebnis[i] = y;
						ergebnis[i + 1] = x;
						counter++;
					}
				}
				System.out.println(java.util.Arrays.toString(ergebnis));
			}
			//Modifikation 1 (Ende, wenn kein Schritt mehr ausgeführt wird)
			if (counter == 0) {
				return ergebnis;
			}
		}
		return ergebnis;
	}

	public static void main(String[] args) {
		int[] zahlen = { 6, 8, 11, 3, 12, 4, 2, 1 };
		Bubblesort s1 = new Bubblesort();
		System.out.println(java.util.Arrays.toString(s1.bsort(zahlen)));
	}
}