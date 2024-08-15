package org.ifd;

import org.ifd.service.MauMauGame;

public class Main {
    public static void main(String[] args) {
        MauMauGame game = new MauMauGame(3); // Three-player game
        game.start();
    }
}