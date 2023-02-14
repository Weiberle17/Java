package com.GA.Project;

public class Individuum {
  int[] bits;
  int fitness;

  public Individuum() {
    bits = new int[Daten.anzahlProjekte];
  }

  public void crossover(Individuum papa, Individuum mama) {
    // NICHT FERTIG!!!!!!!!

    int trennstelle = (int) (Math.random() * bits.length);
    for (int i = 0; i < trennstelle; i++) {
      bits[i] = papa.bits[i];
    }
    for (int i = trennstelle; i < bits.length; i++) {
      bits[i] = mama.bits[i];
    }
  }


  public void fitnessBerechnen() {
    // Anpassung eines GA an das Problem
    fitness = 0;
    for (int i = 0; i < bits.length; i++) {
      fitness += bits[i];
    }
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
      System.out.print(bits[i]);
    }
    System.out.print(" " + fitness);
    System.out.println();
  }

  public void reproduzieren(Individuum vorlage) {
    for (int i = 0; i < bits.length; i++) {
      this.bits[i] = vorlage.bits[i];
    }
    this.fitness = vorlage.fitness;
  }

}
