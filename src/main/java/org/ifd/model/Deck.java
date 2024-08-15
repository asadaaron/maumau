package org.ifd.model;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards;

    public Deck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"7", "8", "9", "10", "J", "Q", "K", "A"};
        Integer[] value = {0, 0, 0, 10, 2, 3, 4, 11};
        cards = new ArrayList<>();

        for (String suit : suits) {
            int i = 0;
            for (String rank : ranks) {
                cards.add(new Card(suit, rank, value[i++]));
            }
        }
        shuffle();
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card drawCard() {
        return cards.isEmpty() ? null : cards.remove(0);
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public int size() {
        return cards.size();
    }
}
