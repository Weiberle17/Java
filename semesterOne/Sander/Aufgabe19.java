package aufgaben;
public class Aufgabe19 {
  public int Personalnummer;
  public String Nachname;
  public double Gehalt;
  public Aufgabe19(int Personalnummer) {
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
  public void setGehaltserhoehung(double Gehaltserhoehung) {
    Gehalt += Gehaltserhoehung;
  }
  public void Daten() {
    System.out.println("Personalnummer: " + Personalnummer);
    System.out.println("Nachname: " + Nachname);
    System.out.println("Gehalt: " + Gehalt);
  }
}
