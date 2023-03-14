package com.Sander.Aufgaben;

public class Parkhaus {
  private int plaetze = 10;

  public synchronized void einfahren(int autoNr) {
    plaetze--;
    System.out.println("Fahrzeug Nr. " + autoNr + " ist eingefahren.");
    System.out.println("Es sind " + getPlaetze() + " Plätze frei.");
  }

  public synchronized void ausfahren(int autoNr) {
    plaetze++;
    System.out.println("Fahrzeug Nr. " + autoNr + " ist ausgefahren.");
    System.out.println("Es sind " + getPlaetze() + " Plätze frei.");
  }

  public int getPlaetze() {
    return plaetze;
  }

  public static void main(String[] args) {
    Parkhaus p1 = new Parkhaus();
    Auto[] autos = new Auto[10];

    for (int i = 0; i < autos.length; i++) {
      autos[i] = new Auto(i, p1);
    }
  }
}
