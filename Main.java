package com.company;

import java.util.Random;
import java.util.Scanner;
/*
 * Create a program that will randomly select two numbers from 1-6
 * (like rolling two dice). Show the dice rolls.
 * You should also show the running score.
 * Prompt the user to either roll again or lose their turn.
 * A player scores the sum of the two dice thrown and
 * gradually reaches a higher score as they continue to roll.
 * If a single number 1 is thrown on either die,
 * the score for that whole turn is lost.
 * However a double 1 counts as 25.
 * When you reach a score of 100 (or more) the game ends.
 */
public class Main {

    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        // Friday Challenge Dice Game Pig
        System.out.println("Welcome! Lets Play Roll Dice!");

        // Code Starts Here
        for (int i = 0; i<=6;i++){
            //  int x = 1 + r.nextInt(10);
            int score = 0;
            boolean response = true;
            int num1 = 1 + r.nextInt(6);
            int num2 = 1 + r.nextInt(6);
            System.out.println("Your rolls " + num1 + " & " + num2);
            System.out.println("Score: " + score);
            System.out.println("Roll again?");
            System.out.println();
        }





       // System.out.println(response);

        // Roll Random Dice Face
/*
        for (int i=0;i<20;i++){
            int day = r.nextInt(7);
            switch(day) {
                case 0:
                    System.out.println("Your rolls " + num1 + "&" + num2);
                    System.out.println("Score: " + score);
                    System.out.println("Roll again?");
                    System.in.println(response);
            }
        }
*/

    }
}
