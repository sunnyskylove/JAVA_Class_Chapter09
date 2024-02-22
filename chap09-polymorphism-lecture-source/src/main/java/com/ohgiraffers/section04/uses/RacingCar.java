package com.ohgiraffers.section04.uses;

public class RacingCar extends Car {            //상속을 강제화시킨다(alt+enter>enter~ >>override)


    @Override
    public void go() {
        System.out.println("레이싱카가 달려갑니다..");
    }

    @Override
    public void stop() {
        System.out.println("레이싱카가 멈춥니다.");

    }
}
