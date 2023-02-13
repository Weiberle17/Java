package skriptAlgo;

public class binaryConverter {
	public int convertToDecimal(String binary) {
		int conversion = 1;
		// hier steht die passende Zweierpotenz
		int result = 0;
		for (int i = 1; i <= binary.length(); i++) {
			// Feld abarbeiten von hinten nach vorne
			if (binary.charAt(binary.length() - 1) == '1')
				result += conversion;
			// wenn Zeichen = ‘1‘ aktuelle Zweierpotenz aufsummieren
			conversion *= 2;
			// aktuelle Zweierpotenz verdoppeln
		}
		return result;
	}
	public static void main(String[] args) {
		binaryConverter c = new binaryConverter();
		System.out.println(c.convertToDecimal("0110100011"));
	}
}
