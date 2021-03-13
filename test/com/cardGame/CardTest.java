package com.cardGame;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {
    Card card;
    DeckOfCards deck;
    @BeforeEach
    void setUp() {
        card = new Card("face","suits");
    }

    @AfterEach
    void tearDown() {
    }
@Test
    void testThatACardNotNull(){
        card = new Card("face","suits");
        assertNotNull(card);
    }
@Test
    void testThatPlayersCanPlayACardWithFace(){
        card = new Card("","suits");
        card.setFace("Ace");
        assertEquals("Ace",card.getFace());
}
@Test
    void testThatPlayersCanPlayACardWithCardOfSuits(){
        card = new Card("","suits");
        card.setSuits("Hearts");
        assertEquals("Hearts",card.getSuits());
    }
@Test
    void testToCreateAToStringMethod(){
    card = new Card("","suits");
    card.setFace("Ace");
    card.setSuits("Hearts");
    String display = card.toString();
    assertEquals("Ace Of Hearts",display);
}
@Test
    void testThatDecksOfCardsHasACardAndIsNotNull(){
        deck = new DeckOfCards();
        assertNotNull(deck);
        assertNotNull(deck.getCards());
}
@Test
    void testTHatOurDecksOfCardsHasFifty_TwoCardsInIt(){
        deck = new DeckOfCards();
        int numBerOfCards = deck.getNumberOfCards();
        assertEquals(52,numBerOfCards);
}
@Test
    void testThatOurCardGameAlwaysHaveACurrentCard(){
        deck = new DeckOfCards();
        int currentCard = deck.getCurrentCard();
        assertEquals(0,currentCard);
}
@Test
    void testThatOurDeckOfCardsHasAListOfFaceATCreation(){
        deck = new DeckOfCards();
        String[] faces = deck.getDeckFace();
        assertEquals(13,faces.length);
}
@Test
void testThatOurDeckOfCardsHasAListOfSuitsATCreation() {
    deck = new DeckOfCards();
    String[] suits = deck.getDeckSuits();
    assertEquals(4, suits.length);
}
@Test
    void testThatOurDeckCardsIsPopulatedWithCards(){
        deck  = new DeckOfCards();
        deck.populateDeckWithCards();
        assertEquals(52,deck.getCards().length);
}

}