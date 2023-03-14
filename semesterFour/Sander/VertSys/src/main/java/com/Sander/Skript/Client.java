package com.Sander.Skript;

import java.net.*;
import java.io.*;

public class Client {
  Client() throws IOException {
    Socket server = new Socket( "localhost", 1234);
    InputStream input = server.getInputStream();
    OutputStream output = server.getOutputStream();
    output.write(5);
    output.write(10);
    output.flush();
    System.out.println(input.read());
    server.close();
    input.close();
    output.close();
  }

  public static void main(String[] args) {
    try {
      Client client = new Client();
    } catch (IOException e) {
      System.out.print(e);
    }
  }
}
