package com.example.calculatrice;

import static org.junit.Assert.*;

import org.junit.Test;

public class AdditionTest {
	
	@Test
	public void additionTest1() {
		assertTrue(2 + 4 == Addition.addition(2, 4));
	}
	@Test
	public void additionTest2() {
		assertTrue(-1 + 4 == Addition.addition(-1, 4));
	}
	@Test
	public void additionTest3() {
		assertTrue(4 + -1 == Addition.addition(4, -1));
	}
	@Test
	public void additionTest4() {
		assertTrue(0 + 4 == Addition.addition(0, 4));
	}
	@Test
	public void additionTest5() {
		assertTrue(4 + 0 == Addition.addition(4, 0));
	}
	@Test
	public void additionTest6() {
		assertTrue(0 + -1 == Addition.addition(0, -1));
	}
}
