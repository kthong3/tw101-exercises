package com.thoughtworks.tw101.exercises.exercise1;

// Exercise #1: Print all odd numbers from 1 to 100 and their sum.

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
//        Integer sum = 0;
//        for (int i = 0; i < 101; i++) {
//            if (i % 2 != 0){
//                System.out.println(i);
//                sum += i;
//            }
//        }
//        System.out.println(sum);

        int [] intArray = IntStream.range(0, 100).toArray();
        intArray = Arrays.stream(intArray).filter(x -> x % 2 != 0).toArray();
        for(int i : intArray){
            System.out.println(i);
        }

        Integer sum = Arrays.stream(intArray).reduce(0, Integer::sum);
        System.out.println(sum);
    }
}
