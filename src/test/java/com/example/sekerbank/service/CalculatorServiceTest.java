package com.example.sekerbank.service;

import com.example.sekerbank.client.CalculatorSoap;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class CalculatorServiceTest {

	@Mock
	private CalculatorSoap calculatorSoap;

	@InjectMocks
	private CalculatorService calculatorService;

	@BeforeEach
	public void setUp() {
		MockitoAnnotations.openMocks(this);
	}

	@Test
	void testAdd() {
		when(calculatorSoap.add(5, 3)).thenReturn(8);
		int result = calculatorService.add(5, 3);
		assertEquals(8, result);
	}

	@Test
	void when_test_subtract() {
		when(calculatorSoap.subtract(5, 3)).thenReturn(2);
		int result = calculatorService.subtract(5, 3);
		assertEquals(2, result);
	}

	@Test
	void when_test_multiply() {
		when(calculatorSoap.multiply(5, 3)).thenReturn(15);
		int result = calculatorService.multiply(5, 3);
		assertEquals(15, result);
	}

	@Test
	void when_test_divide() {
		when(calculatorSoap.divide(6, 3)).thenReturn(2);
		int result = calculatorService.divide(6, 3);
		assertEquals(2, result);
	}

	@Test
	void when_test_divid_by_zero() {
		when(calculatorSoap.divide(6, 0)).thenReturn(0);
		int result = calculatorService.divide(6, 0);
		assertEquals(0, result);
	}
}