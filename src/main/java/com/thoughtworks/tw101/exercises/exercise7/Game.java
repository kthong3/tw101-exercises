package com.thoughtworks.tw101.exercises.exercise7;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private Scanner scanner;
    private int randomNumber;

    public Game(){
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        Player player = new Player();
        player.gamePrompt();
        generateRandomNumber();

        while (player.guess != randomNumber) {
            createGuess(player);
            checkRandomNumber(player);
        }
    }
    public void generateRandomNumber(){
        Random rand = new Random();
        this.randomNumber = rand.nextInt(100);
    }

    public void createGuess(Player player){
            int number = this.scanner.nextInt();
            player.guessedNumber(number);
    }

    public void checkRandomNumber(Player player) {
        if (player.guess > this.randomNumber) {
            player.guessTooHigh();
        } else if (player.guess < this.randomNumber) {
            player.guessTooLow();
        } else {
            player.winner();
            this.scanner.close();
        }
    }
}
