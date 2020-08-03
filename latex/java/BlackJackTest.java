package Básico;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BlackJackTest {

	@Test
	void testSuma(){

		boolean actual = BlackJack.suma(12,5);
		boolean expected = true;
		assertEquals(actual,expected);
		
		actual = BlackJack.suma(10,11);
		expected = true;
		assertEquals(actual,expected);
		
		actual = BlackJack.suma(13,7);
		expected = true;
		assertEquals(actual,expected);
		
		actual = BlackJack.suma(11,12);
		expected = false;
		assertEquals(actual,expected);
		
		actual = BlackJack.suma(14,9);
		expected = false;
		assertEquals(actual,expected);
		
		actual = BlackJack.suma(13,10);
		expected = false;
		assertEquals(actual,expected);

	}
}
