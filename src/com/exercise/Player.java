package com.exercise;

public class Player {

    int playerWins;
    int playerDraws;
    int playerLoses;
    int playerPoints;

    public Player(int playerWins, int playerDraws, int playerLoses, int playerPoints) {
        this.playerWins = playerWins;
        this.playerDraws = playerDraws;
        this.playerLoses = playerLoses;
        this.playerPoints = playerPoints;
    }


    public void getPlayerScore() {
        System.out.println("Player results:");
        System.out.println("Wins: " + playerWins);
        System.out.println("Draws: " + playerDraws);
        System.out.println("Loses: " + playerLoses);
        System.out.println("Score: " + playerPoints);
        System.out.println();

    }

}
