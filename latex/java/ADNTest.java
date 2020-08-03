package Avanzado;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ADNTest {
	
	@Test
	public void valido() {
		boolean adn=ADN.valido("AHHFKVNJ");
		assertFalse(adn);// assertFalse(adn) = assertEquals(false, adn);
		
		adn=ADN.valido("AAHHFGTGS");
		assertFalse(adn);
		
		adn=ADN.valido("ACGTCGCGATCA");
		assertTrue(adn);// assertTrue(adn) = assertEquals(true, adn);
	}

	@Test
	void mutarAmp() {
		String adn=ADN.mutarAmp("ACCTGAC", 0,3);
		assertEquals("ACCACCTGAC", adn);
		
		adn=ADN.mutarAmp("ACCTGAC", 1,3);
		assertEquals("ACCCCTGAC", adn);
		
		adn=ADN.mutarAmp("JASDCJIRDA", 3,6);
		assertEquals("Cadena no válida", adn);
	}
	
	@Test
	void mutarDel() {
		String adn=ADN.mutarDel("ACGTTAGCTA", 1, 5);
		assertEquals("AAGCTA", adn);
		
		adn=ADN.mutarDel("ACGGCGATGCA", 0, 4);
		assertEquals("CGATGCA", adn);
		
		adn=ADN.mutarDel("AHJFSKJDKLAS", 2, 5);
		assertEquals("Cadena no válida", adn);
	}
	
	@Test
	void mutarInv() {
		String adn=ADN.mutarInv("AGGTCTCGA", 0, 4);
		assertEquals("TGGACTCGA", adn);
		
		adn=ADN.mutarInv("ACGTAACGA", 3, 7);
		assertEquals("ACGCAATGA", adn);
		
		adn=ADN.mutarInv("ACGKKAHSFA", 4, 6);
		assertEquals("Cadena no válida", adn);
	}
}