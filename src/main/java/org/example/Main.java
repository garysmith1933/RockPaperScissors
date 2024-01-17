package org.example;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userChoice;
        HashMap<String, String> rps = new HashMap<>();
        rps.put("r", "s");
        rps.put("s", "p");
        rps.put("p", "r");

        char[] compChoices = { 'r', 'p', 's' };

        while (true) {
            System.out.println("Welcome to the Rock Paper Scissor Game!");
            System.out.print("Please choose r, p , or s");

            int compChoiceIdx = new Random().nextInt(compChoices.length);
            char compChoice = compChoices[compChoiceIdx];

            userChoice = scnr.nextLine();

            if (rps.containsKey(userChoice)) {
                break;
            }
        }
    }
}