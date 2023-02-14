package com.Sander.Aufgaben;

import java.util.Scanner;

public class Aufgabe13 {
  public static String Typ, v, Sitze; // Typ , Hoechstgeschwindigkeit, Sitze
  public static int Pk, Pp; // Leistung in kW, Leistung in PS
  public static int j; // Verfuegbarkeit
  public static boolean k; // Verfuegbarkeit

  public void Eingabe() {
    Scanner in = new Scanner(System.in);
    System.out.println("Typ des Fahrzeugs: ");
    Typ = in.nextLine();
    System.out.println("Hoechstgeschwindigkeit des Fahrzeugs: ");
    v = in.next();
    System.out.println("Leistung in kW: ");
    Pk = in.nextInt();
    Pp = (int) (Pk * 1.36);
    System.out.println("Anzahl der Sitzplaetze: ");
    Sitze = in.next();
    System.out.println("1 = Fahrzeug verfuegbar");
    System.out.println("2 = Fahrzeug nicht verfuegbar");
    j = in.nextInt();
    if ( j == 1 ) {
      k = true;
    } else if ( j == 2 ) {
      k = false;
    }
    in.close();
  }

  public void Anzeige() {
    System.out.println("Typ des Fahrzeugs: " + Typ);
    System.out.println("Hoechstgeschwindigkeit des Fahrzeugs: " + v);
    System.out.println("Leistung in kW und PS: " + Pk + "kW/" + Pp + "PS");
    System.out.println("Anzahl der Sitzplaetze: " + Sitze);
    System.out.println("Verfuegbarkeit: " + k);
    System.out.println();
  }

  public boolean ausleihbar() {
    return k;
  }

  public void ausleihen() {
    if ( k == false ) {
      System.out.println("Das Fahrzeug " + Typ + " ist bereits verliehen.");
      System.out.println();
    } else {
      k = false;
      System.out.println("Das Fahrzeug " + Typ + " wurde verliehen.");
      System.out.println();
    }
  }
}
