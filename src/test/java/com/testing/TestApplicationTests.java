package com.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestApplicationTests {

	@Test
	public void additionTest() {
		
		assertEquals(10,Calculator.addition(7,3));
	}
	@Test
	public void subtractionTest() {
		
		assertEquals(4,Calculator.subtraction(7, 3));
	}
	@Test
	public void divisionTest() {
		
		assertEquals(4,Calculator.division(8,2));
	}
	@Test
	public void multiplicationTest() {
		assertEquals(4,Calculator.multiplication(2, 2));
	}

	
}