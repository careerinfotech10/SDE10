package com.santosh.collectionsfam.sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortEmployeeList {

    public static void main(String[] args) {

        Employee emp=new Employee();
        List<Employee> employees=new ArrayList<>();


        Comparator<Employee> sortyByName=(emp1,emp2)->emp1.getName().compareTo(emp2.getName());
        employees
        .stream()
        .sorted(sortyByName);
    }


}
