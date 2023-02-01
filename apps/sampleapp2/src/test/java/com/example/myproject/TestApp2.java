package com.example.myproject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class TestApp2 {

  @Test
  public void testCompare() throws Exception {
    App2 app = new App2();
    assertEquals("should return 0 when both numbers are equal", 0, app.compare(1, 1));
  }
}
