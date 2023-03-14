package com.Sander.Skript;

public class Clerk extends Thread {
  private Bank bank;

  public Clerk(String name, Bank bank) {
    super(name);
    this.bank = bank;
    start();
  }

  public void run() {
    for (int i = 0; i < 10000; i++) {
      int accountNumber = (int)(Math.random() * 100);
      float amount = (int) (Math.random() * 1000) - 500;
      System.out.println(i + " Konto: " + accountNumber + " Betrag: " + amount);

      bank.transferMoney(accountNumber, amount);
    }
  }
}
