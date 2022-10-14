package flaechen;

public class Flaechenverwaltung {

	double fläche, umfang;
	
	public static void main(String[] args) {
		
		Kreis k1 = new Kreis(3);
		
		k1.printInfo();
		
//		System.out.println("Kreis:");
//		System.out.println("Fläche: " + k1.getFläche());
//		System.out.println("Umfang: " + k1.getUmfang());

		
		Rechteck r1 = new Rechteck( 3, 4);
		
		r1.printInfo();
		
//		System.out.println();
//		System.out.println("Rechteck:");
//		System.out.println("Fläche: " + r1.getFläche());
//		System.out.println("Umfang: " + r1.getUmfang());

		Quadrat q1 = new Quadrat(4);

		q1.printInfo();
		
//		System.out.println();
//		System.out.println("Quadrat:");
//		System.out.println("Fläche: " + q1.getFläche());
//		System.out.println("Umfang: " + q1.getUmfang());
		
		Dreieck d1 = new Dreieck(6,5);
		
		d1.printInfo();
//		System.out.println();
//		System.out.println("Dreieck:");
//		System.out.println("Fläche: " + d1.getFläche());
//		System.out.println("Umfang: " + d1.getUmfang());
		
	}
}