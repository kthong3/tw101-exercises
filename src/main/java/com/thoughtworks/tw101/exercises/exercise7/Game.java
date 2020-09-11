package com.thoughtworks.tw101.exercises.exercise7;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private Scanner scanner;
    private int randomNumber;
    private int guess;

    public Game(){
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        generateRandomNumber();
        System.out.println("choose a random number between 1 and 100");

        while (guess != randomNumber) {
            createGuess();
            checkRandomNumber();
        }
    }
    public void generateRandomNumber(){
        Random rand = new Random();
        this.randomNumber = rand.nextInt(100);
    }

    public void createGuess(){
            int number = this.scanner.nextInt();
            this.guess = number;
        System.out.println("you entered " + this.guess);
    }

    public void checkRandomNumber() {
        if (this.guess > this.randomNumber) {
            System.out.println("you guessed too high. guess lower");
        } else if (this.guess < this.randomNumber) {
            System.out.println("you guessed too low. guess higher");
        } else {
            System.out.println("you win!");
            this.scanner.close();
        }
    }
}
