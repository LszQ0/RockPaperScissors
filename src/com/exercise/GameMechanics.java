package com.exercise;

public class GameMechanics {

    Randomizer randomizer = new Randomizer();
    Player player = new Player(0,0,0,0);
    Computer computer = new Computer(0,0,0,0);
    String playersChoice = "";
    String computerChoice = randomizer.randomChoice();


    public void rock() {
        playersChoice = "Rock";
        if (playersChoice.equalsIgnoreCase(computerChoice)){
            System.out.println("Player: " + playersChoice + ", Computer: " + computerChoice);
            System.out.println("Rock vs rock. It's a tie!");
            drawMatch();
            computerChoice = randomizer.randomChoice();

        } else if (computerChoice.equalsIgnoreCase("Paper")) {
            System.out.println("Player: " + playersChoice + ", Computer: " + computerChoice);
            System.out.println("Rock vs paper. You lose!");
            computerWin();
            computerChoice = randomizer.randomChoice();


        } else {
            System.out.println("Player: " + playersChoice + ", Computer: " + computerChoice);
            System.out.println("Rock vs scissors. You win!");
            playerWin();
            computerChoice = randomizer.randomChoice();
        }
    }

    public void paper() {
        playersChoice = "Paper";
        if (playersChoice.equalsIgnoreCase(computerChoice)){
            System.out.println("Player: " + playersChoice + ", Computer: " + computerChoice);
            System.out.println("Paper vs paper. It's a tie!");
            drawMatch();
            computerChoice = randomizer.randomChoice();

        } else if (computerChoice.equalsIgnoreCase("Scissors")) {
            System.out.println("Player: " + playersChoice + ", Computer: " + computerChoice);
            System.out.println("Paper vs scissors. You lose!");
            computerWin();
            computerChoice = randomizer.randomChoice();

        } else {
            System.out.println("Player: " + playersChoice + ", Computer: " + computerChoice);
            System.out.println("Paper vs rock. You win!");
            playerWin();
            computerChoice = randomizer.randomChoice();
        }
    }

    public void scissors() {
        playersChoice = "Scissors";
        if (playersChoice.equalsIgnoreCase(computerChoice)){
            System.out.println("Player: " + playersChoice + ", Computer: " + computerChoice);
            System.out.println("Scissors vs scissors. It's a tie!");
            drawMatch();
            computerChoice = randomizer.randomChoice();

        } else if (computerChoice.equalsIgnoreCase("Rock")) {
            System.out.println("Player: " + playersChoice + ", Computer: " + computerChoice);
            System.out.println("Scissors vs rock. You lose!");
            computerWin();
            computerChoice = randomizer.randomChoice();

        } else {
            System.out.println("Player: " + playersChoice + ", Computer: " + computerChoice);
            System.out.println("Scissors vs paper. You win!");
            playerWin();
            computerChoice = randomizer.randomChoice();


        }
    }

    public void playerWin() {
        player.playerWins++;
        computer.computerLoses++;
        player.playerPoints += 2;
    }

    public void computerWin() {
        computer.computerWins++;
        player.playerLoses++;
        computer.computerPoints += 2;
    }

    public void drawMatch() {
        player.playerDraws++;
        computer.computerDraws++;
        player.playerPoints++;
        computer.computerPoints++;
    }

    public void score() {
        player.getPlayerScore();
        computer.getComputerScore();
    }

    public void isGameWon() {
        if (player.playerPoints > computer.computerPoints) {
            System.out.println("Congratulations. You got more points than computer.");
            System.out.println("Player: " + player.playerPoints + " Computer: " + computer.computerPoints);
        } else if (player.playerPoints < computer.computerPoints) {
            System.out.println("Better luck next time. You got less points than computer.");
            System.out.println("Player: " + player.playerPoints + " Computer: " + computer.computerPoints);
        } else {
            System.out.println("It's quite rare to see - a draw!");
            System.out.println("Player: " + player.playerPoints + " Computer: " + computer.computerPoints);
        }
    }

}
