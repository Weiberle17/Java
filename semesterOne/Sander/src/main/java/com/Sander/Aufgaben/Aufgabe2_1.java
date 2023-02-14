package com.Sander.Aufgaben;

import java.util.Scanner;

public class Aufgabe2_1
{
  public static int n, x, Gros, Schock, Dutzend, Stueck;

  public static void main(String[] args) {
    Eingabe();
    Rechner();
    Ausgabe();
  }

  public static void Eingabe() {
    Scanner in = new Scanner(System.in);
    System.out.println("Bitte geben Sie eine beliebige natuerliche Zahl ein: ");
    n = in.nextInt();
    in.close();
  }

  public static void Rechner() {
    x = n;
    Gros = n / 144;
    n = n % 144;
    Schock = n / 60;
    n = n % 60;
    Dutzend = n / 12;
    n = n % 12;
    Stueck = n;
  }

  public static void Ausgabe() {
    System.out.println("Ausgangszahl: " + x);
    System.out.println("Gros: " + Gros);
    System.out.println("Schock: " + Schock);
    System.out.println("Dutzend: " + Dutzend);
    System.out.println("Stueck: " + Stueck);
  }
}
