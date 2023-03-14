package com.Sander.Aufgaben;

public class Auto extends Thread {
  private int number;
  private boolean parked = false;
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
        einparken();
        sleep((long) Math.random() * 100);
        ausparken();
      } catch (InterruptedException e) {
        System.out.println("InterruptedException!");
      }
    }
  }

  public void einparken() {
    myParkhaus.einfahren(number);
    this.parked = true;
  }

  public void ausparken() {
    myParkhaus.ausfahren(number);
    this.parked = false;
  }

  public boolean pstatus() {
    return parked;
  }
}
