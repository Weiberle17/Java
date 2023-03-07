package com.Agenten.Sys;

import java.io.File;
import java.io.FileNotFoundException;

public class Verhandlung {
  public static void main(String[] args) {
    int[] contract, proposal;
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
      contract = med.initContract(); // Vertrag=Lösung=Jobliste
      maxRounds = 1000000; // Verhandlungsrunden
      ausgabe(agA, agB, 0, contract);
      // Verhandlung starten
      for (round = 1; round < maxRounds; round++) { // Mediator
        proposal = med.constructProposal(contract);
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
}
