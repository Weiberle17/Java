package com.Sander.Aufgaben;

import java.util.Scanner;

public class Aufgabe3 {
  public static void main(String[] args) {
    double PI, r, A, U;
    PI = Math.PI;
    Scanner in = new Scanner(System.in);
    System.out.println("Geben Sie den Radius des Kreises ein: ");
    r = in.nextDouble();
    A = PI * r * r;
    U = 2 * PI * r;
    System.out.println("Flaeche: " + A);
    System.out.println("Umfang: " + U);
    in.close();
  }
}
