package aufgaben;

public class Aufgabe_19 {
	
	public int Personalnummer;
	public String Nachname;
	public double Gehalt;

	public Aufgabe_19(int Personalnummer) {
		
		this.Personalnummer = Personalnummer;
		
	}
	public void setPersonalnummer(int Personalnummer) {
		
		this.Personalnummer = Personalnummer;
		
	}
	
	public int getPersonalnummer() {
		
		return Personalnummer;
		
	}
	
	public void setNachname(String Nachname) {
		
		this.Nachname = Nachname;
		
	}
	
	public String getNachname() {
		
		return Nachname;
		
	}
	
	public void setGehalt(double Gehalt) {
		
		this.Gehalt = Gehalt;
		
	}
	
	public double getGehalt() {
		
		return Gehalt;
		
	}
	
	public void setGehaltserh�hung(double Gehaltserh�hung) {
		
		Gehalt += Gehaltserh�hung;
		
	}
	
	public void Daten() {
		
		System.out.println("Personalnummer: " + Personalnummer);
		System.out.println("Nachname: " + Nachname);
		System.out.println("Gehalt: " + Gehalt);
		
	}
}
