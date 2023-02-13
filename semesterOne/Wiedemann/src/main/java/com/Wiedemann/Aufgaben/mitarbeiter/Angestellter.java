package mitarbeiter;

public class Angestellter extends Mitarbeiter {
	private static final int MAX_STUFE = 5;
	private int stufe;
	
	public Angestellter(String vname, String nname, double gehalt) {
		super(vname, nname, gehalt);
	}

	public void befoerdere() {
		if (stufe < MAX_STUFE) {
			stufe++;
			addZulage(500);
		}
	}
	
	public void zeigeDaten() {
		super.zeigeDaten();
		System.out.println("Stufe: " + stufe);
		System.out.println();
	}
	@Override
	public void addZulage(double betrag) {
		if (stufe >= 1) {
			gehalt += betrag;
		}
	}

//	@Override
//	protected void setPruefungen(int i) {	
//	}
}