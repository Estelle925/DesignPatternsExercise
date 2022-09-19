package com.example.designpatternsexercise.demo.strategy;

public class WashingFactory {
    public static WashingStrategy getWashingStrategy(String type) {
        if ("Quick".equals(type)) {
            return new QuickWashingStrategy();
        }
        if ("BigClothes".equals(type)) {
            return new BigClothesWashingStrategy();
        }
        if ("Soft".equals(type)) {
            return new SoftWashingStrategy();
        }
        return new StandardWashingStrategy();
    }
}
