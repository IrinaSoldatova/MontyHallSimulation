package org.example;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        final int NUM_GAMES = 1000;

        HashMap<Integer, Boolean> resultsWithSwitch = Game.simulateMontyHall(NUM_GAMES, true);
        System.out.println("Result with door switching:");
        Game.printResults(resultsWithSwitch);

        HashMap<Integer, Boolean> resultsWithoutSwitch = Game.simulateMontyHall(NUM_GAMES, false);
        System.out.println("Result without switching doors:");
        Game.printResults(resultsWithoutSwitch);
    }
}