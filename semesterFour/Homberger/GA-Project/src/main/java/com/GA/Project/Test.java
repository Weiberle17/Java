package com.GA.Project;

import java.io.File;

public class Test {
  public static void main(String[] args) {
    Daten.einlesen(new File("Inst1_100_1000.txt"));
    Daten.ausgabe();
  }
}
