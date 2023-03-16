package com.Sander.Aufgaben;

public class Parkhaus {
  private int plaetze = 10;

  public synchronized void einfahren(int autoNr) {
    while ( plaetze == 0 ) {
      try {
        wait();
      } catch (InterruptedException e) {
        System.out.println("InterruptedException!");
      }
    }
    plaetze--;
    System.out.println("Fahrzeug Nr. " + autoNr + " ist eingefahren. (" + getPlaetze() + " Plätze noch frei)");
  }

  public synchronized void ausfahren(int autoNr) {
    plaetze++;
    System.out.println("Fahrzeug Nr. " + autoNr + " ist ausgefahren. (" + getPlaetze() + " Plätze noch frei)");
    if (plaetze == 1) {
      notifyAll();
    }
  }

  public int getPlaetze() {
    return plaetze;
  }

  public static void main(String[] args) {
    Parkhaus p1 = new Parkhaus();

    for (int i = 0; i < 25; i++) {
      new Auto(i, p1);
    }
  }
}
