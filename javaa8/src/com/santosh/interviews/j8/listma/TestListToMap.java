package com.santosh.interviews.j8.listma;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestListToMap {


    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Delhi",
                "Haryana",
                "Chennai",
                "Mysore",
                "Delhi",
                "Chennai");


        Function<String, String> km=(inp)-> inp.toUpperCase();
        Function<String, Integer> vm = (inp)->inp.length();
        Map<String, Integer> stringIntegerMap = stringList
                .stream()
                .filter(str -> str.length() > 5)
                .distinct()
                .collect(Collectors.toMap(km,vm));
                stringIntegerMap.forEach((k,v)-> System.out.println(k+"  "+v));

    }
}
