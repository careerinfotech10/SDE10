package com.santosh.collectionsfam.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class InternalHashMapExample {


    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();//Creating HashMap

        map.put(10, "Mango");  //Put elements in Map
        map.put(21, "Apple");
        map.put(13, "Banana");
        map.put(94, "Grapes");
        sortingUsingKey(map);
//        System.out.println("Iterating Hashmap...");
//        for (Map.Entry m : map.entrySet()) {
//            System.out.println(m.getKey() + " " + m.getValue());
//        }
    }

    public static void sortingUsingKey(Map<Integer, String> map){

        System.out.println("before sorting ");
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey() +"  "+m.getValue());
        }


        System.out.println("After Sorting keys ");
        TreeMap<Integer,String> treeMap=new TreeMap<>(map);
        for(Map.Entry n:treeMap.entrySet()){
            System.out.println(n.getKey() +"  "+n.getValue());
        }

    }
}

