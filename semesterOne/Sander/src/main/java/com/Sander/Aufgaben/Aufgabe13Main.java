package com.Sander.Aufgaben;

public class Aufgabe13Main {
  public static void main(String[] args) {
    Aufgabe13 Auto1 = new Aufgabe13();
    Aufgabe13 Auto2 = new Aufgabe13();
    Aufgabe13 Auto3 = new Aufgabe13();
    Auto1.Eingabe();
    Auto2.Eingabe();
    Auto3.Eingabe();
    Auto1.Anzeige();
    boolean k = Auto1.ausleihbar();
    System.out.println("Verfuegbarkeit: " + k);
    System.out.println();
    Auto1.ausleihen();
  }
}
