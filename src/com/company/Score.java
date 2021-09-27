package com.company;

import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        displayHighScorePosition();
    }

    public static void displayHighScorePosition() {
        Scanner input = new Scanner(System.in);
        System.out.println("Name of player:");
        String name = input.next();
        System.out.println("Score of player:");
        int score = input.nextInt();
        System.out.println(name + " managed to get into positon " + calculateHighScorePosition((1500)) + " on the high score table");
        /// line 16 is my trouble, how can I refer Method calculateHighScorePosition to get 1, 2, 3, 4. I know, I can write score in scopes, but want via terminal entry
    }

    public static int calculateHighScorePosition(int score) {

        if (score >= 1000) {
            return 1;
        }
        if (score >= 500 && score < 1000) {
            return 2;
        }
        if (score >= 100 && score < 500) {
            return 3;
        } else {
            return 4;
        }

    }
}



