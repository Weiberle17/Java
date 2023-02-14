package com.GA.Project;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Daten {
  static int[] kunden;
  static int[] kosten;
  static int anzahlProjekte;
  static int budget;

  public static void einlesen(File file) {

    try {
      Scanner in = new Scanner(file);
      anzahlProjekte = in.nextInt();
      budget = in.nextInt();
      kunden = new int[anzahlProjekte];
      kosten = new int[anzahlProjekte];

      for (int i = 0; i < anzahlProjekte; i++) {
        kunden[i] = in.nextInt();
        kosten[i] = in.nextInt();
      }
      in.close();
    } catch (FileNotFoundException e) {
      System.out.println(e.getMessage() + " --- ");
    }
  }

  public static void ausgabe() {
    System.out.println(anzahlProjekte);
    System.out.println(budget);

    for (int i = 0; i < anzahlProjekte; i++) {
      System.out.println(i + " " + kunden[i] + " " + kosten[i]);
    }
  }
}
