package com.Sander.Skript;

import java.util.ArrayList;
import java.net.*;
import java.io.*;

public class KleinerServer {
  ServerSocket server = new ServerSocket(1234);

  KleinerServer() throws IOException {
    while ( true ) {
      Socket client = server.accept();
      InputStream input = client.getInputStream();
      OutputStream output = client.getOutputStream();
      ArrayList<Integer> zahlen = new ArrayList<Integer>();
      int anzahl = input.read();
      for (int i = 0; i <= anzahl; i++) {
        int read = input.read();
        zahlen.add(read);
      }
      switch (zahlen.get(0)) {
        case 1:
          output.write(sum(zahlen));
        case 2:
          output.write(substract(zahlen));
        case 3:
          output.write(multiply(zahlen));
      }
      output.flush();
      input.close();
      output.close();
    }
  }

  public static int sum(ArrayList<Integer> zahlen) {
    int sum = 0;
    for (int i = 1; i < zahlen.size(); i++) {
      sum += zahlen.get(i);
    }
    return sum;
  }

  public static int substract(ArrayList<Integer> zahlen) {
    int sub = zahlen.get(1);
    for (int i = 2; i < zahlen.size(); i++) {
      sub -= zahlen.get(i);
    }
    return sub;
  }

  public static int multiply(ArrayList<Integer> zahlen) {
    int result = 1;
    for (int i = 1; i < zahlen.size(); i++) {
      result *= zahlen.get(i);
    }
    return result;
  }

  public static void main(String[] args) {
    try {
      KleinerServer server = new KleinerServer();
    } catch (IOException e) {
      System.out.println(e);
    }
  }
}
