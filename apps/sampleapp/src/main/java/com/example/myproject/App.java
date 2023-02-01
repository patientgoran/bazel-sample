package com.example.myproject;

import com.example.samplelib.Printer;
import com.google.common.primitives.Ints;

public class App {

  public int compare(int a, int b) {
    return Ints.compare(a, b);
  }

  public static void main(String... args) {
    var app = new App();
    new Printer().print("Success: " + app.compare(2, 1));
  }
}