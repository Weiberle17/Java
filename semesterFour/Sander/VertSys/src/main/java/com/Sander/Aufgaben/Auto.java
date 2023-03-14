package com.Sander.Aufgaben;

public class Auto extends Thread {
  private int number;
  private boolean parked = false;
  private Parkhaus myParkhaus;

  public Auto(int number, Parkhaus name) {
    this.number = number;
    this.myParkhaus = name;
    start();
  }

  public void run() {
    for (int i = 0; i < 2; i++) {
      try {
        einparken();
        sleep(200);
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
