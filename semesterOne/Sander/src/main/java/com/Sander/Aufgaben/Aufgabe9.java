package aufgaben;
public class Aufgabe9 {
  public static String q = " ";
  public static int x = 0, y = 0, z = 0, i = 0;
  public static void main(String[] args) {
    while ( x != 10 ) {
      while ( z < 10 && i < 8 ) {
        q = q + x + y + z;
        if ( x != y && x != z && y != x && y != z && z != x && z != y) {
          System.out.printf("%s", q);
          i++;
        }
        z++;
        q = " ";
      }
    if ( i == 8 ) {
        System.out.printf("%s\n" , q);
        i = 0;
      }
    if ( z == 10 ) {
        z = 0;
        y++;
      }
    if ( y == 10 ) {
        y = 0;
        x++;
      }
    }
  }
}
