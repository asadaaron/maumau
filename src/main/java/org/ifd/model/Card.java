package org.ifd.model;

public class Card {
    private String suit;
    private String rank;
    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public String getSuit() {
        return suit;
    }

    public String getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }

    public boolean matches(Card other) {
        return this.suit.equals(other.suit) || this.rank.equals(other.rank);
    }

}
