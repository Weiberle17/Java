package com.GA.Project;

import java.io.File;

public class Test {
  public static void main(String[] args) {
    Daten.einlesen(new File("Inst2_10000.txt"));
    Daten.ausgabe();
  }
}
