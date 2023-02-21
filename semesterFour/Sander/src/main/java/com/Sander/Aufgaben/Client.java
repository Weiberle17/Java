package com.Sander.Aufgaben;

import java.util.Scanner;
import java.net.*;
import java.io.*;

public class Client {
  Client() throws IOException {
    Socket server = new Socket( "localhost", 1234);
    InputStream input = server.getInputStream();
    OutputStream output = server.getOutputStream();
    Scanner in = new Scanner(System.in);
    System.out.println("Mit wie vielen Zahlen möchten Sie rechnen?");
    int anzahl = in.nextInt();
    output.write(anzahl);
    System.out.println("Wollen Sie addieren(1), subtrahieren(2) oder multiplizieren(3)?");
    int math = in.nextInt();
    output.write(math);
    System.out.println("Geben Sie nun die Zahlen mit denen gerechnet werden soll und bestätigen jeweils mit Enter");
    for (int i = 0; i < anzahl; i++) {
      output.write(in.nextInt());
    }
    output.flush();
    System.out.println(input.read());
    server.close();
    input.close();
    output.close();
    in.close();
  }

  public static void main(String[] args) {
    try {
      Client client = new Client();
    } catch (IOException e) {
      System.out.print(e);
    }
  }
}
