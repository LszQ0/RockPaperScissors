package com.excercise;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Rock, Paper or Scissors Game");
        System.out.println("Rules: If you win a match = you get 2 points, draw = 1 point, lose = 0 points");

        boolean programWorking = true;
        GameMechanics gameMechanics = new GameMechanics();

    public void randomChoice() {
            List<String> list = Arrays.asList("Rock", "Paper", "Scissors");
            Random random = new Random();
            int indexList = random.nextInt(list.size());
            String getEnemyChoice = list.get(indexList);
        }


        while(programWorking) {



            System.out.println("Choose your number:");
            System.out.println("1. Rock");
            System.out.println("2. Paper");
            System.out.println("3. Scissors");
            System.out.println("4. Show the game results");
            System.out.println("5. Exit game");

            int userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1 -> gameMechanics.rock();
                case 2 -> gameMechanics.paper();
                case 3 -> gameMechanics.scissors();
                case 4 -> gameMechanics.score();
                case 5 -> programWorking = false;
                default -> System.out.println("Choose valid number");

            }
        }


    }
}
