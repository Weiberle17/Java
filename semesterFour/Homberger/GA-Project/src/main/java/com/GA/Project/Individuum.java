package com.GA.Project;

public class Individuum {
  int[] bits;
  int fitness;

  public Individuum() {
    bits = new int[Daten.anzahlProjekte];
  }

  // TODO: Überarbeiten Crossover
  public void crossover(Individuum papa, Individuum mama) {
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
    int tempBudget = Daten.budget;
    fitness = 0;
    for (int i = 0; i < bits.length; i++) {
      if ( (bits[i] == 1) && (tempBudget - Daten.kosten[i] >= 0) ) {
        tempBudget -= Daten.kosten[i];
        fitness += Daten.kunden[i];
      }
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
    // for (int i = 0; i < bits.length; i++) {
    //   System.out.print(bits[i]);
    // }
    System.out.print("Best: " + fitness);
    System.out.println();
  }

  public void reproduzieren(Individuum vorlage) {
    for (int i = 0; i < bits.length; i++) {
      this.bits[i] = vorlage.bits[i];
    }
    this.fitness = vorlage.fitness;
  }

  public void mutieren() {
    if ( Math.random() > 0.3 ) {
      int stelle = (int) Math.random() * bits.length;
      if ( bits[stelle] == 0 ) {
        bits[stelle] = 1;
      } else {
        bits[stelle] = 0;
      }
    }
  }
}
