package com.thoughtworks.tw101.exercises.exercise8;

import java.util.ArrayList;

public class Player {
    private ArrayList<Integer> guesses;
    public int currentGuess;

    public Player(){
        this.guesses = new ArrayList<>();
    }

    public void prompt(){
        System.out.println("guess a number between 1 and 100");
    }

    public void guessedNumber(int number){
        this.currentGuess = number;
        this.guesses.add(number);
        System.out.println("you guessed " + this.currentGuess);
    }

    public void guessTooLow(){
        System.out.println("your guess was too low, guess higher");
    }

    public void guessTooHigh(){
        System.out.println("your guess was too high, guess lower");
    }

    public void winner(){
        System.out.println("wowowow you win!");

        System.out.println("you guessed " + this.guesses.size() + " times! these were your all of your guesses:");
        for (int guess: this.guesses) {
            System.out.println(guess);
        }
    }
}
