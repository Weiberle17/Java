package aufgaben;
public class Aufgabe10 {
  public static int x = 0, i = 0, y = 1;
  public static void main(String[] args) {
    while ( y <= 8 ) {
      x++;
      System.out.printf("%3d", x);
      i++;
    if ( i == 7 ) {
        x++;
        System.out.printf("%3d\n", x);
        i = 0;
        x = y;
        y++;
      }
    }
  }
}
