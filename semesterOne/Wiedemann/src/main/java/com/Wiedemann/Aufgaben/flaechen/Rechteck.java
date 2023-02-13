package flaechen;

public class Rechteck implements Form {

	protected double länge, breite;
	protected double fläche, umfang;

	public Rechteck(double länge, double breite) {

		this.länge = länge;
		this.breite = breite;

		fläche = länge * breite;
		umfang = ( länge + breite ) * 2;
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
		System.out.println("Länge: " + länge);
		System.out.println("Breite: " + breite);
		System.out.println("*****");
	}
}