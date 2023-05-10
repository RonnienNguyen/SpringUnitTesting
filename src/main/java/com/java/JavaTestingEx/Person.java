package com.java.JavaTestingEx;


public class Person {
    private String name;
    private String national;
    private Integer id;

    public int getPay(){
        int numday = 20;
        int salaryPerDay = 40;
        int payment = numday * salaryPerDay;
        return payment;
    }

    public String getName(){
        return name;
    }

}
