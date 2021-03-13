package com.cardGame;

public class DeckOfCards {
    private static final int NUMBER_OF_CARDS = 52;
    private static Card[] decks;
    private int currentCard;
    private String[] faces;
    private String[] suits;

    public DeckOfCards(Card[] decks) {
        DeckOfCards.decks = new Card[NUMBER_OF_CARDS];
    }
    public DeckOfCards() {
      decks = new Card[NUMBER_OF_CARDS];
      this.currentCard = 0;
      faces = new String[]{"Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
      suits = new String[]{"Hearts", "Diamonds", "Clubs", "Spades"};
    }

    public void populateDeckWithCards() {
        for(int count =0;count < decks.length;count++)
        decks[count] = new Card(faces[count %13],suits[count/13]);
    }
    public int getNumberOfCards() {
        return NUMBER_OF_CARDS;
    }
    public Card[] getCards() {
        return decks;
    }
    public int getCurrentCard() {
        return  currentCard;
    }
    public String[] getDeckFace() {
        return faces;
    }
    public String[] getDeckSuits() {
        return suits;
    }
}
