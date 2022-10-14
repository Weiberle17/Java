package mitarbeiter;

public class Azubi extends Mitarbeiter {
	private int abgelegtePruefungen;
	
	public Azubi (String vname, String nname, double gehalt) {
		super(vname, nname, gehalt);
	}
	
	public void setPruefungen(int anzahl) {
		this.abgelegtePruefungen = anzahl;
		addZulage(300);
	}
	
	public void zeigeDaten() {
		super.zeigeDaten();
		System.out.println("Anzahl der abgelegten Prüfungen: " + abgelegtePruefungen);
		System.out.println();
	}
	@Override
	public void addZulage(double betrag) {
		if (abgelegtePruefungen > 3) {
			gehalt += betrag;
		}
	}

//	@Override
//	protected void befoerdere() {	
//	}
}