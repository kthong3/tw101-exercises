package com.thoughtworks.tw101.exercises.exercise1;

// Exercise #1: Print all odd numbers from 1 to 100 and their sum.

public class Main {
    public static void main(String[] args) {
        int sumOfOddNumbers = 0;

        for (int i = 1; i < 101; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                sumOfOddNumbers += i;
            }
        }
        System.out.println(sumOfOddNumbers);
    }
}
