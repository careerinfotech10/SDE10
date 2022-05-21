package com.santosh.collectionsfam.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountryListExample {

    public static void main(String[] args) {
        List<Coutry> coutryList = Arrays.asList(new Coutry("uk", 20000),
                new Coutry("ind", 20001),
                new Coutry("au", 40002),
                new Coutry("srl", 50003),
                new Coutry("ind", 20004));

        Comparator<Coutry> comparator = (country1,country2)-> country1.getCountryCode().compareToIgnoreCase(country2.getCountryCode());
        List<Coutry> coutryList1 = coutryList.stream()
//                .filter(p -> p.getPopulations() > 40002)
                .sorted(comparator)
                .collect(Collectors.toList());

        coutryList1.forEach(System.out::println);
    }
}
