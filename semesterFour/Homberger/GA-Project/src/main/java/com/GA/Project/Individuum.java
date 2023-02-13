package com.GA.Project;

public class Individuum {
  int[] bits;
  int fitness;

  public Individuum(int anzahlProjekte) {
    bits = new int[anzahlProjekte];
    initialisieren();
  }

  public void initialisieren() {
    for (int i = 0; i < bits.length; i++) {
      bits[i] = 0;
      if ( Math.random() < 0.5 ) {
        bits[i] = 1;
      }
    }
  }

  public void ausgabe() {
    for (int i = 0; i < bits.length; i++) {
      System.out.println(bits[i]);
    }
  }
}
