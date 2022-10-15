package aufgaben;

import java.util.*;

public class Aufgabe_19_Main {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    //Aufgabe_19 P1 = new Aufgabe_19(1234);

    System.out.println("Geben Sie die Personalnummer ein");
    Aufgabe_19 P1 = new Aufgabe_19(in.nextInt());

    System.out.println("Geben Sie den Nachnamen ein");
    P1.setNachname(in.next());
    System.out.println("Geben Sie das Gehalt ein");
    P1.setGehalt(in.nextDouble());

    System.out.println("Geben Sie die Hoehe der Gehaltserhoehung ein");
    P1.setGehaltserhoehung(in.nextDouble());

    P1.Daten();

  }

}
