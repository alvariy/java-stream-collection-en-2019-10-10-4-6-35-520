package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {

        List<Integer> range;

        if(left < right) {
            range = IntStream.rangeClosed(left,right).boxed().collect(Collectors.toList());
        }
        else
        {
            range = IntStream.rangeClosed(right,left).boxed().collect(Collectors.toList());
            Collections.reverse(range);
        }
        return range;
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        List<Integer> range;

        if(left < right) {
            range = IntStream.rangeClosed(left,right).boxed().collect(Collectors.toList());
        }
        else
        {
            range = IntStream.rangeClosed(right,left).boxed().collect(Collectors.toList());
            Collections.reverse(range);
        }
        return range.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
    }

    public List<Integer> popEvenElments(int[] array) {

        List<Integer> evenNumbers = Arrays.stream(array).boxed().collect(Collectors.toList());

        return evenNumbers.stream().filter(number -> number % 2 == 0).collect(Collectors.toList());

    }

    public int popLastElment(int[] array) {

        return array[array.length-1];

    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {

        List<Integer> firstList = Arrays.stream(firstArray).boxed().collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(secondArray).boxed().collect(Collectors.toList());

        return firstList.stream().filter(secondList::contains).collect(Collectors.toList());

//        throw new NotImplementedException();
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {

        List<Integer> firstList = new ArrayList<>();
        List<Integer> secondList = new ArrayList<>();

        Collections.addAll(firstList,firstArray);
        Collections.addAll(secondList,secondArray);

        List<Integer> filteredList = secondList.stream().filter(n -> !firstList.contains(n)).collect(Collectors.toList());

        firstList.addAll(filteredList);
        return firstList;
    }
}
