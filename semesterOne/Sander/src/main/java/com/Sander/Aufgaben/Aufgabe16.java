package com.Sander.Aufgaben;

import java.util.Scanner;

public class Aufgabe16 {
  public static int t, m, x;

  public static void main(String[] args) {
    Eingabe();
    Rechner();
    Ausgabe();
  }

  public static void Eingabe() {
    Scanner in = new Scanner(System.in);
    do {
      System.out.println("Geben Sie den Tag des gesuchten Datums ein: ");
      t = in.nextInt();
      System.out.println("Geben Sie den Monat des gesuchten Datums ein: ");
      m = in.nextInt();
    } while ( t > 31 || m > 12 || t < 0 );
    in.close();
  }

  public static void Rechner() {
    if ( m == 1 ) {
      x = t;
    } else if ( m == 2 ) {
      x = t + 31;
    } else if ( m == 3 ) {
      x = t + 59;
    } else if ( m == 4 ) {
      x = t + 90;
    } else if ( m == 5 ) {
      x = t + 120;
    } else if ( m == 6 ) {
      x = t + 151;
    } else if ( m == 7 ) {
      x = t + 181;
    } else if ( m == 8 ) {
      x = t + 212;
    } else if ( m == 9 ) {
      x = t + 243;
    } else if ( m == 10 ) {
      x = t + 273;
    } else if ( m == 11 ) {
      x = t + 304;
    } else if ( m == 12 ) {
      x = t + 334;
    }
  }

  public static void Ausgabe() {
    System.out.printf("Das Datum %02d.%02d", t, m);
    System.out.println(" ist genau der " + x + ". Tag des Jahres.");
  }
}
