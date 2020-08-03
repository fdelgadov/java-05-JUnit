package B�sico;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MissingCharTest {

	@Test
	void testMissingChar() {
		String actual = MissingChar.missingChar("Descisi�n", 2);
		String expected = "Decisi�n";
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
