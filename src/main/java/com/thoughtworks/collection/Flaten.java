package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Flaten {

    Integer[][] array;
    public Flaten(Integer[][] array) {
        this.array = array;
    }

    public List<Integer> transformToOneDimesional() {

        List<Integer> oneDArray = new ArrayList<>();

        for(int i = 0; i<array.length; i++)
        {
            for(int j = 0; j< array[i].length; j++)
            {
                oneDArray.add(array[i][j]);
            }
        }

        return oneDArray;
//        throw new NotImplementedException();
    }

    public List<Integer> transformToUnrepeatedOneDimesional() {
        List<Integer> oneDArray = new ArrayList<>();

        for(int i = 0; i<array.length; i++)
        {
            for(int j = 0; j< array[i].length; j++)
            {
                oneDArray.add(array[i][j]);
            }
        }

        return oneDArray.stream().distinct().collect(Collectors.toList());
    }
}
