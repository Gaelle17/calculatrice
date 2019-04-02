package com.example.calculatrice;

import static org.junit.Assert.*;

import org.junit.Test;

public class AdditionTest {
	
	@Test
	public void additionEntier() {
		assertTrue(2 + 4 == Addition.addition(2, 4));
	}
	
}
