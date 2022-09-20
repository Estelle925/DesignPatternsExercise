package com.example.designpatternsexercise.demo.mediator;

import java.util.Arrays;

public class MediatorTest {
    public static void main(String[] args) {
        System.out.println("小明想要看小区房和农民房");
        Tenant2 xiaoMing = new Tenant2("小明",
                Arrays.asList("XiaoQuFang", "NongMinFang"));
        xiaoMing.lookAtHouse();
    }
}
