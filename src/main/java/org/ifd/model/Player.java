package org.ifd.model;

import java.util.ArrayList;

public class Player {
    private String name;
    private ArrayList<Card> hand;
    private boolean isComputer;
    private Integer points;

    public Player(String name, boolean isComputer) {
        this.name = name;
        this.isComputer = isComputer;
        this.hand = new ArrayList<>();
    }

    public void drawCard(Deck deck) {
        hand.add(deck.drawCard());
    }

    public void playCard(Card card, ArrayList<Card> discardPile) {
        hand.remove(card);
        discardPile.add(card);
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public String getName() {
        return name;
    }

    public boolean isComputer() {
        return isComputer;
    }

    public boolean hasWon() {
        return hand.isEmpty();
    }

    @Override
    public String toString() {
        return name + "'s hand: " + hand;
    }

    /**
     * This method is used to choose appropriate card for each turn
     * @param topCard
     * @return Card
     */
    public Card chooseCard(Card topCard) {
        for (Card card : hand) {
            if (card.matches(topCard)) {
                return card;
            }
        }
        return null;
    }

    /**
     * used to calculate the total points of the player
     * @param cards
     * @return points
     */
    public Integer getPoints(ArrayList<Card> cards){
        return Math.toIntExact(cards.stream().map(Card::getValue).count());
    }
}

