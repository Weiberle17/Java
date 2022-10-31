import java.util.Scanner;
public class Aufgabe_1 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Bitte geben Sie eine beliebige ganze Zahl ein:");
    int x = in.nextInt();
    int gros = 144;
    int schock = 60;
    int dutzend = 12;
    int g = x / gros;
    x = x % gros;
    int s = x / schock;
    x = x % schock;
    int d = x / dutzend;
    x = x % dutzend;
    System.out.println("Gros: " + g);
    System.out.println("Schock: " + s);
    System.out.println("Dutzend: " + d);
    System.out.println("Rest: " + x);
    in.close();
  }
}
