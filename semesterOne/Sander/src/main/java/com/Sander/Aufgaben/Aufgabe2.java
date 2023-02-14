package com.Sander.Aufgaben;

import java.util.Scanner;

public class Aufgabe2 {
  public static void main(String[] args) {
    int n, x, Gros, Schock, Dutzend, Stueck;
    System.out.print("Enter a number: ");
    Scanner in = new Scanner(System.in);
    n = in.nextInt();
    x = n;
    Gros = n / 144;
    n = n % 144;
    Schock = n / 60;
    n = n % 60;
    Dutzend = n / 12;
    n = n % 12;
    Stueck = n;
    System.out.println("Ausgangszahl: " + x);
    System.out.println("Gros: " + Gros);
    System.out.println("Schock: " + Schock);
    System.out.println("Dutzend: " + Dutzend);
    System.out.println("Stueck: " + Stueck);
    in.close();
  }
}
