package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class InverseReduce {

    private Random random = new Random();

    public InverseReduce() {}

    public InverseReduce(Random random) {
        this.random = random;
    }

    public List<Integer> divideToSmaller(int number) {

        List<Integer> smallerNumbers = new ArrayList<>();

        for(int i = number-2; i>= 1; i = i-2)
        {
            smallerNumbers.add(i);
        }
        return smallerNumbers;
    }
}
