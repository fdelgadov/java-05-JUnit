package Avanzado;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TablasDeVerdadTest {

	@Test
	  void testNegacion() {

		boolean actual = TablasDeVerdad.negacion(true);
		boolean expected = false;
		assertEquals(actual,expected);
		
		actual = TablasDeVerdad.negacion(false);
		expected = true;
		assertEquals(actual,expected);
	}

	@Test
	  void testConjuncion() {
		
		boolean actual = TablasDeVerdad.conjuncion(false, true);
		boolean expected = false;
		assertEquals(actual,expected);
		
		actual = TablasDeVerdad.conjuncion(true, false);
		expected = false;
		assertEquals(actual,expected);
		
		actual = TablasDeVerdad.conjuncion(true, true);
		expected = true;
		assertEquals(actual,expected);
		
		actual = TablasDeVerdad.conjuncion(false, false);
		expected = false;
		assertEquals(actual,expected);
	}
	
	@Test
	 void testDisyuncion() {
		
		boolean actual = TablasDeVerdad.disyuncion(true, false);
		boolean expected = true;
		assertEquals(actual,expected);
		
		actual = TablasDeVerdad.disyuncion(false, false);
		expected = false;
		assertEquals(actual,expected);
		
		actual = TablasDeVerdad.disyuncion(true, false);
		expected = true;
		assertEquals(actual,expected);
		
		actual = TablasDeVerdad.disyuncion(true, true);
		expected = true;
		assertEquals(actual,expected);
	}
	
	@Test
	 void testConditional() {
	
		boolean actual = TablasDeVerdad.condicional(true, false);
		boolean expected = false;
		assertEquals(actual,expected);
		
		actual = TablasDeVerdad.condicional(false, false);
		expected = true;
		assertEquals(actual,expected);
		
		actual = TablasDeVerdad.condicional(false, true);
		expected = true;
		assertEquals(actual,expected);
		
		actual = TablasDeVerdad.condicional(true, true);
		expected = true;
		assertEquals(actual,expected);
	}
	
	@Test
	 void testBicondicional() {
		
		boolean actual = TablasDeVerdad.bicondicional(false, true);
		boolean expected = false;
		assertEquals(actual,expected);
		
		actual = TablasDeVerdad.condicional(false, false);
		expected = true;
		assertEquals(actual,expected);
		
		actual = TablasDeVerdad.condicional(true, false);
		expected = false;
		assertEquals(actual,expected);
		
		actual = TablasDeVerdad.condicional(true, true);
		expected = true;
		assertEquals(actual,expected);
	}
  }

