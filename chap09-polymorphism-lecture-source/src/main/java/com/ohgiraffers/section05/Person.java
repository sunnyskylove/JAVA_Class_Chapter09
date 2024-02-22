package com.ohgiraffers.section05;

public class Person {

    protected String name;
    protected int age;
    protected double height;
    protected double weight;

    public Person(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;

        System.out.println(name + " 은 " + age + " 살의 " + height + " cm , " + weight + " kg 입니다.");

    }

}