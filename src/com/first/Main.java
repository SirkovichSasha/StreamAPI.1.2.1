package com.first;

import java.util.*;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Main {


    public static void main(String[] args) {
        List<Integer>intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer>temp=new ArrayList<>();
        Predicate<Integer> isNegativ = x -> x <0;
        Predicate<Integer> notEven = x -> x % 2 >0;

        for (Iterator<Integer> iterator = intList.iterator(); iterator.hasNext();) {
            Integer number = iterator.next();
                temp.add(number);
        }
        temp.removeIf(isNegativ);
        temp.removeIf(notEven);
        Collections.sort(temp);
        System.out.println(temp);

    }
}
