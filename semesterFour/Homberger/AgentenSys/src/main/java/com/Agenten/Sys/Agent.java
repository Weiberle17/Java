package com.Agenten.Sys;

public abstract class Agent {
  public abstract boolean vote(int[] contract, int[] proposal);

  public abstract void printUtility(int[] contract);

  public abstract int getContractSize();

  public abstract void contractErgaenzen(int[] contract, int i);
}
