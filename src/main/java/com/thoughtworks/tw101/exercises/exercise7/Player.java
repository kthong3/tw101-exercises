package com.thoughtworks.tw101.exercises.exercise7;

public class Player {
    public int guess;

    public Player(){}

    public void gamePrompt(){
        System.out.println("choose a random number between 1 and 100");
    }

    public void guessedNumber(int number) {
        this.guess = number;
        System.out.println("you entered " + this.guess);
    }

    public void guessTooHigh(){
        System.out.println("you guessed too high. guess lower");
    }

    public void guessTooLow() {
        System.out.println("you guessed too low. guess higher");
    }

    public void winner(){
        System.out.println("you win!");
    }
}
