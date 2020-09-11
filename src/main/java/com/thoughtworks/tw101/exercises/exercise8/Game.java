package com.thoughtworks.tw101.exercises.exercise8;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private Scanner scanner;
    private int randomNumber;

    public void start(){
        this.scanner = new Scanner(System.in);
        Player player = new Player();
        player.prompt();
        generateRandomNum();

        while (player.currentGuess != randomNumber){
            playerGuess(player);
            compareNumbers(player);
        }
    }

    private void generateRandomNum(){
        Random rand = new Random();
        this.randomNumber = rand.nextInt(100);
    }

    private void playerGuess(Player player){
        int number = this.scanner.nextInt();
        player.guessedNumber(number);
    }

    private void compareNumbers(Player player){
        if (player.currentGuess > this.randomNumber) {
            player.guessTooHigh();
        } else if (player.currentGuess < this.randomNumber) {
            player.guessTooLow();
        } else {
            player.winner();
            this.scanner.close();
        }
    }
}
