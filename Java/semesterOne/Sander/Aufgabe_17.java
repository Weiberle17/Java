package aufgaben;

public class Aufgabe_17 {

	public static void main(String[] args) {
	
		int y;
		int[] rot = 	{ 1, 2, 3, 4, 5, 6};
		int[] blau =	{ 1, 2, 3, 4, 5, 6};
		int[] gelb = 	{ 1, 2, 3, 4, 5, 6};
		int[] grün = 	{ 1, 2, 3, 4, 5, 6};
		
		for (int i = 0; i < 6; i++) {
			
			y = rot[i] + blau[0] + gelb[0] + grün[0];
			//System.out.println(y);
			
			for (int o = 0; o < 6; o++) {
				
				y = rot[i] + blau[o] + gelb[0] + grün[0];
				//System.out.println(y);
				
				for (int p = 0; p < 6; p++) {
					
					y = rot[i] + blau[o] + gelb[p] + grün[0];
					//System.out.println(y);
				
					for (int ü = 0; ü < 6; ü++) {
						
						y = rot[i] + blau[o] + gelb[0] + grün[ü];
						System.out.println(y);
					
					}
				}
			}
		}
	}
}
