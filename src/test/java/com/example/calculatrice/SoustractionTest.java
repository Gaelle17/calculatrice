package com.example.calculatrice;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class SoustractionTest {

  @Test
  public void soustractionClassExistTest() {
    Class<Soustraction> klass = Addition.class;
    assertTrue("com.example.calculatrice.Soustraction".equals(klass.getName()));
  }

  @Test
  public void soustractionTest0() {
    assertTrue(5 - 5 == Soustraction.soustraction(5, 5));
  }

  @Test
  public void soustractionTest1() {
    assertTrue(5 - 4 == Soustraction.soustraction(5, 4));
  }

  @Test
  public void soustractionTest2() {
    assertTrue(4 - 5 == Soustraction.soustraction(4, 5));
  }

  @Test
  public void soustractionTest3() {
    assertTrue(5 - 0 == Soustraction.soustraction(5, 0));
  }

  @Test
  public void soustractionTest4() {
    assertTrue(0 - 5 == Soustraction.soustraction(0, 5));
  }

  @Test
  public void soustractionTest5() {
    assertTrue(-1 - 0 == Soustraction.soustraction(-1, 0));
  }

  @Test
  public void soustractionTest6() {
    assertTrue(0 - -1 == Soustraction.soustraction(0, -1));
  }

  @Test
  public void soustractionTest7() {
    assertTrue(5 - -1 == Soustraction.soustraction(5, -1));
  }
}
