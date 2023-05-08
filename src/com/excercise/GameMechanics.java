package com.excercise;

public class GameMechanics {

    Randomizer randomizer = new Randomizer();
    String playersChoice = "";
    int playerWins = 0;
    int playerDraws = 0;
    int playerLoses = 0;
    int computerWins = 0;
    int computerDraws = 0;
    int computerLoses = 0;
    int playerPoints = 0;
    int computerPoints = 0;


    public void rock() {
        playersChoice = "Rock";
        if (playersChoice.equalsIgnoreCase(randomizer.randomChoice())){
            System.out.println("Player: " + playersChoice + ", Computer: " + randomizer.randomChoice());
            System.out.println("Rock vs rock. It's a tie!");
            playerDraws++;
            computerDraws++;
        } else if (randomizer.randomChoice().equalsIgnoreCase("Paper")) {
            System.out.println("Player: " + playersChoice + ", Computer: " + randomizer.randomChoice());
            System.out.println("Rock vs paper. You lose!");
            computerWins++;
        } else {
            System.out.println("Player: " + playersChoice + ", Computer: " + randomizer.randomChoice());
            System.out.println("Rock vs scissors. You win!");
            playerWins++;
        }

    }
    public void paper() {
        playersChoice = "Paper";
        if (playersChoice.equalsIgnoreCase(randomizer.randomChoice())){
            System.out.println("Player: " + playersChoice + ", Computer: " + randomizer.randomChoice());
            System.out.println("Paper vs paper. It's a tie!");
            playerDraws++;
            computerDraws++;
        } else if (randomizer.randomChoice().equalsIgnoreCase("Scissors")) {
            System.out.println("Player: " + playersChoice + ", Computer: " + randomizer.randomChoice());
            System.out.println("Paper vs scissors. You lose!");
            computerWins++;
        } else {
            System.out.println("Player: " + playersChoice + ", Computer: " + randomizer.randomChoice());
            System.out.println("Paper vs rock. You win!");
            playerWins++;
        }
    }
    public void scissors() {
        playersChoice = "Scissors";
        if (playersChoice.equalsIgnoreCase(randomizer.randomChoice())){
            System.out.println("Player: " + playersChoice + ", Computer: " + randomizer.randomChoice());
            System.out.println("Scissors vs scissors. It's a tie!");
            playerDraws++;
            computerDraws++;
        } else if (randomizer.randomChoice().equalsIgnoreCase("Rock")) {
            System.out.println("Player: " + playersChoice + ", Computer: " + randomizer.randomChoice());
            System.out.println("Scissors vs Rock. You lose!");
            computerWins++;
        } else {
            System.out.println("Player: " + playersChoice + ", Computer: " + randomizer.randomChoice());
            System.out.println("Scissors vs paper. You win!");
            playerWins++;
        }
    }

    public void score() {
        System.out.println("Score:");
        System.out.println("Player - " + playerWins);
        System.out.println("Computer - " + computerWins);
    }

}
