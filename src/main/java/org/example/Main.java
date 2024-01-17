package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userChoice;
        String compChoice;
        boolean gameOver = false;
        HashMap<String, String> rps = new HashMap<>();
        rps.put("Rock", "Scissors");
        rps.put("Scissors", "Paper");
        rps.put("Paper", "Rock");

        String[] compChoices = { "Rock", "Paper", "Scissors" };

        do {
            System.out.println("Welcome to the Rock Paper Scissor Game!");
            System.out.print("Please choose Rock, Paper, or Scissors ");

            int compChoiceIdx = new Random().nextInt(compChoices.length);
            compChoice = compChoices[compChoiceIdx];

            userChoice = scnr.nextLine();

        } while (!rps.containsKey(userChoice));

        //Draw
        if (Objects.equals(userChoice, compChoice)) {
            System.out.println("Its a draw! " + userChoice + " is the same as " + compChoice);
            gameOver = true;
        }

        //User wins
        for ( Map.Entry<String, String> entry : rps.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();

            if (!Objects.equals(userChoice, key)) {
                continue;
            }

            if (Objects.equals(compChoice, value)) {
                System.out.println("You win! " + userChoice + " beats " + compChoice);
                gameOver = true;
            }
        }

        //Comp Wins
        if (!gameOver) {
            System.out.println("You Lose! " + compChoice + " beats " + userChoice);
            gameOver = true;
        }

    }
}