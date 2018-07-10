package com.thoughtworks.tw101.exercises.exercise2;

public class Accumulator {
    int count = 0;

    public int increment() {
        return count++;
    }

    public void total() {
        System.out.println(count);
    }
}
