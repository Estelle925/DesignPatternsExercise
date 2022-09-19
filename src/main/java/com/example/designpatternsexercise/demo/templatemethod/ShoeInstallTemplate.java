package com.example.designpatternsexercise.demo.templatemethod;

public abstract class ShoeInstallTemplate {
    String name;

    public ShoeInstallTemplate(String name) {
        this.name = name;
    }

    public abstract void installSole();

    public abstract void installInsole();

    public abstract void installVamp();

    public abstract void installShoelace();

    public void installShot() {
        System.out.println("组装一双"+name+"鞋，步骤如下:");
        // 组装鞋底
        installSole();
        // 组装鞋垫
        installInsole();
        // 组装鞋面
        installVamp();
        // 组装鞋带
        installShoelace();
    }
}
