package aufgaben;
import java.util.Scanner;
public class Aufgabe11 {
  public static int x, q, w, e;
  public static void main(String[] args) {
    number();
    ziffern();
    teilen();
  }
  public static void number() {
    Scanner in = new Scanner(System.in);
    System.out.println("Geben Sie eine dreistellige natuerliche Zahl ein: ");
    x = in.nextInt();
  }
  public static void ziffern() {
    q = x % 10;
    System.out.println(q);
    w = (x / 10) % 10;
    System.out.println(w);
    e = (x / 100) % 10;
    System.out.println(e);
    if ( q == 0 || w == 0 || e == 0) {
      System.out.println("Das Teilen durch 0 ist nicht moeglich.");
    }
  }
  public static void teilen() {
    if ( x % q == 0 && x != 0) {
      System.out.println(x + " ist teilbar durch " + q);
    } else {
      System.out.println(x + " ist nicht teilbar durch " + q);
    }
    if ( x % w == 0 && x != 0) {
      System.out.println(x + " ist teilbar durch " + w);
    } else {
      System.out.println(x + " ist nicht teilbar durch " + w);
    }
    if ( x % e == 0 && x != 0) {
      System.out.println(x + " ist teilbar durch " + e);
    } else {
      System.out.println(x + " ist nicht teilbar durch " + e);
    }
  }
}
