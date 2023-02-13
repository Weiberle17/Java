package aufgaben;
public class Aufgabe7 {
  public static double x;
  public static long y;
  public static void main(String[] args) {
    randomizer();
    rechner();
    output();
  }
  public static void randomizer() {
    x = Math.random();
  }
  public static void rechner() {
    y = (int) ( x * 6 + 1 );
  }
  public static void output() {
    System.out.println(x);
    System.out.println(y);
  }
}
