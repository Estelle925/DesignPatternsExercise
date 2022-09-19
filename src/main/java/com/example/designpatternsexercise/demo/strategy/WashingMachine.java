package com.example.designpatternsexercise.demo.strategy;

public class WashingMachine {
    private WashingStrategy washingStrategy;

    public WashingMachine(WashingStrategy washingStrategy) {
        this.washingStrategy = washingStrategy;
    }

    public void washingClothes() {
        this.washingStrategy.washing();
    }
}
