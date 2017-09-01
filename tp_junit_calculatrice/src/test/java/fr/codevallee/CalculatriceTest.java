package fr.codevallee;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatriceTest {
	
	Calculatrice calculatrice;

	@Test
	public void premierTest() throws Exception {
		assertEquals(1, 1);
	}
	
	@Test
	public void additionTest() throws Exception {
		double a = 1;
		double b = 3;
		double retour = calculatrice.addition(a, b);
		assertEquals(4, retour, 0);
	}
	
	@Before
	public void initialition() {
		calculatrice = new CalculatriceImpl();
	}
	
	@Test
	public void multiplicationTest() throws Exception {
		double a = 6;
		double b = 9;
		double retour = calculatrice.multiplication(a, b);
		assertEquals(54, retour, 0);
	}
	
	@Test
	public void soustractionTest() throws Exception {
		double a = 6;
		double b = 9;
		double retour = calculatrice.soustraction(a, b);
		assertEquals(-3, retour, 0);
	}
	
	@Test (expected = ArithmeticException.class)
	public void divisionTest() throws ArithmeticException {
		double a = 10;
		double b = 0;
		double retour = calculatrice.division(a, b);
		//assertEquals(2, retour, 0);
	}
	
}
