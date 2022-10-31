package aufgaben;
public class Aufgabe8 {
  public static int x, y, e;
  public static double z;
  public static void main(String[] args) {
    wuerfel();
    sorter();
    output();
  }
  public static void wuerfel() {
    z = Math.random();
    x = (int) (z * 6 + 1);
    z = Math.random();
    y = (int) (z * 6 + 1);
  }
  public static void sorter() {
    if ( x < y ) {
      e = y * 10 + x;
    } else if ( x > y ) {
      e = x * 10 + y;
    } else if ( x == y ) {
      e = (x * 10 + y) * 10;
    }
    if ( e == 21 ) {
      e = 1000;
    }
  }
  public static void output() {
    System.out.println(x);
    System.out.println(y);
    System.out.println(e);
  }
}
