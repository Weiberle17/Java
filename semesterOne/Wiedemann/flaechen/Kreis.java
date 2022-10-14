package flaechen;

public class Kreis implements Form {

	protected double radius;
	protected double fläche, umfang;

	public Kreis(double radius) {

		this.radius = radius;

		fläche = Math.PI * radius * radius;
		umfang = 2 * Math.PI * radius;

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
		System.out.println("Radius: " + radius);
		System.out.println("*****");
	}
}