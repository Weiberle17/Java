package tiere;

public class Siamkatze extends Hauskatze {

	{
		System.out.println("Kratzbaum_1");
	}

	Maus maus = new Maus();
	Maus spitzmaus = new Spitzmaus();

	static {
		System.out.println("Kratzbaum_2");
	}

	public Siamkatze() {
		System.out.println("Siamkatze");
	}

	public static void main(String[] args) {
		new Siamkatze();
	}
}