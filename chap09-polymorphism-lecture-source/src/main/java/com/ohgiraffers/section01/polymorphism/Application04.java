package com.ohgiraffers.section01.polymorphism;

public class Application04 {

    public static void main(String[] args) {

        /* 수업목표. 다형성을 적용해서 리턴타입에 활용할 수 있다. */

        /* 목차. 랜던동물() 메소드 추가 */

        /* 목차. 1. 랜덤동물() 호출 */
        Application04 app4 = new Application04();

        동물 randomAnimal = app4.랜덤동물();      //  동물 random = new 토끼();

        randomAnimal.울기();

    }

    public 동물 랜덤동물( ) {                 // 동물에서~하므로 리턴타입도 동물로!!

        int 랜덤 = (int)(Math.random() * 2 ) + 0;  // 숫자를 2개만 쓸 것이다. 2개의 값(0,1)만 불러올 것이다.(시작값은 0으로 시작~)/ 0은 최소값

        return 랜덤 == 0 ? new 토끼() : new 호랑이();          // 연사자식 다시 나왔따~~

        // *결론:  하위 클래스가 상위클래스 (상속) 에 속하기 때문에 다형성이 적용된다.

    }

}
