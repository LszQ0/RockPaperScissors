package com.exercise;

public class Computer {

    int computerWins;
    int computerDraws;
    int computerLoses;
    int computerPoints;

    public Computer(int computerWins, int computerDraws, int computerLoses, int computerPoints) {
        this.computerWins = computerWins;
        this.computerDraws = computerDraws;
        this.computerLoses = computerLoses;
        this.computerPoints = computerPoints;
    }

    public void getComputerScore() {
        System.out.println("Computer results:");
        System.out.println("Wins: " + computerWins);
        System.out.println("Draws: " + computerDraws);
        System.out.println("Loses: " + computerLoses);
        System.out.println("Score: " + computerPoints);
    }
}
