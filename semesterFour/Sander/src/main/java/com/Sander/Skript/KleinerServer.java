package com.Sander.Skript;

import java.net.*;
import java.io.*;

public class KleinerServer {
  ServerSocket server = new ServerSocket(1234);

  KleinerServer() throws IOException {
    while ( true ) {
      Socket client = server.accept();
      InputStream input = client.getInputStream();
      OutputStream output = client.getOutputStream();
      int zahl1 = input.read();
      int zahl2 = input.read();
      output.write(zahl1 + zahl2);
      output.flush();
      input.close();
      output.close();
    }
  }

  public static void main(String[] args) {
    try {
      KleinerServer server = new KleinerServer();
    } catch (IOException e) {
      System.out.println(e);
    }
  }
}
