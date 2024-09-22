package org.example;

import java.util.HashMap;
import java.util.Random;

public class Game {
    private static final Random RANDOM = new Random();

    public static HashMap<Integer, Boolean> simulateMontyHall(int numGames, boolean changeDoor) {
        HashMap<Integer, Boolean> results = new HashMap<>();

        for (int i = 1; i <= numGames; i++) {
            Door[] doors = {new Door(true), new Door(false), new Door(false)};
            int chosenDoor = RANDOM.nextInt(3);

            int openDoor;
            do {
                openDoor = RANDOM.nextInt(3);
            } while (openDoor == chosenDoor || doors[openDoor].isHasPrize());

            if (changeDoor) {
                int newChosenDoor;
                do {
                    newChosenDoor = RANDOM.nextInt(3);
                } while (newChosenDoor == chosenDoor || newChosenDoor == openDoor);
                chosenDoor = newChosenDoor;
            }

            results.put(i, doors[chosenDoor].isHasPrize());
        }

        return results;
    }

    public static void printResults(HashMap<Integer, Boolean> results) {
        int wins = 0;
        int losses = 0;

        for (boolean result : results.values()) {
            if (result) {
                wins++;
            } else {
                losses++;
            }
        }

        System.out.printf("Wins: %d\nLosses: %d\n", wins, losses);
    }
}