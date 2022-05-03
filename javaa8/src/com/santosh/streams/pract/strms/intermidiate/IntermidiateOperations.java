package com.santosh.streams.pract.strms.intermidiate;

import com.santosh.functionalinterface.practfunctions.Inter;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class IntermidiateOperations {


    static  BinaryOperator<Integer> bo1=(x,y)->  x+y;

    public static void main(String[] args) {
reduceExample();
    }

    public  static void reduceExample(){

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6);


        Optional<Integer> integer = integers.stream()
                .reduce((x,y)->  x+y);
        System.out.println(integer);

    }
}
