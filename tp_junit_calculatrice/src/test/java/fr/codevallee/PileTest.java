package fr.codevallee;

import static org.junit.Assert.*;

import org.junit.Test;

public class PileTest {
	
	@Test
	public void instanciationTest() throws Exception {
		Pile<String> pile = new Pile<String>();
		
		assertFalse(pile == null);
	}

	@Test
	public void pushTest() throws Exception {
		Pile<String> pile = new Pile<String>();
		
		String element1 = "élement1";
		String element2 = "élement2";
		pile.push(element1);
		pile.push(element2);
		
		//assertEquals(2, pile.getListe().size(), 0);
		assertFalse(pile.getListe().isEmpty());
		assertTrue(pile.getListe().get(1).equals("élement2"));
	}
	
	@Test
	public void popTest() throws Exception {
		Pile<String> pile = new Pile<String>();
		
		String element1 = "élement1";
		String element2 = "élement2";
		String element3 = "élement3";
		pile.push(element1);
		pile.push(element2);
		pile.push(element3);
		
		int taille = pile.getListe().size();
		
		pile.pop();
		assertTrue(pile.getListe().size() != taille );
		assertFalse(pile.getListe().contains(element3));
	}
	
	@Test
	public void popallTest() throws Exception {
		Pile<String> pile = new Pile<String>();
		
		String element1 = "élement1";
		String element2 = "élement2";
		String element3 = "élement3";
		pile.push(element1);
		pile.push(element2);
		pile.push(element3);
		
		
		pile.popall();;
		assertTrue(pile.getListe().size() == 0 );
		assertFalse(pile.getListe().contains(element3));
	}

	@Test
	public void peekTest() throws Exception {
		Pile<String> pile = new Pile<String>();
		
		String element1 = "élement1";
		String element2 = "élement2";
		String element3 = "élement3";
		String element4 = "élement4";
		pile.push(element1);
		pile.push(element2);
		pile.push(element3);
		pile.push(element4);
		
		pile.peek(element2);;
		assertTrue(pile.getListe().size() == 4 );
		assertTrue(pile.getListe().get(3).equals(element2));
	}
}