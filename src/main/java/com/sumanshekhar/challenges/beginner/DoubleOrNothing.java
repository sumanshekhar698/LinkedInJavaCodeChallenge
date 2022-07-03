package com.sumanshekhar.challenges.beginner;


import java.util.Random;
import java.util.Scanner;

/*
Traditionally, double or nothing is about doubling or canceling out a debt.
But this challenge will work a little differently.
A user will start off with 10 points and throughout the game,
the user has the option to take a chance to double their points.
Or, walk away with their current point value.
f the user decides to gamble their points in the chance of doubling,
the program should use randomness to decide whether the points get doubled or the user loses it all.
*/
public class DoubleOrNothing {
    private final Scanner sc = new Scanner(System.in);
    private final Random random = new Random();
    private int startPoints = 10;

    private int current = startPoints;
    private boolean isStillPlaying = true;

    public static void main(String[] args) {

        DoubleOrNothing doubleOrNothing = new DoubleOrNothing();
        doubleOrNothing.playGame();
    }


    public DoubleOrNothing(int startPoints) {
        this.startPoints = startPoints;
    }

    public DoubleOrNothing() {

    }

    private void playGame() {
        printWelcome();
        askUserToContinue();

        while(this.isStillPlaying) {
            printTryToDouble();

            if (shouldDouble()) {
                doubleCurrent();
                printCongrats();
                askUserToContinue();
            } else {
                printLost();
                return;
            }
        }

        printWalkawayMessage();

    }

    private void printWelcome(){
        System.out.println("Lets play >>> 🤑 DOUBLE 😼 OR NOTHING 💀 \n"+
                "We'll start you off with " + this.startPoints +
                " points\n");
    }

    private void printTryToDouble() {
        System.out.println("Let's try to double it!");
    }

    private void printCongrats() {
        System.out.println("Congrats! You now have " +
                this.current+ " points \n");
    }

    private void printLost() {
        System.out.println("Uh oh. You've lost. " +
                "No points for you");
    }

    private void printWalkawayMessage() {
        System.out.println("Congrats! You finish with " +
                this.current + " points");
    }

//    we use the random instance to generate a number that's either zero or one.
//    If the number is zero, we returned true. Otherwise false.
//    This helps us keep our randomness around 50%.
    private boolean shouldDouble() {
        return this.random.nextInt(2) == 0;
    }

    private void doubleCurrent() {
        this.current = this.current * 2;
    }

    protected void askUserToContinue() {
        System.out.println("Would you like to continue and try to double your winnings? Enter YES to continue");
        this.isStillPlaying = this.sc.nextLine().equalsIgnoreCase("YES");
//        this.isStillPlaying = this.sc.nextLine().toUpperCase().equals("YES");
    }

    protected boolean getIsStillPlaying() {
        return this.isStillPlaying;
    }
}
