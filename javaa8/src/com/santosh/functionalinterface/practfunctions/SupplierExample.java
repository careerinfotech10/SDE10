package com.santosh.functionalinterface.practfunctions;

import java.util.function.Supplier;

public class SupplierExample {

 static    Supplier<String> giveNames=()-> "sagar";

    public static void main(String[] args) {
        giveNames.get();
    }
}
