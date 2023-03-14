package com.Sander.Skript;

public class Bank {
  private Account[] account;

  public Bank() {
    account = new Account[100];
    for (int i = 0; i < account.length; i++) {
      account[i] = new Account();
    }
  }

  public void transferMoney(int accountNumber, float amount) {
    float oldBalance = account[accountNumber].getBalance();
    float newBalance = oldBalance + amount;
    account[accountNumber].setBalance(newBalance);
  }
}
