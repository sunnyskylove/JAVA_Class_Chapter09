package com.ohgiraffers.section05;

public class Student extends Person {

    protected int grade;
    protected String major;


    public Student (String name, int age, double height, double weight) {

        super(name,age,height,weight);

        this.grade = grade;
        this.major = major;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
