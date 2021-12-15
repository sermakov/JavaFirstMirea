package ru.mirea.task14.exe2;

public class Deck {
    private int deckSize = 0;
    private int[] deck;

    Deck(int deckSize){
        this.deckSize = deckSize;
        deck = new int[deckSize];
    }

    public void initDeck(){
        for (int i = 0; i < deckSize; ++i){
            deck[i] =  i;
        }
    }

    public int get(int index){
        return deck[index];
    }

    public void randomize(){
        for (int i = deckSize - 1; i >= 1; i--) {
            int j = (int) (Math.random() * 5);
            int tmp = deck[j];
            deck[j] = deck[i];
            deck[i] = tmp;
        }
    }

    public void copy(Deck copyDeck, int firstIndex, int lastIndex){
        for (int i = firstIndex; i < lastIndex; ++i){
            this.deck[i - firstIndex] = copyDeck.deck[i];
        }
    }
}
