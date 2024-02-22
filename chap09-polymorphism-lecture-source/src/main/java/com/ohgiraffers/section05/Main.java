package com.ohgiraffers.section05;

public class Main {
    public static void main(String[] args) {

        // 3명의 학생 정보 기록할 수 있게 객체 배열 할당 : student
        // 위의 사용 데이터 참고해서 3명의 학생 정보 초기화
        // 위의 학생 정보 모두 출력


        Person[] student1 = new Person[3];
        student1[0] = new Person("홍길동", 20, 172.2, 70);
        student1[0] = new Person("김말똥", 21, 187.3, 80);
        student1[0] = new Person("강개순", 23, 167.0, 45);


    }
public class student {
    private String name;
    private int age;
    private double height;
    private static double weight;

}



}





