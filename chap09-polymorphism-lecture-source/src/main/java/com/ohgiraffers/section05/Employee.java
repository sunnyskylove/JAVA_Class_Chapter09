package com.ohgiraffers.section05;

public class Employee extends Person {

    protected int salary;
    protected String dept;

    public Employee (String name, int age, int height, int weight){

        super(name,age,height,weight);
        this.salary = salary;
        this.dept = dept;

    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}
