package com.Agenten.Sys;

import java.io.File;
import java.io.FileNotFoundException;

public class VerhandlungAdvanced {

  public static void main(String[] args) {
    int[] contract, proposal, order;
    Agent agA, agB;
    Mediator med;
    int maxRounds, round;
    boolean voteA, voteB;
    try {
      agA = new SupplierAgent(new File("data/daten3ASupplier_200.txt"));
      // agB = new CustomerAgent(new File("data/daten4BCustomer_200_5.txt"));
      agB = new CustomerAdvanced(new File("data/daten4BCustomer_200_5.txt"));
      med = new Mediator(agA.getContractSize(), agB.getContractSize());

      // Verhandlung initialisieren
      // contract = med.initContract(); //Vertrag=Lösung=Jobliste
      order = med.initOrder();
      contract = erstelleContract(order, agA, agB);
      maxRounds = 1000000; // Verhandlungsrunden
      ausgabe(agA, agB, 0, contract);
      // Verhandlung starten
      for (round = 1; round < maxRounds; round++) { // Mediator
        order = med.initOrder();
        proposal = erstelleContract(order, agA, agB);
        voteA = agA.vote(contract, proposal); // Autonomie + Private Infos
        voteB = agB.vote(contract, proposal);
        if ( voteA && voteB ) {
          contract = proposal;
          ausgabe(agA, agB, round, contract);
        }
      }
    } catch (FileNotFoundException e) {
      System.out.println(e.getMessage());
    }
  }

  public static void ausgabe(Agent a1, Agent a2, int i, int[] contract) {
    System.out.print(i + " -> ");
    a1.printUtility(contract);
    System.out.print("  ");
    a2.printUtility(contract);
    System.out.println();
  }

  public static int[] erstelleContract(int[] order, Agent a0, Agent a1) {
    int[] con = new int[order.length];
    for (int i = 0; i < order.length; i++) {
      if ( order[i] == 0 ) {
        a0.contractErgaenzen(con, i);
      } else {
        a1.contractErgaenzen(con, i);
      }
    }
    return con;
  }
}
