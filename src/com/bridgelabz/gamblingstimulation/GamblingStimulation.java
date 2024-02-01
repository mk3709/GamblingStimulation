package com.bridgelabz.gamblingstimulation;


import java.util.Random;

public class GamblingStimulation {

    public static void main(String[] args) {

        double stake = 100.0;


        double betAmount = 1.0;

        int numGames = 10;

        Random random = new Random();

        for (int game = 1; game <= numGames; game++) {
            boolean win = random.nextBoolean();


            if (win) {
                stake += betAmount;
                System.out.println("Game " + game + ": You won! Current stake: $" + stake);
            } else {
                stake -= betAmount;
                System.out.println("Game " + game + ": You lost. Current stake: $" + stake);
            }

            if (stake <= 0) {
                System.out.println("You're out of money. Game over!");
                break;
            }
        }
    }
}
