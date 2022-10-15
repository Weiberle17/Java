package aufgaben;

import java.util.*;

public class Test_Sander {

  public static void main(String[] args) {

    tabnine();

  }
  public static void ArithmOp() {

    int z = 13, n = 5, a = 5;

    System.out.println("z / n: " + z / n);
    System.out.println("z % n: " + z % n);
    System.out.println("++a: " + ++a + " a: " + a);
    System.out.println("a++: " + a++ + " a: " + a);
    System.out.println("--a: " + --a + " a: " + a);
    System.out.println("a--: " + a-- + " a: " + a);

  }

  public static void LogOp() {

    int a = 2, b = 3;

    System.out.println(a == 2 && b < 8);
    System.out.println(a != 2 || !(b < 2));
    System.out.println(a == 2 ^ b > 0);

  }

  public static void CastOp() {

    double z;
    int x = 5, y = 3;
    z = x / y;
    System.out.println(z);
    z = (double) x / y;
    System.out.println(z);

    long a = 9123456789123456789L;
    System.out.println(a);
    double b = a;
    long c = (long) b;
    System.out.println(c);

  }

  public static void IfTest() {

    int zahl = 8;

    if ( zahl == 6 || zahl == 8)
    System.out.println("Knapp daneben");
    else if ( zahl == 7 )
    System.out.println("Treffer");
    else
    System.out.println("Weit daneben");

  }

  public static void SwitchTest() {

    int zahl = 8;

    switch (zahl) {

      case 8:
      case 6:
      System.out.println("Knapp daneben");
      break;

      case 7:
      System.out.println("Treffer");
      break;

      default:
      System.out.println("Weit daneben");

    }
  }

  public static void WhileTest() {

    int zahl = 100, summe = 0, i = 1;

    while (i <= zahl) {
      summe += i;
      i++;
    }

    System.out.println("Summe 1 bis " + zahl + ": " + summe);

  }

  public static void WhileTest2() {

    int zahl = 100, summe = 0, i = 1;

    do {

      summe += i;
      i++;

    }while ( i <= zahl );

    System.out.println("Summe 1 bis " + zahl + ": " + summe);
  }

  public static void ForTest() {

    int zahl = 100, summe = 0;

    for (int i = 1; i <= zahl; i++) {

      summe += i;

      System.out.println("Summe 1 bis " + zahl + ": " + summe);
    }

  }

  public static void Bonbons1() {

    double budget = 1.;
    int anzahl = 0;

    for ( double preis = 0.1; budget >= preis; preis += 0.1) {

      budget -= preis;
      anzahl++;

    }

    System.out.println(anzahl + " Bonbons gekauft");
    System.out.println("Restgeld: " + budget);

  }

  public static void Bonbons2() {

    int budget = 100, anzahl = 0;

    for ( int preis = 10; budget >= preis; preis += 10) {

      budget -= preis;
      anzahl++;

    }

    System.out.println(anzahl + " Bonbons gekauft");
    System.out.println("Restgeld: " + budget);

  }

  public static void Maximum() {

    double x, y, z;

    Scanner in = new Scanner(System.in);
    System.out.println("Geben Sie die erste Zahl ein: ");
    x = in.nextDouble();
    System.out.println("Geben Sie die zweite Zahl ein: ");
    y = in.nextDouble();
    System.out.println("Geben Sie die dritte Zahl ein: ");
    z = in.nextDouble();

    if (x >= y && x >= z) {

      System.out.println(x);

    } else if (y >= x && y >= z) {

      System.out.println(y);

    } else if (z >= x && z >= y) {

      System.out.println(z);

    }
  }

  /*public static void Eingabe() {

    System.out.println("Eingabe Integer");
    int i1 = Integer.parseInt(args [0]);
    System.out.println("Eingegeben: " + i1);
    System.out.println("Eingabe Double");
    double d1 = Double.parseDouble(args[1]);
    System.out.println("Eingegeben: " + d1);
    System.out.println("Eingabe Zeichenfolge");
    String s1 = args[2];
    System.out.println("Eingegeben: " + s1);
    System.out.println("Zeichen aus der Zeichenfolge ausschneiden $ hier 1 Zeichen am Anfang!");
    String s2 = s1.substring(0,1);
    System.out.println("1. Buchstabe: " + s2);
    if (s2.equals("d")) System.out.println("d gefunden");

  }*/

  public static void ArrayTest1() {

  int[] zahlen = new int[10];
    for (int i = 0; i < zahlen.length; i++) {
      zahlen[i] = i * 100;
    }
    for (int i = 0; i < zahlen.length; i++) {
      System.out.print(zahlen[i] + " ");
    }
    // andere (kuerzere, aber evtl. verwirrende) Variante
    // for (int zahl : zahlen) {
    // System.out.print(zahl + " ");
    // }
    System.out.println();
    String[] tage =
    {"Mo", "Di", "Mi", "Do", "Fr", "Sa", "So"};
    for (int i = 0; i < tage.length; i++) {
      System.out.print(tage[i] + " ");
    }
    // andere (kuerzere, aber evtl. verwirrende) Variante
    // for (String tag : tage) {
    // System.out.print(tag + " ");
    // }
    System.out.println();

  }		

  public static void ArrayTest2() {

    int[] zahlen = new int[10];
    for (int i = 0; i < zahlen.length; i++) {
      zahlen[i] = i * 100;
    }
    for (int zahl : zahlen) {
      System.out.print(zahl + " ");
    }

    System.out.println();

    String[] tage =
    {"Mo", "Di", "Mi", "Do", "Fr", "Sa", "So"};
    for (String tag : tage) {
      System.out.print(tag + " ");
    }

    System.out.println();

  }

  public static void ScannerTest() {

    String x;

    Scanner in = new Scanner(System.in);

    x = in.nextLine();

    System.out.println(x);

    in.close();

  }

  public static void tabnine() {

    System.out.println("tabnine");

  }
}
