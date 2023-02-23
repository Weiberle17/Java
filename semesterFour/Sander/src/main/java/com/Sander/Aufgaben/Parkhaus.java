package com.Sander.Aufgaben;

public class Parkhaus {
  private int plaetze = 10;

  public Parkhaus() {
    Auto[] autos = new Auto[10];

    for (int i = 0; i < autos.length; i++) {
      autos[i] = new Auto(i);
    }
  }

  public static void main(String[] args) {
    new Parkhaus();
  }
}
