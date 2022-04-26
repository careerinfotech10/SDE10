package com.santosh.functionalinterface.practfunctions;

public class MethodReferance {

    //instance method referance

    //classname::method name
//static method referance
    //constructor referacne

    public static void main(String[] args) {

        Employee emp=new Employee();
        Inter intr=emp::show;

        Inter intcr=Employee::new;

        intcr.display("i am constructor");

//        intr.display("wow");

    }
}
