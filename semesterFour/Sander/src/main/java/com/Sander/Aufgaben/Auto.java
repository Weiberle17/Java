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
    for (int i = 0; i < 10; i++) {
      einparken();
      System.out.println("Es sind " + myParkhaus.getPlaetze() + " Plätze frei.");
      ausparken();
      System.out.println("Es sind " + myParkhaus.getPlaetze() + " Plätze frei.");
    }
  }

  public void einparken() {
    myParkhaus.einfahren();
    this.parked = true;
  }

  public void ausparken() {
    myParkhaus.ausfahren();
    this.parked = false;
  }

  public boolean pstatus() {
    return parked;
  }
}
