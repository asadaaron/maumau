package org.ifd.service;

import org.ifd.model.Card;
import org.ifd.model.Deck;
import org.ifd.model.Player;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MauMauGame{
    private Deck deck;
    private ArrayList<Player> players;
    private ArrayList<Card> discardPile;
    private Integer numberOfHumanPlayer;

    public MauMauGame(int numPlayers) {
        deck = new Deck();
        players = new ArrayList<>();
        discardPile = new ArrayList<>();

        for (int i = 1; i <= numPlayers; i++) {
            boolean isComputer = i > numberOfHumanPlayer;
            players.add(new Player("Player " + i, isComputer));
        }

        for (Player player : players) {
            for (int j = 0; j < 5; j++) {
                player.drawCard(deck);
            }
        }

        discardPile.add(deck.drawCard());
    }

    /**
     * This method contains the game algorithm. It takes input from the human player, play for the computer player.
     * It also calls the other methods to i.e handleSpecialCards(Card card) for the special card play
     *
     */
    public void start() {
        Scanner scanner = new Scanner(System.in);
        boolean gameWon = false;
        scanner.close();
    }

    /**
     * Used to handle special Cards
     * @param card
     */

    private void handleSpecialCards(Card card) {
        String rank = card.getRank();
        if (rank.equals("7")) {
            System.out.println("Next player draws 2 cards!");
            Player nextPlayer = getNextPlayer();
            nextPlayer.drawCard(deck);
            nextPlayer.drawCard(deck);
        } else if (rank.equals("8")) {
            System.out.println("Next player is skipped!");
        } else if (rank.equals("9")) {
            System.out.println("Change direction!");
            Collections.reverse(players);
        }

    }

    /**
     * Used for getting next player
     * @return next Payer
     */

    private Player getNextPlayer() {
        int currentIndex = players.indexOf(getCurrentPlayer());
        return players.get((currentIndex + 1) % players.size());
    }

    /**
     * Used for getting current player
     * @return Player
     */

    private Player getCurrentPlayer() {
        for (Player player : players) {
            if (!player.hasWon()) return player;
        }
        return null;
    }


}
