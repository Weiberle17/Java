package mitarbeiter;

public abstract class Mitarbeiter {
	protected String nname, vname;
	protected double gehalt;
	
	public Mitarbeiter (String vname, String nname, double gehalt) {
		this.vname = vname;
		this.nname = nname;
		this.gehalt = gehalt;
	}
	
	public void erhoeheGehalt (double betrag) {
		gehalt += betrag;
	}
	
	public void zeigeDaten() {
		System.out.println(getClass().getSimpleName());
		System.out.println("Vorname: " + vname);
		System.out.println("Nachname: " + nname);
		System.out.println("Gehalt: " + gehalt);
	}
	
	public abstract void addZulage(double betrag);

//	protected abstract void setPruefungen(int i);
//
//	protected abstract void befoerdere();
}