package com.Sander.Aufgaben;

import java.util.Scanner;
public class Aufgabe16.1 {
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
    } while (t > 31 || m > 12 || t < 0);
    in.close();
  }

  public static void Rechner() {
    int[] Monate = {0,31,59,90,120,151,181,212,243,273,304,334,365};
    x = Monate[m-1] + t;
  }
  
  public static void Ausgabe() {
    System.out.println(x);
  }
}
