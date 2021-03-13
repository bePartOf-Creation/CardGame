package com.cardGame;

public class Card {
    private String face;
    private String suits;

    public Card(String face, String suits) {
        this.face = face;
        this.suits = suits;

    }

    public Card() {
    }

    public void setFace(String newFace) {
        this.face = newFace;
    }

    public String getFace() {
        return  face;
    }

    public String getSuits() {
        return suits;
    }

    public void setSuits(String newSuits) {
        this.suits = newSuits;
    }
    @Override
    public String toString() {
        return String.format("%2s%2s%2s",getFace()," Of ",getSuits());
    }
}
