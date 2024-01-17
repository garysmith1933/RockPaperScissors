package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userChoice;
        String compChoice;
        boolean gameOver = false;
        HashMap<String, String> rps = new HashMap<>();
        rps.put("r", "s");
        rps.put("s", "p");
        rps.put("p", "r");

        String[] compChoices = { "r", "p", "s" };

        while (true) {
            System.out.println("Welcome to the Rock Paper Scissor Game!");
            System.out.print("Please choose r, p, or s");

            int compChoiceIdx = new Random().nextInt(compChoices.length);
            compChoice = compChoices[compChoiceIdx];

            userChoice = scnr.nextLine();

            if (rps.containsKey(userChoice)) {
                break;
            }
        }

        //Draw

        //User wins
        for ( Map.Entry<String, String> entry : rps.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();

            if (!Objects.equals(userChoice, key)) {
                continue;
            }

            if (Objects.equals(compChoice, value)) {
                System.out.println("You win! " + userChoice + "beats " + compChoice);
                gameOver = true;
            }
        }

        //Comp Wins
        if (!gameOver) {
            System.out.println("You Lose! " + compChoice + "beats " + userChoice);
            gameOver = true;
        }

    }
}