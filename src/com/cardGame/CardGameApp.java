package com.cardGame;

public class CardGameApp {
    public static void main(String[] args) {
        DeckOfCards myFirstPlay  = new DeckOfCards();
    /*
    Deck of Cards HAs Been Populated at Creation,So Now Shuffle
     */
    myFirstPlay.shuffleCard();
    /*
    After Shuffling, Now Share to each Players by Printing each Card Shared.
     */
        for(int play = 1; play <= 52; play++){
            System.out.printf("%-18s", myFirstPlay.DealCard());
            if(play % 4 == 0){
                System.out.println();
            }
        }
    }

}
