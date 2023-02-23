package com.Sander.Aufgaben;

public class Auto extends Thread {
  private int number;
  private boolean parked = false;

  public Auto(int number) {
    this.number = number;
    start();
  }

  public void run() {
    for (int i = 0; i < 10; i++) {
      einparken();
      System.out.println("Auto Nummer: " + number + " ist eingefahren.");
      ausparken();
      System.out.println("Auto Nummer: " + number + " ist ausgefahren.");
    }
  }

  public void einparken() {
    this.parked = true;
  }

  public void ausparken() {
    this.parked = false;
  }

  public boolean pstatus() {
    return parked;
  }
}
