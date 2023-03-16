package com.Sander.Aufgaben;

public class Auto extends Thread {
  private int number;
  private Parkhaus myParkhaus;

  public Auto(int number, Parkhaus P) {
    this.number = number;
    this.myParkhaus = P;
    start();
  }

  public void run() {
    for (int i = 0; i < 2; i++) {
      try {
        sleep((long) Math.random() * 100);
        myParkhaus.einfahren(number);
        sleep((long) Math.random() * 100);
        myParkhaus.ausfahren(number);
      } catch (InterruptedException e) {
        System.out.println("InterruptedException!");
      }
    }
  }
}
