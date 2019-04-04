package com.example.calculatrice;

import org.junit.Test;
import static org.junit.Assert.*;

public class MultiplicationTests {

	@Test
	public void multiplication() {
		assertTrue(2*4 == Multiplication.multiplication(2, 4));
	}

  @Test
  public void multiplicationTest1() {
    assertTrue(5 * 4 == Multiplication.multiplication(5, 4));
  }

  @Test
  public void multiplicationTest2() {
    assertTrue(4 * 5 == Multiplication.multiplication(4, 5));
  }
  
  @Test
  public void multiplicationTest3() {
    assertTrue(5 * 0 == Multiplication.multiplication(5, 0));
  }
 
  @Test
  public void multiplicationTest4() {
    assertTrue(0 * 5 == Multiplication.multiplication(0, 5));
  }
  
  @Test
  public void multiplicationTest5() {
    assertTrue(-1 * 0 == Multiplication.multiplication(-1, 0));
  }
  
  @Test
  public void multiplicationTest6() {
    assertTrue(0 * -1 == Multiplication.multiplication(0, -1));
  }
}
