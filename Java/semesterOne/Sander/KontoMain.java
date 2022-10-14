package aufgaben;

import aufgaben.*;
import java.util.*;

public class KontoMain {

  public static int x;

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    Konto meinKonto = new Konto();

    System.out.println("Geben Sie ihre Kontonummer ein: ");
    meinKonto.setKontonummer(in.nextInt());

    int Knr = meinKonto.getKontonummer();
    System.out.println("Konto " + Knr + " enthält: ");

    meinKonto.setSaldo(500.);

    meinKonto.zahleEin(10000.);

    double saldo = meinKonto.getSaldo();

    System.out.println("Saldo: " + saldo + "€");

    System.out.println("Was wollen Sie tun?");
    do {

      System.out.println("1 = Geld abheben");
      System.out.println("2 = Geld einzahlen");
      x = in.nextInt();

    } while ( x != 1 && x != 2);

    if (x == 1) {

      System.out.println("Wie viel möchten Sie abheben?");
      meinKonto.zahleAus(in.nextDouble());

    }else if ( x == 2) {

      System.out.println("Wie viel möchten Sie einbezahlen?");
      meinKonto.zahleEin(in.nextDouble());

    }

    saldo = meinKonto.getSaldo();
    System.out.println("Ihr neues Saldo beträgt: " + saldo + "€");

  }
}
