package com.example.myproject;

import com.google.common.primitives.Ints;

public class App2 {

  public int compare(int a, int b) {
    return Ints.compare(a, b);
  }

  public static void main(String... args) throws Exception {
    App2 app = new App2();
    System.out.println("Success: " + app.compare(2, 1));
  }
}