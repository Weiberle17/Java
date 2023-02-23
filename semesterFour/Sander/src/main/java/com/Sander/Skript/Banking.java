package com.Sander.Skript;

public class Banking {
  public static void main(String[] args) {
    Bank myBank = new Bank();
    new Clerk("Andrea Müller", myBank);
    new Clerk("Petra Schmitt", myBank);
  }
}
