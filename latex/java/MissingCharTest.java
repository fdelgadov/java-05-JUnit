package Básico;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MissingCharTest {

	@Test
	void testMissingChar() {
		String actual = MissingChar.missingChar("Descisión", 2);
		String expected = "Decisión";
		assertEquals(expected,actual);
		
		actual = MissingChar.missingChar("Switchs", 6);
		expected = "Switch";
		assertEquals(expected,actual);
		
		actual = MissingChar.missingChar("z", 0);
		expected = "";
		assertEquals(expected,actual);
		
		actual = MissingChar.missingChar("", 0);
		expected = "";
		assertEquals(expected,actual);
	}
}
