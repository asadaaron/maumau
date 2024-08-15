package org.ifd.model;

public class Card {
    private String suit;
    private String rank;
    private Integer value;
    public Card(String suit, String rank, Integer value) {
        this.suit = suit;
        this.rank = rank;
        this.value = value;
    }

    public String getSuit() {
        return suit;
    }

    public String getRank() {
        return rank;
    }
    public Integer getValue(){
        return value;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }

    public boolean matches(Card other) {
        return this.suit.equals(other.suit) || this.rank.equals(other.rank);
    }

}
