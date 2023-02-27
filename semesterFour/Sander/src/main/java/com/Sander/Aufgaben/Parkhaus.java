package com.Sander.Aufgaben;

public class Parkhaus {
  private int plaetze = 10;

  public Parkhaus() {
  }

  public void einfahren() {
    plaetze--;
  }

  public void ausfahren() {
    plaetze++;
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
