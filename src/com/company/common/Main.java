package com.company.common;

import java.util.Comparator;

public class Main {
    //Comparable
    //Comparator
    public static void main(String[] args) {

    }
}

class Person implements Comparable<Person> {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Person o) {
        //equal = 0
        //this bigger = positive int
        //this smaller = negative int
        return o.getName().compareTo(this.getName());
    }
}

class PersonComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        //equal = 0
        //o1 bigger = positive
        //o2 bigger = negative
        return 0;
    }
}
