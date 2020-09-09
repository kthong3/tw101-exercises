package com.thoughtworks.tw101.exercises.exercise2;

public class Accumulator {
    private Integer count;

    public Accumulator() {
        this.count = 0;
    }

    public void total() {
        System.out.println(this.count);
    }

    public Integer increment() {
        return this.count++;
    }
}
