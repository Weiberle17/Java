package aufgaben;
import java.util.Scanner;
public class Aufgabe12 {
  public static long x;
  public static double J, M, W, T, St, Min, Sek;
  public static void main(String[] args) {
    eingabe();
    rechner();
    ausgabe();
  }
  public static void eingabe() {
    Scanner in = new Scanner(System.in);
    System.out.println("Geben Sie eine natuerliche Zahl an Sekunden ein:");
    x = in.nextLong();
  }
  public static void rechner() {
    J = x / 31557600;
    M = x / 2629800;
    W = x / 604800;
    T = x / 86400;
    St = x / 3600;
    Min = x / 60;
    Sek = x;
  }
  public static void ausgabe () {
    System.out.println( x + " Sekunden entsprechen: ");
    System.out.println( J + " Jahren");
    System.out.println( M + " Monate");
    System.out.println( W + " Wochen");
    System.out.println( T + " Tagen");
    System.out.println( St + " Stunden");
    System.out.println( Min + " Minuten");
    System.out.println("und natuerlich " + Sek + " Sekunden");
  }
}
