package com.example.designpatternsexercise.demo.observable;

import java.util.LinkedList;
import java.util.List;

public class User implements Observable {
    private List<Observer> friends;
    private String name;

    public User(String name) {
        this.name = name;
        this.friends = new LinkedList<>();
    }

    public void sendMessage(String message) {
        this.notifyObservers(message);
    }

    @Override
    public void addObserver(Observer observer) {
        this.friends.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.friends.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        this.friends.forEach(friend -> {
            friend.update(this.name, message);
        });
    }
}
