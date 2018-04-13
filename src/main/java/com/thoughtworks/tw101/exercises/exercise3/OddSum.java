package com.thoughtworks.tw101.exercises.exercise3;

public class OddSum {

    public int of(int start, int end) {
        int sumOfOddNumbers = 0;
        for (int i = start; i < end + 1; i++) {
            if (i % 2 != 0){
                sumOfOddNumbers += i;
            }
        }
        return sumOfOddNumbers;
    }
}