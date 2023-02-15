package com.GA.Project;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Daten {
  static int[] kunden;
  static int[] kosten;
  static int anzahlProjekte;
  static int budget;
  static double[] value;

  public static void einlesen(File file) {

    try {
      Scanner in = new Scanner(file);
      anzahlProjekte = in.nextInt();
      budget = in.nextInt();
      kunden = new int[anzahlProjekte];
      kosten = new int[anzahlProjekte];
      value = new double[anzahlProjekte];

      for (int i = 0; i < anzahlProjekte; i++) {
        kunden[i] = in.nextInt();
        kosten[i] = in.nextInt();
      }
      in.close();
    } catch (FileNotFoundException e) {
      System.out.println(e.getMessage() + " --- ");
    }
    sortieren();
  }

  public static void sortieren() {
    for (int i = 0; i < kunden.length; i++) {
      value[i] = (kunden[i] / (double) kosten[i]);
      insertSort();
    }
  }

  public static void insertSort() {
    double k;
    int l, m;
    for (int i = 0; i < kunden.length; i++) {
      for (int j = kunden.length - 1; j > 0; j--) {
        if ( value[j - 1] < value[j] ) {
          k = value[j];
          l = kunden[j];
          m = kosten[j];

          value[j] = value[j - 1];
          value[j - 1] = k;
          kunden[j] = kunden[j - 1];
          kunden[j - 1] = l;
          kosten[j] = kosten[j - 1];
          kosten[j - 1] = m;
        }
      }
    }
  }

  public static void ausgabe() {
    System.out.println(anzahlProjekte);
    System.out.println(budget);

    for (int i = 0; i < anzahlProjekte; i++) {
      System.out.println(i + " " + kunden[i] + " " + kosten[i] + " " + value[i]);
    }
  }
}
