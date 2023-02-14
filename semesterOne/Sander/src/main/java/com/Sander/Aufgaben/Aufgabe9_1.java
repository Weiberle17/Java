package com.Sander.Aufgaben;

public class Aufgabe9_1 {
  public static int x = -1, i;

  public static void main(String[] args) {
    generator();
  }

  public static void generator() {
    while ( x < 999 ) {
      while ( i < 7 ) {
        i++;
        x++;
        System.out.printf("%03d ", x);
      }
      while ( i == 7 ) {
        x++;
        System.out.printf("%03d\n ", x);
        i = 0;
      }
    }
  }
}
