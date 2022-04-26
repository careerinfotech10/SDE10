package com.santosh.functionalinterface.practfunctions;

public class Employee {

    private  String name;

    public Employee(String name) {
        this.name = name;

        System.out.println("this is constructore"+name
        );
    }

    public Employee() {
    }

    void show(String name){

        System.out.println("i m show :: "+name);

    }
}
