package flaechen;

public class Quadrat implements Form {

	protected double breite;
	protected double fläche, umfang;

	public Quadrat (double breite) {

		this.breite = breite;

		fläche = breite * breite;
		umfang = breite * 4;

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
		System.out.println("Breite: " + breite);
		System.out.println("*****");
	}
}