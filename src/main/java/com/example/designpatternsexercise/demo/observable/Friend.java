package com.example.designpatternsexercise.demo.observable;

public class Friend implements Observer {
    private String name;

    public Friend(String name) {
        this.name = name;
    }

    @Override
    public void update(String name, String message) {
        System.out.println("【" + this.name + "】看到【" + name + "】 发的朋友圈:" + message);
    }
}
