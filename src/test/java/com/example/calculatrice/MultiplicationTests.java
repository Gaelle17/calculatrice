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

}
