package com.GA.Project;

import java.io.File;

public class GA {
  public static void main(String args[]) {
    Daten.einlesen(new File("Inst1_100_1000.txt"));
    // Daten.ausgabe();

    int popSize = 400;
    int anzahlIterationen = 100;
    Individuum[] pop = new Individuum[popSize];
    Individuum[] nachkommen = new Individuum[popSize];
    Individuum best = new Individuum();

    ///////////////////////////////////////////////
    best.initialisieren();
    best.fitnessBerechnen();
    for (int i = 0; i < pop.length; i++) {
      pop[i] = new Individuum();
      pop[i].initialisieren();
      pop[i].fitnessBerechnen();
    }
    bestIndividuumAktualisieren(pop, best);
    System.out.println(0 + " " + best.fitness);

    ///////////////////////////////////////////////

    for (int iter = 0; iter < anzahlIterationen; iter++) {
      for (int i = 0; i < nachkommen.length; i++) {
        int elter1 = selektieren(pop)[0];
        int elter2 = selektieren(pop)[1];

        nachkommen[i] = new Individuum();
        nachkommen[i].crossover(pop[elter1], pop[elter2]);

        nachkommen[i].mutieren();
        nachkommen[i].fitnessBerechnen();
      }

      pop = nachkommen;
      nachkommen = new Individuum[popSize];
      bestIndividuumAktualisieren(pop, best);
      System.out.println(pop[iter].fitness);
    }
    best.ausgabe();
  }

  public static int[] selektieren(Individuum[] liste) {
    int[] twoBest = {0, 0};
    for (int i = 0; i < liste.length; i++) {
      if ( liste[i].fitness > liste[twoBest[0]].fitness ) {
        twoBest[1] = twoBest[0];
        twoBest[0] = i;
      }
    }
    System.out.println(twoBest[0]);
    return twoBest;
  }

  public static void bestIndividuumAktualisieren(Individuum[] liste, Individuum best) {
    for (int i = 0; i < liste.length; i++) {
      if ( liste[i].fitness > best.fitness ) {
        best.reproduzieren(liste[i]);
      }
    }
  }
}
