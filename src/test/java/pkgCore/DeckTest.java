package pkgCore;

import static org.junit.Assert.*;

import org.junit.Test;

public class DeckTest {

	@Test
	public void TestDeck() {
		
		//	TODO: Build a deck(1), make sure there are 52 cards in the deck
		//	TODO: Build a deck(6), make sure there are 312 cards in the deck 
		Deck d = new Deck(1);
		assertEquals(d.deck.size(), 52);
		Deck d2 = new Deck(6);
		assertEquals(d2.deck.size(), 312);
	}

}
