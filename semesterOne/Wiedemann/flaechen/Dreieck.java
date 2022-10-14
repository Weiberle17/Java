package flaechen;

public class Dreieck implements Form {

	protected double ankathete, gegenkathete;
	protected double fläche, umfang;

	public Dreieck( double ankathete, double gegenkathete) {

		this.ankathete = ankathete;
		this.gegenkathete = gegenkathete;

		fläche = (ankathete * gegenkathete) / 2;
		umfang = ankathete + gegenkathete + (Math.sqrt(((ankathete * ankathete) + (gegenkathete * gegenkathete)))); 
	}

	@Override
	public double getFläche() {
		return fläche;
	}

	@Override
	public double getUmfang() {
		return umfang;
	}

	@Override
	public void printInfo() {
		System.out.println("*****");
		System.out.println(getClass().getSimpleName());
		System.out.println("Fläche: " + getFläche());
		System.out.println("Umfang: " + getUmfang());
		System.out.println("Ankathete: " + ankathete);
		System.out.println("Gegenkathete: " + gegenkathete);
		System.out.println("*****");
	}
}